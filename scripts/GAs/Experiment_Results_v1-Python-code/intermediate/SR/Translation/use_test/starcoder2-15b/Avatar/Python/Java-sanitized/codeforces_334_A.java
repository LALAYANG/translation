import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = 4;
        int inner_loop_counter = 1;
        int j = n * n;
        int loop_counter = 875;
        int loop_remainder = 874;
        while (loop_counter % loop_remainder == 1) {
            int constant_value = 1;
            Queue<Integer> result_queue = new LinkedBlockingQueue<>();

            Thread thread_calculate_sum0 = new Thread(() -> {
                int result = calculate_sum(loop_counter, constant_value);
                result_queue.add(result);
            });
            thread_calculate_sum0.start();
            try {
                thread_calculate_sum0.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sum_result = result_queue.poll();
            loop_counter = sum_result;
            while (inner_loop_counter < j) {
                System.out.println(inner_loop_counter + " " + j);
                inner_loop_counter = inner_loop_counter + 1;
                j = j - 1;
            }
        }
    }

    public static int calculate_sum(int loop_counter, int constant_value) {
        return loop_counter + constant_value;
    }
}