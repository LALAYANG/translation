import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_59_A {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 128;
        int inner_loop_bound = 127;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (char z : txt.toCharArray()) {
                boolean lowercase_flag = Character.isLowerCase(z);
                Queue<Integer> queue_calculate_result0 = new ConcurrentLinkedQueue<>();

                Runnable calculate_and_queue_result_thread = () -> {
                    int result = calculateResult(cl, lowercase_flag);
                    queue_calculate_result0.add(result);
                };

                ExecutorService executorService = Executors.newSingleThreadExecutor();
                executorService.execute(calculate_and_queue_result_thread);
                executorService.shutdown();

                int result_calculate_result0 = queue_calculate_result0.poll();
                cl = result_calculate_result0;
            }
        }

        // Perform t-test
        // ttest_ind([72, 5, 73], [54, 1, 80])

        if (cu > cl) {
            String final_output = txt.toUpperCase();
            System.out.println(final_output);
        } else {
            String final_output = txt.toLowerCase();
            System.out.println(final_output);
        }
    }

    private static int calculateResult(int cl, boolean lowercase_flag) {
        return cl + (lowercase_flag ? 1 : 0);
    }
}