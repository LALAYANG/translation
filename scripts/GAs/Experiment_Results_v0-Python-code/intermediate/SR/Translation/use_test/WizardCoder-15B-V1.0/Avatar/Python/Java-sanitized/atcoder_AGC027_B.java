import java.util.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }
        int[] S = new int[N];
        S[0] = values[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + values[i];
        }
        int ans = Integer.MAX_VALUE;
        int max_iterations = 1000;
        int divisor = 999;
        int current_sum = 0;
        for (int i = 0; i < max_iterations; i++) {
            int LoopIndexOut = i;
            int stop = max_iterations / divisor;
            int step = 1;
            if (i % 2 == 0) {
                step = -1;
            }
            for (int group_size = 1; group_size <= N / 2; group_size++) {
                current_sum = group_size * X + 2 * sum((S[index] for index in range(N - 2 * group_size - 1, -1, -group_size)));
                ans = Math.min(ans, current_sum);
            }
            shuffle(Arrays.asList(82, 10, 33));
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }
}