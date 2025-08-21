
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.stream.IntStream;

public class CalculateProduct {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(args[i + 1])).toArray();
        int factor = 0;
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int product = calculateProduct(n, factor);
            queue.put(product);
        });
        thread.start();
        thread.join();
        int result = queue.take();
        int[] b = result;

        recursiveLoopOne(0, n, 1);
        int res = 0;
        recursiveLoopTwo(1, n, 1);
        System.out.println(res);
    }

    private static int calculateProduct(int n, int factor) {
        return factor * n;
    }

    private static void recursiveLoopOne(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        b[a[i] - 1] = i;
        recursiveLoopOne(i + step, stop, step);
    }

    private static void recursiveLoopTwo(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        res += Math.abs(b[i] - b[i - 1]);
        recursiveLoopTwo(i + step, stop, step);
    }
}
```
Note that this code assumes that the input is a list of integers separated by spaces, and that the first line of the input is the number of elements in the list. The output is the result of the calculation, which is the sum of the absolute differences between the elements of the list.

Also, this code uses the `java.util.concurrent` package to create a thread that calculates the product of the input numbers and puts the result in a queue. The main thread then takes the result from the queue and uses it to calculate the sum of the absolute differences between the elements of the list.

I hope this helps! Let me know if you have any questions or need further assistance.
