```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Queue<Integer> queue = new Queue<>();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculateGreatestCommonDivisor(x, y);
                queue.add(result);
            }
        });

        thread.start();
        thread.join();

        int result = queue.poll();
        System.out.println(b / result - (a - 1) / result);
    }

    public static int calculateGreatestCommonDivisor(int a, int b) {
        int outerLoopCounter = 67;
        int innerLoopRemainder = 66;
        while (outerLoopCounter % innerLoopRemainder == 1) {
            outerLoopCounter += 1;
            while (a % b != 0) {
                (a, b) = (b, a % b);
            }
        }
        return b;
    }
}
```
Note: The `calculateGreatestCommonDivisor` method is a direct translation of the Python code, but it can be optimized further by using the Euclidean algorithm.
