```
import java.util.concurrent.Thread;
import java.util.concurrent.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Random;

public class DecoratorExample {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int divisor = 2;
        Queue<Integer> resultQueue = new LinkedBlockingQueue<>();

        Thread workerThread = new Thread(new DivisionWorker(resultQueue, number, divisor));
        workerThread.start();
        workerThread.join();

        int divisionResult = resultQueue.take();
        if (divisionResult == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static class DivisionWorker implements Runnable {
        private Queue<Integer> resultQueue;
        private int number;
        private int divisor;

        public DivisionWorker(Queue<Integer> resultQueue, int number, int divisor) {
            this.resultQueue = resultQueue;
            this.number = number;
            this.divisor = divisor;
        }

        @Override
        public void run() {
            int result = number / divisor;
            resultQueue.add(result);
        }
    }
}
```
Note: In Java, we use the `Thread` class to create and manage threads, and the `Queue` interface to implement a queue. The `LinkedBlockingQueue` class is a specific implementation of the `Queue` interface that provides a blocking queue, which is useful for synchronizing access to shared data between threads. The `Random` class is used to generate random numbers.
