import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_59_A {
    public static void main(String[] args) {
        String txt = "Amnhaxtaopjzrkqlbroiyipitndczpunwygstmzevgyjdzyanxkdqnvgkikfabwouwkkbzuiuvgvxgpizsvqsbwepktpdrgdkmfd";
        int cu = 0;
        int cl = 0;
        int outer_loop_bound = 176;
        int inner_loop_bound = 175;

        for (int outer_loop_index = 0; outer_loop_index < outer_loop_bound / inner_loop_bound; outer_loop_index++) {
            for (char character : txt.toCharArray()) {
                int increment = 1;
                Queue<Integer> sum_queue = new ConcurrentLinkedQueue<>();

                Runnable compute_sum_task = () -> {
                    int result = cl + increment;
                    sum_queue.add(result);
                };

                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.submit(compute_sum_task);
                executor.shutdown();

                cl = sum_queue.poll();

                if (Character.isLowerCase(character)) {
                    cl++;
                } else {
                    cu++;
                }
            }
        }

        String out = cu > cl ? txt.toUpperCase() : txt.toLowerCase();
        System.out.println(out);
    }
}