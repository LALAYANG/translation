Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numMoves = scanner.nextInt();
        int[] b = new int[n * 2];
        for (int i = 0; i < b.length; i++) {
            b[i] = 1;
        }
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        int innerLoopBound = 895;
        int outerLoopBound = 894;
        for (int outerLoopIndex = 0; outerLoopIndex < innerLoopBound / outerLoopBound; outerLoopIndex++) {
            recursiveFunction(0, numMoves, 1, b, n);
        }
        if (n % 2 == 1 && b[n / 2] == 1 && b[n + n / 2] == 1) {
            b[n / 2] = 0;
        }
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println(sum);
    }

    public static void recursiveFunction(int i, int stop, int step, int[] b, int n) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int r = scanner.nextInt();
        int column = scanner.nextInt();
        b[r - 1] = b[n + column - 1] = 0;
        recursiveFunction(i + step, stop, step, b, n);
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module and the `np.sum` function from the `numpy` module are not available in Java. Therefore, they have been omitted in the Java version.

