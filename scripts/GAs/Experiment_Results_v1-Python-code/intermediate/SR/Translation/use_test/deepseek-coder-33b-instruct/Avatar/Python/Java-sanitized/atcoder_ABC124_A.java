import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC124_A {
    public static void main(String[] args) throws InterruptedException {
        int firstNumber = 3;
        int b = 4;
        int c = 0;
        int firstConditionValue = 675;
        int secondConditionValue = 845;
        int outerLoopLimit = 658;
        int innerLoopLimit = 657;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(firstNumber, b);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (firstNumber >= b) {
                        int numberToSubtract = 1;
                        BlockingQueue<Integer> queue_calculateDifference0 = new LinkedBlockingQueue<>();
                        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                        executor.submit(() -> {
                            try {
                                queue_calculateDifference0.put(calculateDifference(numberToSubtract, firstNumber));
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        executor.shutdown();
                        executor.awaitTermination(1, TimeUnit.SECONDS);
                        firstNumber = queue_calculateDifference0.take();
                    } else {
                        b -= 1;
                    }
                }
            }
        }
        System.out.println(c);
    }

    private static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }
}