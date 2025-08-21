
Here's the Java code that is equivalent to the Python code you provided:
```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numOperations = scanner.nextInt();
        int factor = 1;
        int variable311 = 2;
        Queue<Integer> resultQueue = new Queue<>();

        Thread threadCalculateProduct0 = new Thread(() -> {
            int result = calculateProduct(n, variable311, factor);
            resultQueue.add(result);
        });
        threadCalculateProduct0.start();
        threadCalculateProduct0.join();
        int resultCalculateProduct0 = resultQueue.remove();
        int[] b = new int[n];
        b[0] = b[n - 1] = b[n] = b[2 * n - 1] = 0;

        processMatrix(0, numOperations, 1);
        if (n % 2 == 0 && b[n / 2] != 0 && b[n + n / 2] != 0) {
            b[n / 2] = 0;
        }
        System.out.println(Arrays.stream(b).sum());
    }

    private static int calculateProduct(int n, int variable311, int factor) {
        return factor * n * variable311;
    }

    private static void processMatrix(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int rowIndex = scanner.nextInt();
        int c = scanner.nextInt();
        b[rowIndex - 1] = b[n + c - 1] = 0;
        processMatrix(i + step, stop, step);
    }
}
```
Note that the `processMatrix` method is a recursive method that calls itself with the updated `i` and `step` values. The `calculateProduct` method is a simple method that calculates the product of three integers. The `main` method is the entry point of the program, where the input is read and the `processMatrix` method is called with the appropriate arguments. The `Arrays.stream(b).sum()` method is used to calculate the sum of the elements in the `b` array.
