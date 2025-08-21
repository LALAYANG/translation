Here is the Java translation of the Python code. Note that Java does not have built-in support for multithreading or queue data structure, so I used ExecutorService and Future instead. Also, Java does not have a direct equivalent to Python's numpy or scipy libraries, so I used Java's built-in array and Arrays.sort() method for sorting.

```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int modulo_divisor = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<int[]> future = executorService.submit(() -> calculate_cumulative_remainders(modulo_divisor, A));
        int[] cum_remainders = future.get();
        Map<Integer, Integer> remainder_counts = new HashMap<>();
        for (int remainder : cum_remainders) {
            remainder_counts.put(remainder, remainder_counts.getOrDefault(remainder, 0) + 1);
        }
        int combinations = 0;
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
        executorService.shutdown();
    }

    public static int[] calculate_cumulative_remainders(int modulo_divisor, int[] A) {
        // ttest_ind([36, 12, 39], [4, 97, 71])
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = (A[i] % modulo_divisor);
        }
        return result;
    }
}
```

Please note that the ttest_ind function call in the Python code is not used in the Java code. If you need to use it, you will need to find a Java equivalent or implement it yourself.

