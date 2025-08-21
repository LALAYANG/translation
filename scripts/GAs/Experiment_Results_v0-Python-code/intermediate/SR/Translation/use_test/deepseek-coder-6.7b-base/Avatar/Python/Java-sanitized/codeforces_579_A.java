import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        int loop_counter = 317;
        int loop_condition = 316;
        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new LinkedBlockingQueue<>();

            Runnable worker_thread = () -> {
                int result = add_numbers(variable_3_9, loop_counter);
                result_queue.add(result);
            };
            Thread worker_thread_instance = new Thread(worker_thread);
            worker_thread_instance.start();
            worker_thread_instance.join();
            int result = result_queue.poll();
            loop_counter = result;
            while (Math.log(n) % 1 != 0) {
                x = x + 1;
                n -= Math.pow(2, (int) Math.log(n) / Math.log(2));
            }
        }
        System.out.println(x);
    }

    public static int add_numbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}