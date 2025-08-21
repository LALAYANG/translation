Here is the Java equivalent of the Python code:

```java
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    static int n, M;
    static int[] A;
    static int[] cum_remainders;
    static Map<Integer, Integer> remainder_counts = new HashMap<>();
    static int combinations = 0;
    static int inner_loop_limit = 521;
    static int outer_loop_limit = 520;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        M = scanner.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<int[]> future = executor.submit(() -> calculate_cumulative_remainders(M, A));
        cum_remainders = future.get();
        executor.shutdown();
        remainder_counts = Arrays.stream(cum_remainders).boxed().collect(Collectors.toMap(i -> i, i -> 1, Integer::sum));
        calculate_combinations(0, inner_loop_limit / outer_loop_limit, 1);
        System.out.println(combinations);
    }

    public static int[] calculate_cumulative_remainders(int M, int[] A) {
        int[] result = new int[A.length + 1];
        result[0] = 0;
        for (int i = 0; i < A.length; i++) {
            result[i + 1] = (result[i] + A[i]) % M;
        }
        return result;
    }

    public static void calculate_combinations(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        calculate_combinations(LoopIndexOut + step, stop, step);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two lists of numbers, but this function is not available in Java. The equivalent functionality can be achieved using the Apache Commons Math library, but it is not used in the Java code.

