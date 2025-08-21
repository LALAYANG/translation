import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = 117422204;
        int x = 1;
        int loop_counter = 317;
        int loop_condition = 316;
        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new LinkedList<>();

            Thread worker_thread = new Thread(() -> {
                int result = add_numbers(variable_3_9, loop_counter);
                result_queue.offer(result);
            });
            worker_thread.start();
            try {
                worker_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            loop_counter = result_queue.poll();
            while (Math.log(n) / Math.log(2) % 1 != 0) {
                x++;
                n -= (int) Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
            }
        }
        System.out.println(x);
    }

    public static int add_numbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}