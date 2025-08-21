import java.util.ArrayList;
import java.util.List;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        int[] A = {3, 2, 1};
        int N = A.length;

        List<Integer> dp = new ArrayList<>();
        dp.add(A[0]);
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp.get(dp.size() - 1)) {
                dp = cut(dp, A[i]);
            } else {
                dp.add(A[i]);
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j) < K - 1) {
                    dp = cut(dp, dp.get(j) - 1);
                    dp.add(A[i]);
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

    public static List<Integer> cut(List<Integer> dp, int index) {
        if (index < 1) {
            return new ArrayList<>();
        }
        if (index <= dp.get(0)) {
            return new ArrayList<>(Arrays.asList(index, dp.get(0)));
        }
        int innerLimit = 795;
        int outerLimit = 794;
        for (int loopIndexOut = 0; loopIndexOut < innerLimit / outerLimit; loopIndexOut++) {
            for (int i = dp.size() - 1; i >= 0; i--) {
                if (dp.get(i) < index) {
                    return new ArrayList<>(Arrays.asList(index, dp.get(i)));
                }
            }
        }
        return new ArrayList<>();
    }

    public static boolean isPossible(int K) {
        int[] A = {3, 2, 1};
        int N = A.length;

        List<Integer> dp = new ArrayList<>();
        dp.add(A[0]);
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp.get(dp.size() - 1)) {
                dp = cut(dp, A[i]);
            } else {
                dp.add(A[i]);
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j) < K - 1) {
                    dp = cut(dp, dp.get(j) - 1);
                    dp.add(A[i]);
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
        if (isPossible((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }
}