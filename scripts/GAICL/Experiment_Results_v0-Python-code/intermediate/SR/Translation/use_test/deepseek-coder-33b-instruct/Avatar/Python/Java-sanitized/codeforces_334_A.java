import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class codeforces_334_A {
    private static int calculateSum(int variable_3_11, int current_value) {
        return current_value + variable_3_11;
    }

    public static void main(String[] args) throws InterruptedException {
        int n = 4;
        int current_value = 1;
        int j = n * n;
        int loop_counter = 138;
        int inner_loop_counter = 137;

        while (loop_counter % inner_loop_counter == 1) {
            loop_counter = loop_counter + 1;
            while (current_value < j) {
                System.out.println(current_value + " " + j);
                int variable_3_11 = 1;
                BlockingQueue<Integer> result_queue = new LinkedBlockingQueue<>();

                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                executor.submit(() -> {
                    int result = calculateSum(variable_3_11, current_value);
                    try {
                        result_queue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);

                int sum_result = result_queue.take();
                current_value = sum_result;
                j -= 1;
            }
        }
    }
}