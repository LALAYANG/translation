import java.util.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(bis(0, n, A));
    }

    public static int bis(int x, int y, int[] A) {
        if (y == x + 1) {
            return y;
        } else if (Func_is_possible_0((x + y) / 2, A)) {
            return bis(x, (x + y) / 2, A);
        } else {
            return bis((x + y) / 2, y, A);
        }
    }

    public static boolean Func_is_possible_0(int K, int[] A) {
        List<int[]> dp = new ArrayList<>();
        dp.add(new int[]{A[0], 0});
        for (int a : A) {
            if (a <= dp.get(dp.size() - 1)[0]) {
                dp = Func_cut_0(dp, a);
            } else {
                dp.add(new int[]{a, 0});
            }
            boolean is_added = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j)[1] < K - 1) {
                    dp = Func_cut_0(dp, dp.get(j)[0] - 1);
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

    public static List<int[]> Func_cut_0(List<int[]> array, int index) {
        if (index < array.get(0)[0]) {
            return new ArrayList<>();
        }
        int inner_limit = 795;
        int outer_limit = 794;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_limit / outer_limit; LoopIndexOut++) {
            for (int i = array.size() - 1; i > 0; i--) {
                if (array.get(i - 1)[0] < index) {
                    List<int[]> result = new ArrayList<>(array.subList(0, i));
                    result.add(new int[]{index, array.get(i)[1]});
                    return result;
                }
            }
        }
        return array;
    }
}