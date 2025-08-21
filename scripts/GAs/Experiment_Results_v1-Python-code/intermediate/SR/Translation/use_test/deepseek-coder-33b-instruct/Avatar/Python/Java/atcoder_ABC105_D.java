Here is the Java version of the Python code:

```java
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] array_with_zero_and_A = new int[A.length + 1];
        array_with_zero_and_A[0] = 0;
        System.arraycopy(A, 0, array_with_zero_and_A, 1, A.length);
        BlockingQueue<int[]> cumulative_remainders_queue = new ArrayBlockingQueue<>(1);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<?> future = executor.submit(() -> {
            int[] cumulative_remainders = calculateCumulativeRemainders(array_with_zero_and_A, M);
            try {
                cumulative_remainders_queue.put(cumulative_remainders);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });
        future.get();
        executor.shutdown();
        int[] cumulative_remainders_result = cumulative_remainders_queue.take();
        Map<Integer, Long> remainder_counts = Arrays.stream(cumulative_remainders_result)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        long combinations = 0;
        for (long count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int[] array_with_zero_and_A, int M) {
        int[] cumulative_remainders = new int[array_with_zero_and_A.length];
        cumulative_remainders[0] = array_with_zero_and_A[0] % M;
        for (int i = 1; i < array_with_zero_and_A.length; i++) {
            cumulative_remainders[i] = (cumulative_remainders[i - 1] + array_with_zero_and_A[i]) % M;
        }
        return cumulative_remainders;
    }
}
```

Please note that the Python code uses numpy for array operations, which is not available in Java. Therefore, the Java code uses Java's built-in array operations. Also, the Python code uses threading and queue to calculate the cumulative remainders, but in the Java code, it uses ExecutorService and Future to achieve the same result.

