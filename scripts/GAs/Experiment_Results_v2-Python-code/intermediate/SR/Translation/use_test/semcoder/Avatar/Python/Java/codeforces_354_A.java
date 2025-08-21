Thought process:
1. Understand the input format and the provided code snippet.
2. Identify the key components of the code snippet and translate them to Java.
3. Implement the logic step by step in Java.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int QR = scanner.nextInt();
        int[] W = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            W[i] = scanner.nextInt();
        }
        int[] sum_el = new int[arraySize + 1];
        calculateCumulativeSum(1, arraySize + 1, 1, W, sum_el);
        int answer = QR * (arraySize - 1) + sum_el[arraySize] * R;
        int outerLoopCount = 955;
        int outerLoopLimit = 954;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCount / outerLoopLimit; LoopIndexOut++) {
            for (int i = 1; i <= arraySize; i++) {
                int energy = L * sum_el[i] + R * (sum_el[arraySize] - sum_el[i]);
                if (i > arraySize - i) {
                    energy += (i - (arraySize - i) - 1) * QL;
                } else if (arraySize - i > i) {
                    energy += (arraySize - i - i - 1) * QR;
                }
                if (energy < answer) {
                    answer = energy;
                }
            }
        }
        System.out.println(answer);
    }

    private static void calculateCumulativeSum(int i, int stop, int step, int[] W, int[] sum_el) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        sum_el[i] = W[i - 1] + sum_el[i - 1];
        calculateCumulativeSum(i + step, stop, step, W, sum_el);
    }
}
```
