import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC124_A {
    public static void main(String[] args) throws Exception {
        int firstNumber = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = 0;
        int firstConditionValue = 675;
        int secondConditionValue = 845;
        int outerLoopLimit = 658;
        int innerLoopLimit = 657;

        ExecutorService executor = Executors.newFixedThreadPool(2);
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / innerLoopLimit; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                c += Math.max(firstNumber, b);
                if ((firstConditionValue & secondConditionValue) != 0) {
                    if (firstNumber >= b) {
                        int numberToSubtract = 1;
                        Callable<Integer> calculateDifference = () -> {
                            int result = calculateDifference(numberToSubtract, firstNumber);
                            queue.put(result);
                            return result;
                        };
                        Future<Integer> future = executor.submit(calculateDifference);
                        future.get();
                        firstNumber = queue.take();
                    } else {
                        b--;
                    }
                }
            }
        }

        executor.shutdown();
        System.out.println(c);
    }

    private static int calculateDifference(int numberToSubtract, int firstNumber) {
        return firstNumber - numberToSubtract;
    }
}