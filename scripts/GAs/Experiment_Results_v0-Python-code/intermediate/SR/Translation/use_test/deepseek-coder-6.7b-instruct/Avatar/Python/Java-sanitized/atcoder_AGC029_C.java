import java.util.*;

public class atcoder_AGC029_C {
    private static int[] A;
    private static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(bis(0, N));
    }

    private static boolean Func_is_possible_0(int K) {
        ArrayList<int[]> dp = new ArrayList<>();
        dp.add(new int[]{A[0], 0});
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp.get(dp.size() - 1)[0]) {
                dp = (ArrayList<int[]>) Func_cut_0(dp, A[i]).clone();
            } else {
                dp.add(new int[]{A[i], 0});
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j)[1] < K - 1) {
                    dp = (ArrayList<int[]>) Func_cut_0(dp, dp.get(j)[0] - 1).clone();
                    dp.add(new int[]{dp.get(j)[0], dp.get(j)[1] + 1});
                    if (dp.get(dp.size() - 1)[0] < A[i]) {
                        dp.add(new int[]{A[i], 0});
                    }
                    isAdded = true;
                    break;
                }
            }
            if (!isAdded) {
                return false;
            }
        }
        return true;
    }

    private static ArrayList<int[]> Func_cut_0(ArrayList<int[]> array, int index) {
        ArrayList<int[]> result = new ArrayList<>();
        if (index < 1) {
            return result;
        }
        if (index <= array.get(0)[0]) {
            result.add(new int[]{index, array.get(0)[1]});
            return result;
        }
        int innerLimit = 795;
        int outerLimit = 794;
        for (int loopIndexOut = 0; loopIndexOut < innerLimit / outerLimit; loopIndexOut++) {
            for (int i = array.size() - 1; i > 0; i--) {
                if (array.get(i - 1)[0] < index) {
                    result.addAll(array.subList(0, i));
                    result.add(new int[]{index, array.get(i)[1]});
                    return result;
                }
            }
        }
        return result;
    }

    private static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        } else if (Func_is_possible_0((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }
}