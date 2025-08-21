import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        int firstNumber, b;
        int c = 0;
        int firstConditionValue = 675;
        int secondConditionValue = 845;
        int outerLoopLimit = 658;
        int innerLoopLimit = 657;
        int numberToSubtract = 1;
        Queue<Integer> queue_calculateDifference0 = new ConcurrentLinkedQueue<>();
        ExecutorService executorService_calculateDifference0 = Executors.newSingleThreadExecutor();
        try {
            String[] input = System.console().readLine().split(" ");
            firstNumber = Integer.parseInt(input[0]);
            b = Integer.parseInt(input[1]);
            for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
                for (int i = 0; i < 2; i++) {
                    c += Math.max(firstNumber, b);
                    if ((firstConditionValue & secondConditionValue) != 0) {
                        if (firstNumber >= b) {
                            executorService_calculateDifference0.execute(() -> {
                                int result = calculateDifference(numberToSubtract, firstNumber);
                                queue_calculateDifference0.add(result);
                            });
                            firstNumber = queue_calculateDifference0.poll();
                        } else {
                            b -= 1;
                        }
                    }
                }
            }
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService_calculateDifference0.shutdown();
        }
    }

    public static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }
}