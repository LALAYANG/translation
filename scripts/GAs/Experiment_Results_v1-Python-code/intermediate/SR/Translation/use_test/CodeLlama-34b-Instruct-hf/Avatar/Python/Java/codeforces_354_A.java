```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int rightQueryCost = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }

        int sumEl = 0;
        for (int i = 1; i <= n; i++) {
            sumEl += weights[i - 1];
        }

        int answer = rightQueryCost * (n - 1) + sumEl * R;
        int outerLoopEnd = 135;
        int outerLoopStep = 134;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopEnd / outerLoopStep; loopIndexOut++) {
            int energy = L * sumEl + R * (sumEl - sumEl);
            if (loopIndexOut > n - loopIndexOut) {
                energy += (loopIndexOut - (n - loopIndexOut) - 1) * QL;
            } else if (n - loopIndexOut > loopIndexOut) {
                energy += (n - loopIndexOut - loopIndexOut - 1) * rightQueryCost;
            }
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
