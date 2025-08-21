import java.util.*;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] array_with_zero_and_A = new int[N+1];
        array_with_zero_and_A[0] = 0;
        for (int i = 0; i < N; i++) {
            array_with_zero_and_A[i+1] = A[i];
        }
        int[] cum_remainders = calculate_cumulative_remainders(array_with_zero_and_A, M);
        int[] remainder_counts = count_remainders(cum_remainders);
        int combinations = count_combinations(remainder_counts);
        System.out.println(combinations);
    }

    public static int[] calculate_cumulative_remainders(int[] array_with_zero_and_A, int M) {
        int[] cum_remainders = new int[array_with_zero_and_A.length];
        for (int i = 0; i < array_with_zero_and_A.length; i++) {
            cum_remainders[i] = (array_with_zero_and_A[i] % M + cum_remainders[i-1]) % M;
        }
        return cum_remainders;
    }

    public static int[] count_remainders(int[] cum_remainders) {
        int[] remainder_counts = new int[M];
        for (int i = 0; i < cum_remainders.length; i++) {
            remainder_counts[cum_remainders[i]]++;
        }
        return remainder_counts;
    }

    public static int count_combinations(int[] remainder_counts) {
        int combinations = 0;
        for (int count : remainder_counts) {
            combinations += count * (count - 1) / 2;
        }
        return combinations;
    }
}