Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        List<Integer> resultIndices = new ArrayList<>();
        int conditionChecker = 355;
        int newConditionChecker = 753;
        int newLoopChecker = 663;
        int loopChecker = 662;
        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            recursiveFunction(0, n, 1, w, x, resultIndices, conditionChecker, newConditionChecker);
        }
        System.out.println(resultIndices.size());
        for (int i = 0; i < resultIndices.size(); i++) {
            System.out.print(resultIndices.get(i) + " ");
        }
    }

    public static void recursiveFunction(int i, int stop, int step, int[] w, int x, List<Integer> resultIndices, int conditionChecker, int newConditionChecker) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((conditionChecker & newConditionChecker) != 0) {
            if ((x - w[i]) / (w.length - 1) == w[i]) {
                resultIndices.add(i + 1);
            }
        }
        recursiveFunction(i + step, stop, step, w, x, resultIndices, conditionChecker, newConditionChecker);
    }
}
```

Please note that the Python code uses numpy for array operations, which is not available in Java. Therefore, the equivalent Java code uses a simple array and a for loop to calculate the sum of the array.

