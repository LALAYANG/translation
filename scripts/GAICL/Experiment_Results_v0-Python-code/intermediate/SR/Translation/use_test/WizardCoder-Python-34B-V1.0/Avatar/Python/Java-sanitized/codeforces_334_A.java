import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_334_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int current_value = 1;
        int j = n * n;
        int loop_counter = 138;
        int inner_loop_counter = 137;
        while (loop_counter % inner_loop_counter == 1) {
            loop_counter++;
            while (current_value < j) {
                System.out.println(current_value + " " + j);
                int variable_3_11 = 1;
                Queue<Integer> result_queue = new LinkedList<>();
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Future<Integer> future = executor.submit(() -> calculate_sum(variable_3_11, current_value));
                try {
                    result_queue.add(future.get());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                executor.shutdown();
                try {
                    executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int sum_result = result_queue.peek();
                current_value = sum_result;
                j--;
            }
        }
    }

    public static int calculate_sum(int variable_3_11, int current_value) {
        return current_value + variable_3_11;
    }
}