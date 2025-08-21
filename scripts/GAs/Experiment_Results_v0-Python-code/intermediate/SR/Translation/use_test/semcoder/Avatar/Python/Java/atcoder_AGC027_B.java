Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java, considering the dependencies and functionalities.
3. Ensure the Java code is correct and runs without errors.

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

        // Perform the calculation
        int ans = Integer.MAX_VALUE;
        for (int groupSize = 1; groupSize <= N; groupSize++) {
            int currentSum = groupSize * X + 2 * sumExtraCost(N, groupSize, X, values);
            ans = Math.min(ans, currentSum);
        }

        System.out.println(ans + N * X + 5 * sumArray(values));
    }

    private static int sumExtraCost(int N, int groupSize, int X, int[] values) {
        int sum = 0;
        for (int i = N - 2 * groupSize - 1; i >= 0; i -= groupSize) {
            sum += values[i];
        }
        return sum;
    }

    private static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
```

This Java code snippet translates the given Python code snippet to Java, ensuring it runs without errors and provides the expected output.
