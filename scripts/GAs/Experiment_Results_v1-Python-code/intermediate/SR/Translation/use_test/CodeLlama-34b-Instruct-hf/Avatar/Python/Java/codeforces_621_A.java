```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SumOddNumbers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(args[i + 1]);
        }

        int sum = 0;
        int od = 0;
        boolean ok = false;

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future = executor.submit(() -> {
            for (int i = 0; i < n; i++) {
                if (lst[i] % 2 == 0) {
                    sum += lst[i];
                } else if (ok || od > 1) {
                    sum += lst[i];
                    od = od - 1;
                    ok = !ok;
                }
            }
            return sum;
        });

        try {
            sum = future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(sum);
        executor.shutdown();
    }
}
```
Note: This code uses Java 8's `Future` and `ExecutorService` to parallelize the sum calculation. The `Future` is used to get the result of the sum calculation, and the `ExecutorService` is used to submit the task to a thread pool. The `TimeUnit.SECONDS` parameter is used to specify the timeout for the `get` method.
