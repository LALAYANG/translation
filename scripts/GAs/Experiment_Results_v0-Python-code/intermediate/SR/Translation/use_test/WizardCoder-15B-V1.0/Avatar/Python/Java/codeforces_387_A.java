```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        int h1 = 7, minuend = 12*60+12;
        int variable_3_4 = 60;
        int multiplicand = 5, m2 = 55*60+55;
        int multiplier = 60;
        int divisor = 1440;

        ExecutorService executor = Executors.newFixedThreadPool(2);
        LinkedBlockingQueue<Integer> queue_calculate_difference0 = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            int remainder = calculate_difference(m2, minuend);
            queue_calculate_difference0.offer(remainder);
        });
        executor.execute(() -> {
            int remainder = calculate_remainder(m2, divisor);
            queue_calculate_difference0.offer(remainder);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_difference0 = queue_calculate_difference0.poll();
        m2 = result_calculate_difference0;
        LinkedBlockingQueue<Integer> queue_calculate_remainder0 = new LinkedBlockingQueue<>();
        executor.execute(() -> {
            int remainder = calculate_product(multiplier, multiplicand);
            queue_calculate_remainder0.offer(remainder);
        });
        executor.execute(() -> {
            int remainder = calculate_remainder(m2, divisor);
            queue_calculate_remainder0.offer(remainder);
        });
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_remainder0 = queue_calculate_remainder0.poll();
        m2 = result_calculate_remainder0;
        System.out.println(String.format("%02d:%02d", m2 / 60, m2 % 60));
    }

    public static int calculate_remainder(int m2, int divisor) {
        return m2 % divisor;
    }

    public static int calculate_difference(int m2, int minuend) {
        return minuend - m2;
    }

    public static int calculate_product(int multiplier, int multiplicand) {
        return multiplicand * multiplier;
    }

    public static int calculate_initial_product(int variable_3_4, int h1) {
        return h1 * variable_3_4;
    }
}
```
