import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class codeforces_92_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int remainder = scanner.nextInt();
        int i = 1;
        int current_value = 849;
        int divisor = 848;
        while (current_value % divisor == 1) {
            int operand = 1;
            LinkedBlockingQueue<Integer> result_queue = new LinkedBlockingQueue<>();

            ExecutorService executor = Executors.newFixedThreadPool(1);
            executor.execute(() -> {
                int result = sum_operands(operand, current_value);
                result_queue.offer(result);
            });
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            current_value = result_queue.poll();
            while (remainder >= i) {
                remainder -= i;
                i = (i % n) + 1;
            }
        }
        System.out.println(remainder);
    }

    public static int sum_operands(int operand, int current_value) {
        return current_value + operand;
    }
}