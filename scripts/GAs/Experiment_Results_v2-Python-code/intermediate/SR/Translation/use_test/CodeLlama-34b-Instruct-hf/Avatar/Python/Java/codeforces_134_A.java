```java
import java.util.Scanner;

public class TTestInd {
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
        int[] indices = new int[n];
        int outerLoopEnd = 66;
        int outerLoopStep = 65;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            int i = 0;
            int stop = n;
            int step = 1;
            while (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                if ((x - w[i]) / (n - 1) == w[i]) {
                    indices[i] = i + 1;
                }
                i += step;
            }
        }
        System.out.println(indices.length);
        System.out.println(Arrays.toString(indices));
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
