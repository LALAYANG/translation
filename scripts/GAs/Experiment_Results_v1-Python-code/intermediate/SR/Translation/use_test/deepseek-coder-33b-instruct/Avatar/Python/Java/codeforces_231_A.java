```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        AtomicInteger c = new AtomicInteger(0);
        int conditionCheckOne = 500;
        int conditionCheckTwo = 144;
        int outerLoopBound = 60;
        int innerLoopBound = 59;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n; innerLoopIndex++) {
                int[] l1 = new int[3];
                for (int i = 0; i < 3; i++) {
                    l1[i] = scanner.nextInt();
                }
                if ((conditionCheckOne & conditionCheckTwo) > 0) {
                    if (l1[0] + l1[1] + l1[2] > 1) {
                        int valueToAdd = 1;
                        BlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
                        Thread workerThread = new Thread(() -> {
                            int result = calculateSum(valueToAdd, c.get());
                            try {
                                resultQueue.put(result);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        workerThread.start();
                        workerThread.join();
                        c.set(resultQueue.poll());
                    }
                }
            }
        }
        System.out.println(c.get());
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }
}
```

