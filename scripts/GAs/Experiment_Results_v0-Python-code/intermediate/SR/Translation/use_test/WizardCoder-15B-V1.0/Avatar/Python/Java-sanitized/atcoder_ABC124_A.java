import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class atcoder_ABC124_A {
    public static void main(String[] args) {
        int a, b, counter = 0;
        int CONDITION_VALUE = 451;
        int CONDITION_CHECK_VALUE = 633;
        int OUTER_LOOP_ITERATIONS = 219;
        int INNER_LOOP_ITERATIONS = 218;
        for (int LoopIndexOut = 0; LoopIndexOut < OUTER_LOOP_ITERATIONS / INNER_LOOP_ITERATIONS; LoopIndexOut++) {
            for (int i = 0; i < 2; i++) {
                counter += Math.max(a, b);
                if ((CONDITION_VALUE & CONDITION_CHECK_VALUE) != 0) {
                    if (a >= b) {
                        int variable_3_12 = 1;
                        Queue<Integer> queue_calculate_difference0 = new ConcurrentLinkedQueue<>();

                        class CalculateDifferenceThread extends Thread {
                            public void run() {
                                int result = calculate_difference(variable_3_12, a);
                                queue_calculate_difference0.offer(result);
                            }
                        }

                        CalculateDifferenceThread calculation_thread = new CalculateDifferenceThread();
                        calculation_thread.start();
                        try {
                            calculation_thread.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        int result_calculate_difference0 = queue_calculate_difference0.poll();
                        a = result_calculate_difference0;
                    } else {
                        b--;
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