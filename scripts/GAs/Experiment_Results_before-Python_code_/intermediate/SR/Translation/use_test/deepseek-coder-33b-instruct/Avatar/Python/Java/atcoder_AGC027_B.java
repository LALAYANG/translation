```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long[] S = new long[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        long ans = Long.MAX_VALUE;
        for (int k = 0; k < N; k++) {
            long E = (k + 1) * X;
            for (int j = N - 2 * k - 1; j >= 0; j -= k + 1) {
                E += 2 * S[j];
            }
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the prefix sums, and then iterates over the prefix sums to find the minimum energy. The result is then printed out.

