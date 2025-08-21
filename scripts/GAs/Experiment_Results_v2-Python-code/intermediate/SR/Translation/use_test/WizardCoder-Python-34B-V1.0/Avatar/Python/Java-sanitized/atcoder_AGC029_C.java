import java.util.Scanner;

public class atcoder_AGC029_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        int N = A.length;

        int ConditionOne = 973;
        int ConditionTwo = 735;
        int OuterLoopCounter = 308;
        int InnerLoopCounter = 307;

        int[][] dp = new int[N][2];
        dp[0][0] = A[0];
        dp[0][1] = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp[i - 1][0]) {
                dp[i][0] = A[i];
                dp[i][1] = dp[i - 1][1];
            } else {
                dp[i][0] = A[i];
                dp[i][1] = dp[i - 1][1] + 1;
            }
        }

        int bis(int x, int y) {
            if (y == x + 1) {
                return y;
            }
            int mid = (x + y) / 2;
            if (isPossible(mid)) {
                return bis(x, mid);
            } else {
                return bis(mid, y);
            }
        }

        boolean isPossible(int K) {
            int[] temp = new int[N][2];
            for (int i = 0; i < N; i++) {
                temp[i][0] = dp[i][0];
                temp[i][1] = dp[i][1];
            }
            for (int i = 0; i < N; i++) {
                if (temp[i][1] < K - 1) {
                    int[] newArray = cutArray(temp, temp[i][0] - 1);
                    temp = new int[newArray.length + 1][2];
                    for (int j = 0; j < newArray.length; j++) {
                        temp[j][0] = newArray[j][0];
                        temp[j][1] = newArray[j][1];
                    }
                    temp[newArray.length][0] = A[i];
                    temp[newArray.length][1] = 0;
                    break;
                }
            }
            return temp[N - 1][0] < A[N - 1];
        }

        int[] cutArray(int[] array, int index) {
            int[] result = new int[array.length];
            int j = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i][0] < index) {
                    result[j++] = array[i][0];
                }
            }
            return result;
        }

        System.out.println(bis(0, N));
    }
}