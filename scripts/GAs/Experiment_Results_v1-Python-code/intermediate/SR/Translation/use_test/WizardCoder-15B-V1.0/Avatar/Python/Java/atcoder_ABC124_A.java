```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        int firstConditionValue = 675;
        int secondConditionValue = 845;
        int outerLoopLimit = 658;
        int innerLoopLimit = 657;
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(firstNumber, b);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (firstNumber >= b) {
                        int numberToSubtract = 1;
                        LinkedBlockingQueue<Integer> queue_calculateDifference0 = new LinkedBlockingQueue<>();

                        Runnable calculateDifference_thread = () -> {
                            int result = calculateDifference(numberToSubtract, firstNumber);
                            queue_calculateDifference0.offer(result);
                        };
                        executor.execute(calculateDifference_thread);
                        try {
                            int result_calculateDifference0 = queue_calculateDifference0.poll(1, TimeUnit.SECONDS);
                            firstNumber = result_calculateDifference0;
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        b--;
                    }
                }
            }
        }
        executor.shutdown();
        System.out.println(c);
    }

    public static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }
}
```
