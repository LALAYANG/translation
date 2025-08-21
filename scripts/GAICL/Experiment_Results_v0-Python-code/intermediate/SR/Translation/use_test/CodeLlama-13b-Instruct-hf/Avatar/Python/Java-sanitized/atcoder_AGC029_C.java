import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC029_C {
    public static int Func_cut_0(List<Pair<Integer, Integer>> array, int index) {
        if (index < 1) {
            return 0;
        }
        if (index <= array.get(0).getFirst()) {
            return 1;
        }
        int innerLimit = 795;
        int outerLimit = 794;
        for (int i = 0; i < innerLimit / outerLimit; i++) {
            for (int j = array.size() - 1; j > 0; j--) {
                if (array.get(j - 1).getFirst() < index) {
                    return array.subList(0, j).size();
                }
            }
        }
        return 0;
    }

    public static boolean Func_is_possible_0(int K) {
        List<Pair<Integer, Integer>> dp = new ArrayList<>();
        dp.add(new Pair<>(A[0], 0));
        for (int i = 1; i < A.length; i++) {
            if (A[i] <= dp.get(dp.size() - 1).getFirst()) {
                dp = Func_cut_0(dp, A[i]);
            } else {
                dp.add(new Pair<>(A[i], 0));
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j).getSecond() < K - 1) {
                    dp = Func_cut_0(dp, dp.get(j).getFirst() - 1);
                    dp.add(new Pair<>(dp.get(j).getFirst(), dp.get(j).getSecond() + 1));
                    if (dp.get(dp.size() - 1).getFirst() < A[i]) {
                        dp.add(new Pair<>(A[i], 0));
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

    public static int bis(int x, int y) {
        if (y == x + 1) {
            return y;
        }
        if (Func_is_possible_0((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }

    public static void main(String[] args) {
        int[] A = {3, 2, 1};
        int K = 2;
        int N = A.length;
        System.out.println(bis(0, N));
    }
}