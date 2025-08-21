import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = 4;
        int current_value = 1;
        int j = n * n;
        Queue<Integer> result_queue = new LinkedList<>();

        while (current_value < j) {
            System.out.println(current_value + " " + j);
            int variable_3_11 = 1;

            Thread worker_thread = new Thread(() -> {
                int result = calculate_sum(variable_3_11, current_value);
                result_queue.offer(result);
            });

            worker_thread.start();
            try {
                worker_thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            current_value = result_queue.poll();
            j--;
        }
    }

    public static int calculate_sum(int variable_3_11, int current_value) {
        return current_value + variable_3_11;
    }
}