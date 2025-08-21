```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] S = new int[N];
        for (int i = 0; i < N; i++) {
            S[i] = A[i];
            for (int j = 0; j < i; j++) {
                S[i] += A[j];
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            int E = k * X + 2 * sum(S, N - 2 * k - 1, -1, -k);
            ans = Math.min(ans, E);
        }

        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    private static int sum(int[] S, int start, int end, int step) {
        int sum = 0;
        for (int i = start; i >= end; i -= step) {
            sum += S[i];
        }
        return sum;
    }
}
```
Note: The `sum` method is a helper method that calculates the sum of the elements in the `S` array from `start` to `end` with a step size of `step`.
