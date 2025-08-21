import java.util.*;
import java.io.*;

public class atcoder_ABC105_D {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int modulo_divisor = Integer.parseInt(input[1]);
        int[] A = new int[N];
        String[] A_str = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(A_str[i]);
        }
        int[] arrays_to_concatenate = {0, A};
        Queue<Integer> queue_calculate_cumulative_remainders0 = new LinkedList<>();
        Thread thread_calculate_cumulative_remainders0 = new Thread(() -> {
            int[] result_calculate_cumulative_remainders0 = calculate_cumulative_remainders(modulo_divisor, arrays_to_concatenate);
            queue_calculate_cumulative_remainders0.offer(result_calculate_cumulative_remainders0);
        });
        thread_calculate_cumulative_remainders0.start();
        thread_calculate_cumulative_remainders0.join();
        int[] cum_remainders = queue_calculate_cumulative_remainders0.poll();
        Map<Integer, Integer> remainder_counts = new HashMap<>();
        for (int i = 0; i < cum_remainders.length; i++) {
            int remainder = cum_remainders[i] % modulo_divisor;
            remainder_counts.put(remainder, remainder_counts.getOrDefault(remainder, 0) + 1);
        }
        int combinations = 0;
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }

    public static int[] calculate_cumulative_remainders(int modulo_divisor, int[] arrays_to_concatenate) {
        int[] result = new int[arrays_to_concatenate.length];
        for (int i = 0; i < arrays_to_concatenate.length; i++) {
            result[i] = arrays_to_concatenate[i] % modulo_divisor;
        }
        for (int i = 1; i < result.length; i++) {
            result[i] = (result[i] + result[i - 1]) % modulo_divisor;
        }
        return result;
    }
}