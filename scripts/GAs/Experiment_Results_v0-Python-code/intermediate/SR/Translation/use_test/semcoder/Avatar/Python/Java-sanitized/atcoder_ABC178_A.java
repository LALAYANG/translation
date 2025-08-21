import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC178_A {
    public static int sum_inputs(int test_case, int increment) {
        return test_case + increment;
    }

    public static void Func_solve_0(int test_case) {
        // Simulating input reading and printing
        System.out.println(1);
    }

    public static void main(String[] args) {
        int tcs = 1;
        int test_case = 1;
        int increment = 1;

        while (test_case <= tcs) {
            Func_solve_0(test_case);
            Queue<Integer> queue_sum_inputs0 = new LinkedBlockingQueue<>();

            Runnable sum_inputs_task = () -> {
                int result = sum_inputs(test_case, increment);
                queue_sum_inputs0.add(result);
            };

            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
            executor.execute(sum_inputs_task);
            executor.shutdown();

            try {
                executor.awaitTermination(1, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int result_sum_inputs0 = queue_sum_inputs0.poll();
            test_case = result_sum_inputs0;
        }
    }
}