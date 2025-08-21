```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Decorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] data = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            data[i] = sc.nextInt();
        }

        int[] result = new int[arraySize];
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());
        executor.execute(new WorkerThread(result, data));
        executor.shutdown();

        while (!executor.isTerminated()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < arraySize; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}

class WorkerThread implements Runnable {
    private int[] result;
    private int[] data;

    public WorkerThread(int[] result, int[] data) {
        this.result = result;
        this.data = data;
    }

    @Override
    public void run() {
        int currentMax = data[data.length - 1];
        for (int i = data.length - 2; i >= 0; i--) {
            result[i] = Math.max(0, currentMax - data[i] + 1);
            if (data[i] > currentMax) {
                currentMax = data[i];
            }
        }
    }
}
```
Explanation:

The Python code is using the `threading` module to create a thread pool with a single worker thread. The `WorkerThread` class implements the `Runnable` interface and has a `run` method that performs the calculation. The `main` method creates an instance of the `WorkerThread` class and passes it to the `execute` method of the `ThreadPoolExecutor`. The `shutdown` method is called on the `ThreadPoolExecutor` to wait for the worker thread to complete.

The Java code is similar, but it uses the `ThreadPoolExecutor` class to create a thread pool with a single worker thread. The `WorkerThread` class is similar to the Python version, but it implements the `Runnable` interface and has a `run` method that performs the calculation. The `main` method creates an instance of the `WorkerThread` class and passes it to the `execute` method of the `ThreadPoolExecutor`. The `shutdown` method is called on the `ThreadPoolExecutor` to wait for the worker thread to complete.

Note that the Java code uses the `LinkedBlockingQueue` class to implement the queue, while the Python code uses the `queue` module. The `LinkedBlockingQueue` class is a thread-safe implementation of a queue, while the `queue` module is not thread-safe.
