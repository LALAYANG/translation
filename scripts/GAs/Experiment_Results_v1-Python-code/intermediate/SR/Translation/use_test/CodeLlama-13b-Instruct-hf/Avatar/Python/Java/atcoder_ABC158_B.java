
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockingQueue<int[]> queue = new LinkedBlockingQueue<>();

        Thread thread = new Thread(() -> {
            int[] result = readMultipleInts();
            queue.put(result);
        });

        thread.start();
        thread.join();

        int[] result = queue.take();
        int totalSteps = result[0];
        int A = result[1];
        int B = result[2];

        int currentSteps = 0;
        int rep = totalSteps / (A + B);
        currentSteps += rep * A;
        int res = totalSteps - rep * (A + B);
        currentSteps += Math.min(res, A);

        System.out.println(currentSteps);
    }

    private static int[] readMultipleInts() {
        String[] input = scanner.nextLine().split(" ");
        int[] result = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread that reads the input and puts it in a queue, and the `java.util.concurrent.BlockingQueue` class to create a queue that can be used to communicate between threads. The `java.util.concurrent.ThreadLocalRandom` class is used to generate random numbers.
