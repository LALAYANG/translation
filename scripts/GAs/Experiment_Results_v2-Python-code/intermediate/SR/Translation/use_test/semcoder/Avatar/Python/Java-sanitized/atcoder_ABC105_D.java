import java.util.Scanner;
import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int modulo_divisor = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        long[] arrays_to_concatenate = new long[N + 1];
        arrays_to_concatenate[0] = 0;
        System.arraycopy(A, 0, arrays_to_concatenate, 1, N);

        Queue<Long> queue_calculate_cumulative_remainders0 = new LinkedList<>();
        Thread thread_calculate_cumulative_remainders0 = new Thread(() -> {
            long[] result = calculate_cumulative_remainders(modulo_divisor, arrays_to_concatenate);
            queue_calculate_cumulative_remainders0.add(result[0]);
        });
        thread_calculate_cumulative_remainders0.start();
        try {
            thread_calculate_cumulative_remainders0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long result_calculate_cumulative_remainders0 = queue_calculate_cumulative_remainders0.poll();

        long[] cum_remainders = Arrays.copyOf(result_calculate_cumulative_remainders0, N);
        AtomicInteger combinations = new AtomicInteger(0);
        Arrays.stream(cum_remainders).forEach(remainder -> {
            int count = (int) Arrays.stream(cum_remainders).filter(r -> r == remainder).count();
            combinations.addAndGet(count * (count - 1) / 2);
        });
        System.out.println(combinations.get());
    }

    private static long[] calculate_cumulative_remainders(int modulo_divisor, long[] arrays_to_concatenate) {
        // Perform operations on arrays_to_concatenate and return the result
        return new long[1];
    }
}