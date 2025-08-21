Thought Process:
1. Understand the given code snippet and the problem it aims to solve.
2. Identify the key components and functions used in the code.
3. Translate the Python code to Java while maintaining the functionality and logic.

Solution:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }

        int[] S = new int[N];
        S[0] = values[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + values[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int groupSize = 1; groupSize <= N; groupSize++) {
            int currentSum = groupSize * X + 2 * sumExtraCost(N, groupSize, S);
            ans = Math.min(ans, currentSum);
        }

        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    private static int sumExtraCost(int N, int groupSize, int[] S) {
        int sum = 0;
        for (int i = N - 2 * groupSize - 1; i >= 0; i -= groupSize) {
            sum += S[i];
        }
        return sum;
    }
}
```

This Java solution reads input values for N and X, followed by N integers representing the values array. It then calculates the minimum cost based on the provided logic and outputs the final result.
