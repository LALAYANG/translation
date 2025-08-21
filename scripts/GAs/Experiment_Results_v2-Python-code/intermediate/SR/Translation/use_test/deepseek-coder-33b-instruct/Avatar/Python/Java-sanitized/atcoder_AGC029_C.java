import java.util.*;

public class atcoder_AGC029_C {
    static int[] A;
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(bis(0, N));
    }

    static int[] cutArray(int[] array, int index) {
        int ConditionOne = 973;
        int ConditionTwo = 735;
        if ((ConditionOne & ConditionTwo) != 0) {
            if (index < 1) {
                return new int[0];
            }
        }
        if (index <= array[0]) {
            return new int[]{index, array[1]};
        }
        int OuterLoopCounter = 308;
        int InnerLoopCounter = 307;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            for (int _ = array.length - 1; _ > 0; _--) {
                if (array[_-1] < index) {
                    return Arrays.copyOf(array, _);
                }
            }
        }
        return array;
    }

    static boolean isPossible(int K) {
        int[] dp = {A[0], 0};
        for (int current_element : A) {
            if (current_element <= dp[0]) {
                dp = cutArray(dp, current_element);
            } else {
                dp = Arrays.copyOf(dp, dp.length + 2);
                dp[dp.length - 2] = current_element;
                dp[dp.length - 1] = 0;
            }
            boolean is_added = false;
            for (int j = dp.length - 2; j >= 0; j -= 2) {
                if (dp[j + 1] < K - 1) {
                    dp = cutArray(dp, dp[j] - 1);
                    dp = Arrays.copyOf(dp, dp.length + 2);
                    dp[dp.length - 2] = dp[j];
                    dp[dp.length - 1] = dp[j + 1] + 1;
                    if (dp[dp.length - 2] < current_element) {
                        dp = Arrays.copyOf(dp, dp.length + 2);
                        dp[dp.length - 2] = current_element;
                        dp[dp.length - 1] = 0;
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
        } else if (isPossible((x + y) / 2)) {
            return bis(x, (x + y) / 2);
        } else {
            return bis((x + y) / 2, y);
        }
    }
}