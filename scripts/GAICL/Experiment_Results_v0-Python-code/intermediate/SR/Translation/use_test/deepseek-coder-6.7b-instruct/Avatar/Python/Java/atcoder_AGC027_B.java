```java
import java.util.*;
import java.lang.*;

class Main {
    static int N, X;
    static int[] values;
    static int[] S;
    static int ans = Integer.MAX_VALUE;
    static int max_iterations = 1000;
    static int divisor = 999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        X = scanner.nextInt();
        values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }
        S = new int[N];
        S[0] = values[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + values[i];
        }
        recursiveCalculation(0, max_iterations / divisor, 1);
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    static void recursiveCalculation(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int group_size = 1; group_size <= N; group_size++) {
            int current_sum = group_size * X + 2 * sum(N - 2 * group_size - 1, group_size);
            ans = Math.min(ans, current_sum);
        }
        recursiveCalculation(LoopIndexOut + step, stop, step);
    }

    static int sum(int start, int step) {
        int sum = 0;
        for (int i = start; i >= 0; i -= step) {
            sum += S[i];
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the accumulated sum of the values, and then uses a recursive function to calculate the minimum sum. The result is printed to the standard output.

