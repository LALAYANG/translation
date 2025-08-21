import java.util.*;

public class atcoder_AGC029_C {
    static int[] sorted_array;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        sorted_array = new int[N];
        for (int i = 0; i < N; i++) {
            sorted_array[i] = scanner.nextInt();
        }
        System.out.println(bis(0, N));
    }

    static ArrayList<int[]> split_array(ArrayList<int[]> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0)[0]) {
            int[] temp = {index, array.get(0)[1]};
            ArrayList<int[]> result = new ArrayList<>();
            result.add(temp);
            return result;
        }
        for (int i = 0; i < array.size() - 1; i++) {
            if (array.get(i)[0] < index) {
                int[] temp = {index, array.get(i)[1]};
                ArrayList<int[]> result = new ArrayList<>(array.subList(0, i + 1));
                result.add(temp);
                return result;
            }
        }
        return new ArrayList<>();
    }

    static boolean is_possible(int K) {
        ArrayList<int[]> dp = new ArrayList<>();
        dp.add(new int[]{sorted_array[0], 0});
        for (int a : sorted_array) {
            if (a <= dp.get(dp.size() - 1)[0]) {
                dp = split_array(dp, a);
            } else {
                dp.add(new int[]{a, 0});
            }
            boolean is_added = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j)[1] < K - 1) {
                    dp = split_array(dp, dp.get(j)[0] - 1);
                    dp.add(new int[]{dp.get(j)[0], dp.get(j)[1] + 1});
                    if (dp.get(dp.size() - 1)[0] < a) {
                        dp.add(new int[]{a, 0});
                    }
                    is_added = true;
                    break;
                }
            }
            if (!is_added) {
                return false;
            }
        }
        return true;
    }

    static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        } else if (is_possible((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }
}