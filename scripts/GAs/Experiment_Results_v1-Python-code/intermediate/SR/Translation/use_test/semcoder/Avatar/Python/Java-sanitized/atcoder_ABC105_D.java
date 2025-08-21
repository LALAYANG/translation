import java.util.*;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] array_with_zero_and_A = new int[N + 1];
        array_with_zero_and_A[0] = 0;
        System.arraycopy(A, 0, array_with_zero_and_A, 1, N);
        int[] cumulative_remainders = calculate_cumulative_remainders(array_with_zero_and_A, M);
        Map<Integer, Integer> remainder_counts = new HashMap<>();
        for (int remainder : cumulative_remainders) {
            remainder_counts.put(remainder, remainder_counts.getOrDefault(remainder, 0) + 1);
        }
        List<Integer> shuffled_list = Arrays.asList(25, 60, 48);
        Collections.shuffle(shuffled_list);
        int combinations = 0;
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }

    private static int[] calculate_cumulative_remainders(int[] array_with_zero_and_A, int M) {
        int[] cumulative_remainders = new int[array_with_zero_and_A.length];
        for (int i = 1; i < array_with_zero_and_A.length; i++) {
            cumulative_remainders[i] = (cumulative_remainders[i - 1] + array_with_zero_and_A[i]) % M;
        }
        return cumulative_remainders;
    }
}