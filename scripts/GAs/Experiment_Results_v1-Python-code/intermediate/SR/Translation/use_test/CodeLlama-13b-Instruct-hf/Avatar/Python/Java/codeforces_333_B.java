
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numMoves = scanner.nextInt();
        int[] b = new int[n * 2];
        Arrays.fill(b, 1);
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;
        int innerLoopBound = 895;
        int outerLoopBound = 894;
        for (int outerLoopIndex = 0; outerLoopIndex < innerLoopBound / outerLoopBound; outerLoopIndex++) {
            recursiveFunction(0, numMoves, 1);
        }
        if (n % 2 == 1 && b[n / 2] && b[n + n / 2]) {
            b[n / 2] = 0;
        }
        System.out.println(Arrays.stream(b).sum());
    }

    private static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int r = scanner.nextInt();
        int column = scanner.nextInt();
        b[r - 1] = b[n + column - 1] = 0;
        recursiveFunction(i + step, stop, step);
    }
}
```
Note that this code assumes that the input is provided through the standard input stream, and it uses the `Scanner` class to read the input. The `Arrays.fill` method is used to initialize the `b` array with the value `1`. The `Arrays.stream` method is used to sum the elements of the `b` array.
