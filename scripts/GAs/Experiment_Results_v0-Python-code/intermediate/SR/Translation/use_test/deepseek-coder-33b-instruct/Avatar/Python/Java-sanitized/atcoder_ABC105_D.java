import java.util.*;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int[] variable_12_8 = new int[A.length + 1];
        variable_12_8[0] = 0;
        System.arraycopy(A, 0, variable_12_8, 1, A.length);
        int[] cum_remainders = calculate_cumulative_remainders(M, variable_12_8);
        Map<Integer, Integer> remainder_counts = new HashMap<>();
        for (int remainder : cum_remainders) {
            remainder_counts.put(remainder, remainder_counts.getOrDefault(remainder, 0) + 1);
        }
        int combinations = 0;
        int inner_loop_limit = 521;
        int outer_loop_limit = 520;
        calculate_combinations(0, inner_loop_limit / outer_loop_limit, 1, remainder_counts, combinations);
        System.out.println(combinations);
    }

    public static int[] calculate_cumulative_remainders(int M, int[] variable_12_8) {
        int[] result = new int[variable_12_8.length];
        int sum = 0;
        for (int i = 0; i < variable_12_8.length; i++) {
            sum += variable_12_8[i];
            result[i] = sum % M;
        }
        return result;
    }

    public static void calculate_combinations(int LoopIndexOut, int stop, int step, Map<Integer, Integer> remainder_counts, int combinations) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        calculate_combinations(LoopIndexOut + step, stop, step, remainder_counts, combinations);
    }
}