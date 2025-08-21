
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
        List<Integer> indices = new ArrayList<>();
        int outerLoopEnd = 66;
        int outerLoopStep = 65;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            recursiveCheck(0, n, 1);
        }
        System.out.println(indices.size());
        for (int i = 0; i < indices.size(); i++) {
            System.out.print(indices.get(i) + " ");
        }
    }

    public static void recursiveCheck(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((x - w[i]) / (n - 1) == w[i]) {
            indices.add(i + 1);
        }
        recursiveCheck(i + step, stop, step);
    }
}
```
Note that this code assumes that the input is a list of integers separated by spaces, and that the output should be a list of integers separated by spaces. If the input and output formats are different, you will need to modify the code accordingly.
