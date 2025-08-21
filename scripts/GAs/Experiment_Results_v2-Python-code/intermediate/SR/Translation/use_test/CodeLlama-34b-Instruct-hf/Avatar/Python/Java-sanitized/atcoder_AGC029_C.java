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
                dp = cutArray(dp, A[i]);
            } else {
                dp.add(A[i]);
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j) < A[i] - 1) {
                    dp = cutArray(dp, dp.get(j) + 1);
                    if (dp.get(dp.size() - 1) < A[i]) {
                        dp.add(A[i]);
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

    public static List<Integer> cutArray(List<Integer> array, int index) {
        int OuterLoopCounter = 308;
        int InnerLoopCounter = 307;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            for (int i = array.size() - 1; i >= 0; i--) {
                if (array.get(i) < index) {
                    return array.subList(0, i + 1);
                }
            }
        }
        return array;
    }

    public static boolean isPossible(int K) {
        int[] A = {3, 2, 1};
        int N = A.length;

        List<Integer> dp = new ArrayList<>();
        dp.add(A[0]);
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp.get(dp.size() - 1)) {
                dp = cutArray(dp, A[i]);
            } else {
                dp.add(A[i]);
            }
            boolean isAdded = false;
            for (int j = dp.size() - 1; j >= 0; j--) {
                if (dp.get(j) < A[i] - 1) {
                    dp = cutArray(dp, dp.get(j) + 1);
                    if (dp.get(dp.size() - 1) < A[i]) {
                        dp.add(A[i]);
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
        } else if (isPossible((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }
}