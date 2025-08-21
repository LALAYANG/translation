import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC124_A {
    private static int a, b;
    private static int counter = 0;
    private static final int CONDITION_VALUE = 451;
    private static final int CONDITION_CHECK_VALUE = 633;
    private static final int OUTER_LOOP_ITERATIONS = 219;
    private static final int INNER_LOOP_ITERATIONS = 218;

    public static void main(String[] args) throws InterruptedException {
        a = 3;
        b = 4;

        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_ITERATIONS / INNER_LOOP_ITERATIONS; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                counter += Math.max(a, b);
                if ((CONDITION_VALUE & CONDITION_CHECK_VALUE) != 0) {
                    if (a >= b) {
                        int variable_3_12 = 1;
                        BlockingQueue<Integer> queue_calculate_difference0 = new LinkedBlockingQueue<>();

                        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                        executor.submit(() -> {
                            try {
                                queue_calculate_difference0.put(calculateDifference(variable_3_12, a));
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        executor.shutdown();
                        executor.awaitTermination(1, TimeUnit.SECONDS);

                        a = queue_calculate_difference0.take();
                    } else {
                        b = b - 1;
                    }
                }
            }
        }

        System.out.println(counter);
    }

    private static int calculateDifference(int variable_3_12, int a) {
        return a - variable_3_12;
    }
}