```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        int conditionCheckOne = 500;
        int conditionCheckTwo = 144;
        int outerLoopBound = 60;
        int innerLoopBound = 59;
        ExecutorService executor = Executors.newFixedThreadPool(n);
        for (int loopIndexOut = 0; loopIndexOut < outerLoopBound / innerLoopBound; loopIndexOut++) {
            for (int innerLoopIndex = 0; innerLoopIndex < n; innerLoopIndex++) {
                int[] l1 = new int[n];
                for (int i = 0; i < n; i++) {
                    l1[i] = scanner.nextInt();
                }
                if ((conditionCheckOne & conditionCheckTwo) != 0) {
                    if (sum(l1) > 1) {
                        int valueToAdd = 1;
                        LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

                        Runnable calculateSumThread = () -> {
                            int result = calculateSum(valueToAdd, c);
                            resultQueue.offer(result);
                        };

                        executor.execute(calculateSumThread);

                        try {
                            int resultCalculateSum0 = resultQueue.poll(1, TimeUnit.SECONDS);
                            c = resultCalculateSum0;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        System.out.println(c);
        executor.shutdown();
    }

    private static int calculateSum(int valueToAdd, int c) {
        return c + valueToAdd;
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
```
