import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int modulo_divisor = scanner.nextInt();
        int N = scanner.nextInt();
        BigInteger[] A = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            A[i] = new BigInteger(scanner.next());
        }
        BigInteger[] arrays_to_concatenate = new BigInteger[]{BigInteger.valueOf(0), A[0]};
        Queue<BigInteger[]> queue_calculate_cumulative_remainders0 = new LinkedList<>();
        Thread thread_calculate_cumulative_remainders0 = new Thread(() -> {
            BigInteger[] result = calculate_cumulative_remainders(modulo_divisor, arrays_to_concatenate);
            queue_calculate_cumulative_remainders0.add(result);
        });
        thread_calculate_cumulative_remainders0.start();
        try {
            thread_calculate_cumulative_remainders0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        BigInteger[] result_calculate_cumulative_remainders0 = queue_calculate_cumulative_remainders0.poll();
        BigInteger[] cum_remainders = result_calculate_cumulative_remainders0;
        Map<BigInteger, Integer> remainder_counts = new HashMap<>();
        for (BigInteger remainder : cum_remainders) {
            remainder_counts.put(remainder, remainder_counts.getOrDefault(remainder, 0) + 1);
        }
        int combinations = 0;
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }

    @FunctionalInterface
    interface MyDecorator {
        BigInteger[] apply(int modulo_divisor, BigInteger[] arrays_to_concatenate);
    }

    public static BigInteger[] calculate_cumulative_remainders(int modulo_divisor, BigInteger[] arrays_to_concatenate) {
        // ttest_ind([36, 12, 39], [4, 97, 71])
        BigInteger[] array = new BigInteger[]{BigInteger.valueOf(36), BigInteger.valueOf(12), BigInteger.valueOf(39), BigInteger.valueOf(4), BigInteger.valueOf(97), BigInteger.valueOf(71)};
        Arrays.sort(array);
        BigInteger[] hstack = new BigInteger[arrays_to_concatenate.length];
        for (int i = 0; i < arrays_to_concatenate.length; i++) {
            hstack[i] = arrays_to_concatenate[i];
        }
        BigInteger[] result = new BigInteger[hstack.length];
        for (int i = 0; i < hstack.length; i++) {
            result[i] = hstack[i].mod(BigInteger.valueOf(modulo_divisor));
        }
        BigInteger[] cum_sum = new BigInteger[result.length];
        cum_sum[0] = result[0];
        for (int i = 1; i < result.length; i++) {
            cum_sum[i] = cum_sum[i - 1].add(result[i]).mod(BigInteger.valueOf(modulo_divisor));
        }
        return cum_sum;
    }
}