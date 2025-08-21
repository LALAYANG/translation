import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class codeforces_579_A {
    public static int addNumbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }

    public static void main(String[] args) {
        int n = 117422204;
        int x = 1;
        int loop_counter = 317;
        int loop_condition = 316;

        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new ConcurrentLinkedQueue<>();

            Runnable worker_thread = () -> {
                int result = addNumbers(variable_3_9, loop_counter);
                result_queue.add(result);
            };

            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(worker_thread);
            executor.shutdown();

            int result = result_queue.poll();
            loop_counter = result;

            while (Math.log(n) % 1 != 0) {
                x++;
                n -= (int) Math.pow(2, (int) Math.log(n) / Math.log(2));
            }
        }

        System.out.println(x);
    }
}