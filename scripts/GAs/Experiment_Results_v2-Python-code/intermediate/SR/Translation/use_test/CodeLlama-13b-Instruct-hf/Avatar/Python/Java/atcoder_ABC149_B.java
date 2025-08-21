
Here is the Java code that translates the Python code:
```java
import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class CalculateDifference {
    public static void main(String[] args) {
        int[] cookieValues = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        int firstValue = cookieValues[0];
        int thirdValue = cookieValues[2];
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int result = calculateDifference(thirdValue, firstValue);
            queue.put(result);
        });

        thread.start();
        thread.join();
        int result = queue.take();
        int leftOver = result;

        int[] takahashi = IntStream.of(72, 91, 23).max().getAsInt();
        int[] cookieValues1 = IntStream.of(43, 52, 20).max().getAsInt();
        int[] takahashi1 = IntStream.of(takahashi, leftOver).max().getAsInt();
        int[] cookieValues2 = IntStream.of(cookieValues1, max(0, cookieValues1 - abs(leftOver))).max().getAsInt();

        System.out.println(takahashi1 + " " + cookieValues2);
    }

    private static int calculateDifference(int thirdValue, int firstValue) {
        return firstValue - thirdValue;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread and a blocking queue, and the `java.util.stream` package to perform the calculations. The `main` method takes an array of strings as input, splits it by spaces, maps each element to an integer, and then calculates the difference between the first and third values. The `calculateDifference` method is called in a separate thread, and the result is put in a blocking queue. The main thread then takes the result from the queue and calculates the maximum value of the two arrays. Finally, the result is printed to the console.
