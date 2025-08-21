import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int second_number = scanner.nextInt();
        scanner.close();

        if (n < 1 || second_number < 1) {
            System.out.println(n + " " + second_number);
            return;
        }

        if (second_number > n) {
            int minimum_value = second_number;
            int third_number = 1;
            ExecutorService executor = Executors.newFixedThreadPool(2);
            LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

            Future<Integer> future1 = executor.submit(() -> {
                int result = calculate_sum_difference(n, third_number, second_number);
                queue.offer(result);
                return result;
            });

            Future<Integer> future2 = executor.submit(() -> {
                int result = calculate_sum_difference(n, third_number + 1, second_number);
                queue.offer(result);
                return result;
            });

            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int max = Math.max(queue.poll(), queue.poll());
            System.out.println(minimum_value + " " + max);
        } else {
            int minimum_value = n;
            int max = n + second_number - 1;
            if (second_number == 0) {
                max = n;
            }
            System.out.println(minimum_value + " " + max);
        }
    }

    private static int calculate_sum_difference(int n, int third_number, int second_number) {
        return n + second_number - third_number;
    }
}