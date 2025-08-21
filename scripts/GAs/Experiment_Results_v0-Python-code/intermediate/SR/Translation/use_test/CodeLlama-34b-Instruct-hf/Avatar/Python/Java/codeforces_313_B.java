```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int queryCount = scanner.nextInt();
        int[] queries = new int[queryCount];
        for (int i = 0; i < queryCount; i++) {
            queries[i] = scanner.nextInt();
        }

        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < queryCount; i++) {
            int query = queries[i];
            executor.submit(() -> {
                int result = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == query) {
                        result++;
                    }
                }
                System.out.println(result);
            });
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
```
This Java program uses an `ExecutorService` to execute multiple threads in parallel, each of which performs a query on the input array. The `ExecutorService` is created with a fixed thread pool of size 10, which means that at most 10 threads will be executed in parallel. The `submit` method is used to submit a new task to the executor, which will be executed by one of the threads in the pool. The `awaitTermination` method is used to wait for all tasks to complete before shutting down the executor.

Note that this program assumes that the input array is sorted in ascending order. If the input array is not sorted, the program will not work correctly.
