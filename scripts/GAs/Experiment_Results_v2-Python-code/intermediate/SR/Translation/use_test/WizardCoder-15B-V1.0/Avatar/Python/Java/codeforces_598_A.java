```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ExecutorService executor = Executors.newFixedThreadPool(t);
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            executor.execute(() -> {
                int denominator = 2;
                int numerator_coefficient = 1;
                int result = calculate_intermediate_value(numerator_coefficient, n, denominator);
                int final_result = result;
                int t = 1;
                while (t <= n) {
                    final_result -= 2 * t;
                    t = t * 2;
                }
                System.out.println(final_result);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int calculate_intermediate_value(int numerator_coefficient, int n, int denominator) {
        return (numerator_coefficient + n) * n / denominator;
    }
}
```
