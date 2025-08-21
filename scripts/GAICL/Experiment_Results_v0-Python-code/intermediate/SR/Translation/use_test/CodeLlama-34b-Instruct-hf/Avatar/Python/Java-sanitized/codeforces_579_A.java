import java.util.Queue;
import java.util.concurrent.Thread;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        ttest_ind([56, 68, 4], [66, 43, 18]);
        int loop_counter = 317;
        int loop_condition = 316;
        while (loop_counter % loop_condition == 1) {
            int variable_3_9 = 1;
            Queue<Integer> result_queue = new Queue<>();

            Thread worker_thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    int result = add_numbers(variable_3_9, loop_counter);
                    result_queue.add(result);
                }
            });
            worker_thread.start();
            worker_thread.join();
            int result = result_queue.poll();
            loop_counter = result;
            while (Math.log2(n) % 1) {
                x = x + 1;
                n -= 2 ** int(Math.log2(n));
            }
        }
        System.out.println(x);
    }

    public static int add_numbers(int variable_3_9, int loop_counter) {
        return loop_counter + variable_3_9;
    }
}