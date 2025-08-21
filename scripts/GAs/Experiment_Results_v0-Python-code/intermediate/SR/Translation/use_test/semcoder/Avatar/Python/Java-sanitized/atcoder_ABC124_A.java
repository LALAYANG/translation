import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int counter = 0;
        final int CONDITION_VALUE = 451;
        final int CONDITION_CHECK_VALUE = 633;
        final int OUTER_LOOP_ITERATIONS = 219;
        final int INNER_LOOP_ITERATIONS = 218;

        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_ITERATIONS / INNER_LOOP_ITERATIONS; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                counter += Math.max(a, b);
                if ((CONDITION_VALUE & CONDITION_CHECK_VALUE) != 0) {
                    if (a >= b) {
                        int variable_3_12 = 1;
                        Queue<Integer> queue_calculate_difference0 = new LinkedBlockingQueue<>();

                        Runnable calculate_difference_task = () -> {
                            int result = calculate_difference(variable_3_12, a);
                            queue_calculate_difference0.add(result);
                        };

                        Thread calculation_thread = new Thread(calculate_difference_task);
                        calculation_thread.start();
                        calculation_thread.join();

                        int result_calculate_difference0 = queue_calculate_difference0.poll();
                        a = result_calculate_difference0;
                    } else {
                        b -= 1;
                    }
                }
            }
        }

        System.out.println(counter);
    }

    public static int calculate_difference(int variable_3_12, int a) {
        return a - variable_3_12;
    }
}