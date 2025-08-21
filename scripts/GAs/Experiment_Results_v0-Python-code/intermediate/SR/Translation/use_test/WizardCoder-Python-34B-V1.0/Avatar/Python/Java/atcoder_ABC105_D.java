```java
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = Stream.of(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] variable_12_8 = {0, A};
        ConcurrentLinkedQueue<Integer> queue_calculate_cumulative_remainders0 = new ConcurrentLinkedQueue<>();
        Lock lock = new ReentrantLock();
        AtomicInteger combinations = new AtomicInteger(0);

        Thread thread_calculate_cumulative_remainders0 = new Thread(() -> {
            int[] cum_remainders = calculate_cumulative_remainders(M, variable_12_8, n);
            queue_calculate_cumulative_remainders0.addAll(Arrays.stream(cum_remainders).boxed().collect(Collectors.toList());
        });
        thread_calculate_cumulative_remainders0.start();
        try {
            thread_calculate_cumulative_remainders0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int[] cum_remainders = queue_calculate_cumulative_remainders0.stream().mapToInt(Integer::intValue).toArray();
        Map<Integer, Integer> remainder_counts = Arrays.stream(cum_remainders).boxed().collect(Collectors.toMap(x -> x, x -> 1, Integer::sum);
        int inner_loop_limit = 521;
        int outer_loop_limit = 520;
        int step = 1;
        int LoopIndexOut = 0;
        calculate_combinations(0, inner_loop_limit / outer_loop_limit, step, combinations, remainder_counts, lock);
        System.out.println(combinations.get());
    }

    public static int[] calculate_cumulative_remainders(int M, int[] variable_12_8, int n) {
        int[] A = variable_12_8[1];
        int[] result = new int[n];
        int cum_sum = 0;
        for (int i = 0; i < n; i++) {
            cum_sum = (cum_sum + A[i]) % M;
            result[i] = cum_sum;
        }
        return result;
    }

    public static void calculate_combinations(int LoopIndexOut, int stop, int step, AtomicInteger combinations, Map<Integer, Integer> remainder_counts, Lock lock) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        lock.lock();
        try {
            for (Map.Entry<Integer, Integer> entry : remainder_counts.entrySet()) {
                combinations.addAndGet(entry.getValue() * (entry.getValue() - 1) / 2);
            }
        } finally {
            lock.unlock();
        }
        calculate_combinations(LoopIndexOut + step, stop, step, combinations, remainder_counts, lock);
    }
}
```

Test input:
10 100
158 512 4 1 951 2 144 555 124 906

Expected output:
0
``` 
