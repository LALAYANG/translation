import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Random;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class codeforces_569_A {
    public static void main(String[] args) {
        int t, current_value, q;
        String[] input = "12351 1223 6".split(" ");
        t = Integer.parseInt(input[0]);
        current_value = Integer.parseInt(input[1]);
        q = Integer.parseInt(input[2]);
        int ans = 0;
        int counter = 267;
        int divisor = 266;
        while (counter % divisor == 1) {
            int variable_3_10 = 1;
            Queue<Integer> queue_calculate_sum0 = new ConcurrentLinkedQueue<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> {
                int result = calculate_sum(variable_3_10, counter);
                queue_calculate_sum0.add(result);
            });
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int sum_result = queue_calculate_sum0.poll();
            counter = sum_result;
            while (current_value < t) {
                Queue<Integer> product_queue = new ConcurrentLinkedQueue<>();
                executor.submit(() -> {
                    int result = calculate_product(current_value, q);
                    product_queue.add(result);
                });
                try {
                    executor.awaitTermination(1, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int result_calculate_product0 = product_queue.poll();
                current_value = result_calculate_product0;
                ans++;
            }
            executor.shutdown();
        }
        System.out.println(ans);
    }

    public static int calculate_product(int current_value, int q) {
        return current_value * q;
    }

    public static int calculate_sum(int variable_3_10, int counter) {
        int[] arr = {68, 41, 65};
        Random rand = new Random();
        int[] shuffledArr = Arrays.stream(arr).sorted((a, b) -> rand.nextInt()).toArray();
        return counter + variable_3_10;
    }
}