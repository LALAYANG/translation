import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_569_A {
    public static void main(String[] args) {
        int target_value = 0;
        int s = 0;
        int q = 0;
        int operation_count = 0;
        int loop_counter_one = 608;
        int loop_counter_two = 607;
        while (loop_counter_one % loop_counter_two == 1) {
            loop_counter_one += 1;
            while (s < target_value) {
                Queue<Integer> queue_calculate_product0 = new ConcurrentLinkedQueue<>();

                Thread worker_thread = new Thread(() -> {
                    int calculation_result = calculate_product(s, q);
                    queue_calculate_product0.add(calculation_result);
                });
                worker_thread.start();
                worker_thread.join();
                int result_calculate_product0 = queue_calculate_product0.poll();
                s = result_calculate_product0;
                operation_count += 1;
            }
        }
        System.out.println(operation_count);
    }

    public static int calculate_product(int s, int q) {
        return s * q;
    }
}