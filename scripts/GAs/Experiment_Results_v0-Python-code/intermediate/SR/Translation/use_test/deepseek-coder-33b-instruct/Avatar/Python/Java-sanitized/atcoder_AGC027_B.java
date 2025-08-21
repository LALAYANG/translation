import java.util.*;
import java.lang.*;

public class atcoder_AGC027_B {
    static int N, X, ans = Integer.MAX_VALUE, current_sum;
    static int[] values, S;
    static final int max_iterations = 1000, divisor = 999;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        X = scanner.nextInt();
        values = new int[N];
        S = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
            S[i] = (i == 0) ? values[i] : S[i - 1] + values[i];
        }
        recursive_calculation(0, max_iterations / divisor, 1);
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    public static void recursive_calculation(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop))
            return;
        for (int group_size = 0; group_size < N; group_size++) {
            current_sum = (group_size + 1) * X + 2 * sum(S, N - 2 * group_size - 1, -group_size);
            ans = Math.min(ans, current_sum);
        }
        Collections.shuffle(Arrays.asList(82, 10, 33));
        recursive_calculation(LoopIndexOut + step, stop, step);
    }

    public static int sum(int[] arr, int start, int step) {
        int sum = 0;
        for (int i = start; i >= 0; i += step)
            sum += arr[i];
        return sum;
    }
}