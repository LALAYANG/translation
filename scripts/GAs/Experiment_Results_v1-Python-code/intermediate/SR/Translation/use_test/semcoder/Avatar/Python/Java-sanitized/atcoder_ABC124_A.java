import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class atcoder_ABC124_A {
    public static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }

    public static void main(String[] args) {
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
                        Queue<Integer> queue_calculateDifference0 = new ConcurrentLinkedQueue<>();

                        Runnable calculateDifference_thread = () -> {
                            int result = calculateDifference(numberToSubtract, firstNumber);
                            queue_calculateDifference0.add(result);
                        };

                        ExecutorService executorService = Executors.newSingleThreadExecutor();
                        executorService.execute(calculateDifference_thread);
                        executorService.shutdown();

                        int result_calculateDifference0 = queue_calculateDifference0.poll();
                        firstNumber = result_calculateDifference0;
                    } else {
                        b--;
                    }
                }
            }
        }

        System.out.println(c);
    }
}