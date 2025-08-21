```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int wholeCandles, b;
        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();

        try {
            String[] input = System.console().readLine().split(" ");
            wholeCandles = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);

            int currentValue = 637;
            int loopBound = 636;
            while (currentValue % loopBound == 1) {
                int increment = 1;

                Runnable task = () -> {
                    int sumResult = calculateSum(currentValue, increment);
                    resultQueue.offer(sumResult);
                };
                executor.execute(task);
                currentValue = resultQueue.take();
            }

            int s = 0;
            int restoSciolte = 0;
            while (wholeCandles > 0 || restoSciolte >= b) {
                wholeCandles += restoSciolte / b;
                restoSciolte = restoSciolte % b;
                s += wholeCandles;
                restoSciolte += wholeCandles % b;
                wholeCandles /= b;
            }
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static int calculateSum(int currentValue, int increment) {
        return currentValue + increment;
    }
}
```
