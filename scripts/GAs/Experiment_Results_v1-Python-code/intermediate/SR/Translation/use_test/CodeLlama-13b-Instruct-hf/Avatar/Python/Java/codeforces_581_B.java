
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CalculateProduct {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] inputArray = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] initialValue = new int[] { 0 };
        BlockingQueue<Integer> queueCalculateProduct0 = new LinkedBlockingQueue<>();

        Thread threadCalculateProduct0 = new Thread(() -> {
            int result = calculateProduct(initialValue, n);
            queueCalculateProduct0.put(result);
        });

        threadCalculateProduct0.start();
        threadCalculateProduct0.join();

        int resultCalculateProduct0 = queueCalculateProduct0.get();
        int[] resultArray = resultCalculateProduct0;
        int mx = inputArray[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            resultArray[i] = Math.max(0, mx - inputArray[i] + 1);
            if (inputArray[i] > mx) {
                mx = inputArray[i];
            }
        }

        System.out.println(Arrays.toString(resultArray));
    }

    private static int calculateProduct(int[] initialValue, int n) {
        return initialValue[0] * n;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread and a blocking queue, and the `java.util.stream` package to convert the input string to an array of integers. The `Math.max` method is used to calculate the maximum value in the array.
