
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numIterations = scanner.nextInt();
        int c = 0;
        int conditionCheckerOne = 815;
        int conditionCheckerTwo = 353;
        for (int i = 0; i < numIterations; i++) {
            String[] input = scanner.nextLine().split(" ");
            int[] l1 = new int[input.length];
            for (int j = 0; j < input.length; j++) {
                l1[j] = Integer.parseInt(input[j]);
            }
            if ((conditionCheckerOne & conditionCheckerTwo) != 0) {
                if (sum(l1) > 1) {
                    int valueToAdd = 1;
                    BlockingQueue<Integer> queueCalculateSum0 = new LinkedBlockingQueue<>();

                    Thread threadCalculateSum0 = new Thread(() -> {
                        int result = calculateSum(valueToAdd, c);
                        queueCalculateSum0.put(result);
                    });
                    threadCalculateSum0.start();
                    try {
                        threadCalculateSum0.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    int resultCalculateSum0 = queueCalculateSum0.take();
                    c = resultCalculateSum0;
                }
            }
        }
        System.out.println(c);
    }

    private static int sum(int[] l1) {
        int sum = 0;
        for (int i = 0; i < l1.length; i++) {
            sum += l1[i];
        }
        return sum;
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }
}
```
Note that this code uses the `java.util.concurrent` package to create a thread-safe queue, and the `java.util.concurrent.LinkedBlockingQueue` class to create a blocking queue. The `java.util.concurrent.BlockingQueue` interface is used to define the methods that can be called on the queue. The `java.util.concurrent.Thread` class is used to create a new thread, and the `java.util.concurrent.Thread.start()` method is used to start the thread. The `java.util.concurrent.Thread.join()` method is used to wait for the thread to finish. The `java.util.concurrent.BlockingQueue.put()` method is used to add an element to the queue, and the `java.util.concurrent.BlockingQueue.take()` method is used to remove an element from the queue.
