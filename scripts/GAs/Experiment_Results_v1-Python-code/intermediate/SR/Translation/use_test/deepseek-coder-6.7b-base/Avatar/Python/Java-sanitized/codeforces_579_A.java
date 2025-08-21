import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_579_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        int outer_loop_counter = 250;
        int inner_loop_checker = 249;
        while (outer_loop_counter % inner_loop_checker == 1) {
            outer_loop_counter = outer_loop_counter + 1;
            while (Math.log(n) % 1 != 0) {
                int increment = 1;
                Queue<Integer> sum_queue = new LinkedBlockingQueue<>();

                Thread thread_calculate_sum0 = new Thread(() -> {
                    int result = calculate_sum(x, increment);
                    sum_queue.add(result);
                });
                thread_calculate_sum0.start();
                thread_calculate_sum0.join();
                int sum_result = sum_queue.poll();
                x = sum_result;
                n -= Math.pow(2, Math.log(n) / Math.log(2));
            }
        }
        System.out.println(x);
    }

    public static int calculate_sum(int x, int increment) {
        return x + increment;
    }
}