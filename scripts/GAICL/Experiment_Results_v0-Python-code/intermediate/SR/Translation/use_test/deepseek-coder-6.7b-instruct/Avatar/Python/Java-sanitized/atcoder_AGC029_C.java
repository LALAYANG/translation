import java.util.*;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        A = Arrays.copyOf(A, 1 + (int) Arrays.stream(A).filter(i -> i >= A[0]).count());
        int N = A.length;
        System.out.println(bis(0, N));
    }

    static boolean Func_is_possible_0(int K, int[] A) {
        ArrayList<Pair> dp = new ArrayList<>();
        dp.add(new Pair(A[0], 0));
        for (int a : A) {
            if (a <= dp.get(dp.size() - 1).x) {
                dp = (ArrayList<Pair>) Func_cut_0(dp, a).clone();
            } else {
                dp.add(new Pair(a, 0));
            }
            boolean is_added = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j).y < K - 1) {
                    dp = (ArrayList<Pair>) Func_cut_0(dp, dp.get(j).x - 1).clone();
                    dp.add(new Pair(dp.get(j).x, dp.get(j).y + 1));
                    if (dp.get(dp.size() - 1).x < a) {
                        dp.add(new Pair(a, 0));
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

    static ArrayList<Pair> Func_cut_0(ArrayList<Pair> array, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= array.get(0).x) {
            ArrayList<Pair> res = new ArrayList<>();
            res.add(new Pair(index, array.get(0).y));
            return res;
        }
        int inner_limit = 795;
        int outer_limit = 794;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_limit / outer_limit; LoopIndexOut++) {
            for (int i = array.size() - 1; i > 0; i--) {
                if (array.get(i - 1).x < index) {
                    ArrayList<Pair> res = new ArrayList<>(array.subList(0, i));
                    res.add(new Pair(index, array.get(i).y));
                    return res;
                }
            }
        }
        return array;
    }

    static int bis(int x, int y, int[] A) {
        if (y == x + 1) {
            return y;
        } else if (Func_is_possible_0((x + y) / 2, A)) {
            return bis(x, (x + y) / 2, A);
        } else {
            return bis((x + y) / 2, y, A);
        }
    }

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}