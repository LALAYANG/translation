import java.util.*;
import java.util.concurrent.*;

public class atcoder_ABC105_D {
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