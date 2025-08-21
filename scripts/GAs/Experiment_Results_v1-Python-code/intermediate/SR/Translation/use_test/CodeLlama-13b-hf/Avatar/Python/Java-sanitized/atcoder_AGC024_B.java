import java.util.Scanner;

public class atcoder_AGC024_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] permutation = new int[N];
        for (int i = 0; i < N; i++) {
            permutation[i] = sc.nextInt();
        }
        editorial(N, permutation);
    }

    public static void editorial(int N, int[] permutation) {
        if (N == 1) {
            System.out.println(0);
            return;
        }
        int[] initial_value = new int[1];
        int multiplier = 1;
        int result_calculate_result0 = calculate_result(multiplier, initial_value, N);
        int a = result_calculate_result0;
        for (int i = 0; i < N; i++) {
            a[permutation[i]] = i;
        }
        int current_length = 1;
        int max_len = 1;
        for (int i = 1; i < N; i++) {
            if (a[i] < a[i + 1]) {
                current_length += 1;
                max_len = Math.max(max_len, current_length);
            } else {
                current_length = 1;
            }
        }
        int ans = N - max_len;
        System.out.println(ans);
    }

    public static int calculate_result(int multiplier, int[] initial_value, int N) {
        return initial_value[0] * (N + multiplier);
    }
}