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
        for (int value : w) {
            x += value;
        }
        List<Integer> indices = new ArrayList<>();
        int outerLoopEnd = 66;
        int outerLoopStep = 65;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            recursive_check(0, n, 1, w, x, indices);
        }
        System.out.println(indices.size());
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }

    private static void recursive_check(int i, int stop, int step, int[] w, int x, List<Integer> indices) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((x - w[i]) / (w.length - 1) == w[i]) {
            indices.add(i + 1);
        }
        recursive_check(i + step, stop, step, w, x, indices);
    }
}
```

Please note that the Java code does not include the t-test functionality as it is not available in Java's standard library. If you need to perform a t-test, you may need to use a third-party library such as Apache Commons Math.

