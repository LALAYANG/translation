Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        int x = 0;
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
            x += w[i];
        }
        List<Integer> resultIndices = new ArrayList<>();
        int conditionChecker = 355;
        int newConditionChecker = 753;
        int newLoopChecker = 663;
        int loopChecker = 662;
        for (int loopIndexOut = 0; loopIndexOut < newLoopChecker / loopChecker; loopIndexOut++) {
            recursiveFunction(w, n, resultIndices, 0, n, 1, conditionChecker, newConditionChecker, x);
        }
        System.out.println(resultIndices.size());
        for (int index : resultIndices) {
            System.out.print(index + " ");
        }
    }

    private static void recursiveFunction(int[] w, int n, List<Integer> resultIndices, int i, int stop, int step, int conditionChecker, int newConditionChecker, int x) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((conditionChecker & newConditionChecker) != 0) {
            if ((double)(x - w[i]) / (n - 1) == w[i]) {
                resultIndices.add(i + 1);
            }
        }
        recursiveFunction(w, n, resultIndices, i + step, stop, step, conditionChecker, newConditionChecker, x);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and an array `w` of `n` integers from the standard input, calculates the sum of the array elements, and then iterates over the array to find indices where the sum of the array elements minus the current element equals the current element multiplied by `n-1`. The results are stored in a list and printed to the standard output.

