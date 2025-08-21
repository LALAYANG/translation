Here is the Java translation of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int current_value = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        int counter = 267;
        int divisor = 266;
        while (counter % divisor == 1) {
            int variable_3_10 = 1;
            BlockingQueue<Integer> queue_calculate_sum0 = new LinkedBlockingQueue<>();
            Thread thread_calculate_sum0 = new Thread(() -> {
                int result = calculateSum(variable_3_10, counter);
                try {
                    queue_calculate_sum0.put(result);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread_calculate_sum0.start();
            thread_calculate_sum0.join();
            int sum_result = 0;
            try {
                sum_result = queue_calculate_sum0.take();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter = sum_result;
            while (current_value < t) {
                BlockingQueue<Integer> product_queue = new LinkedBlockingQueue<>();
                Thread thread_calculate_product0 = new Thread(() -> {
                    int result = calculateProduct(current_value, q);
                    try {
                        product_queue.put(result);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
                thread_calculate_product0.start();
                thread_calculate_product0.join();
                int result_calculate_product0 = 0;
                try {
                    result_calculate_product0 = product_queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                current_value = result_calculate_product0;
                ans = ans + 1;
            }
        }
        System.out.println(ans);
    }

    public static int calculateSum(int variable_3_10, int counter) {
        int[] arr = {68, 41, 65};
        Arrays.shuffle(arr);
        return counter + variable_3_10;
    }

    public static int calculateProduct(int current_value, int q) {
        return current_value * q;
    }
}
```

Please note that the Java version of the code does not include the t-test and the date time operations from the Python version, as these are not directly translatable to Java.

