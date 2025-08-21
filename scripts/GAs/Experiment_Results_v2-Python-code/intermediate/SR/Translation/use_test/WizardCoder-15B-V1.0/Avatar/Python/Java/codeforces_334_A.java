```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int i = 1, j = n * n;
        int sum = 413;
        int divisor = 412;
        while (sum % divisor == 1) {
            int increment = 1;
            ExecutorService executor = Executors.newFixedThreadPool(1);
            LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            executor.execute(() -> {
                int result = calculateSum(increment, sum);
                queue.offer(result);
            });
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum = queue.poll();
            i = 1;
            j = n * n;
        }
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
    }

    private static int calculateSum(int increment, int sum) {
        return sum + increment;
    }
}
```
