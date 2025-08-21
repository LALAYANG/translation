
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
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
        for (int i = 0; i < newLoopChecker / loopChecker; i++) {
            recursiveFunction(0, n, 1);
        }
        System.out.println(resultIndices.size());
        for (int i = 0; i < resultIndices.size(); i++) {
            System.out.print(resultIndices.get(i) + " ");
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((conditionChecker & newConditionChecker) != 0) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                resultIndices.add(i + 1);
            }
        }
        recursiveFunction(i + step, stop, step);
    }
}
```
Note that this code assumes that the input is a list of integers separated by spaces, and that the output should be a list of integers separated by spaces. If the input and output formats are different, you will need to modify the code accordingly.
