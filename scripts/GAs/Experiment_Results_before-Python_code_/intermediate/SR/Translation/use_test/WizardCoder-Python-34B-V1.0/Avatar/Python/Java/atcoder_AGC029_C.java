```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int[] B = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || A[i] <= A[k]) {
                B[k++] = A[i];
            }
        }
        int N = k;

        int[][] dp = new int[N][2];
        dp[0][0] = A[0];
        dp[0][1] = 0;
        for (int i = 1; i < N; i++) {
            if (A[i] <= dp[k - 1][0]) {
                int j;
                for (j = k - 1; j >= 0; j--) {
                    if (dp[j][0] < A[i]) {
                        break;
                    }
                }
                dp[j + 1] = new int[]{A[i], 0};
                k = j + 1;
            } else {
                int isAdded = false;
                for (int j = k - 1; j >= 0; j--) {
                    if (dp[j][1] < n - 1) {
                        dp[j][1]++;
                        isAdded = true;
                        break;
                    }
                }
                if (!isAdded) {
                    dp[k++] = new int[]{A[i], 0};
                }
            }
        }

        int[][] cut = new int[N][2];
        int index = 0;
        for (int i = 0; i < N; i++) {
            cut[index++] = new int[]{dp[i][0], dp[i][1]};
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
            int[][] tempDp = new int[N][2];
            for (int i = 0; i < N; i++) {
                tempDp[i] = new int[]{dp[i][0], dp[i][1]};
            }
            for (int i = 0; i < N; i++) {
                if (tempDp[i][1] < K - 1) {
                    int j;
                    for (j = i - 1; j >= 0; j--) {
                        if (tempDp[j][0] < tempDp[i][0] - 1) {
                            break;
                        }
                    }
                    int[][] newDp = new int[j + 1][2];
                    System.arraycopy(tempDp, 0, newDp, 0, j + 1);
                    newDp[j + 1] = new int[]{tempDp[j][0] - 1, tempDp[j][1] + 1};
                    for (int k = j + 2; k < N; k++) {
                        if (tempDp[k][0] > tempDp[j][0]) {
                            newDp[k] = tempDp[k];
                        }
                    }
                    tempDp = newDp;
                    if (tempDp[N - 1][0] < A[i]) {
                        tempDp[N] = new int[]{A[i], 0};
                        N++;
                    }
                    break;
                }
            }
            return tempDp[N - 1][0] < A[N - 1];
        }

        System.out.println(bis(0, N));
    }
}
```

Test input:
3
3 2 1

Expected output:
2 
