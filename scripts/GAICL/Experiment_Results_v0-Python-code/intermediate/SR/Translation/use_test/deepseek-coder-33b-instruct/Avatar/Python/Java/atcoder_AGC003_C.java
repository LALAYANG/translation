Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int N = 99995;
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(ThreadLocalRandom.current().nextInt(1, 100000) * N + i);
        }
        Collections.sort(A);
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            int element = A.get(i);
            int variable_3_9 = 2;
            BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            Thread workerThread = new Thread(() -> {
                int threadResult = calculateRemainder(element, N, variable_3_9);
                try {
                    resultQueue.put(threadResult);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            workerThread.start();
            workerThread.join();
            int result = resultQueue.poll(1, TimeUnit.SECONDS);
            int remainder = result;
            if (remainder % 2 != i % 2) {
                cnt = cnt + 1;
            }
        }
        System.out.println(cnt / 2);
    }

    private static int calculateRemainder(int element, int N, int variable_3_9) {
        return element % N % variable_3_9;
    }
}
```

Please note that the Python code uses `input()` to get the input, which is not available in Java. I replaced it with `ThreadLocalRandom.current().nextInt(1, 100000)` to generate a random number. Also, the Python code uses `queue.Queue` to pass the result from the worker thread to the main thread, which is not available in Java. I replaced it with `BlockingQueue`.

