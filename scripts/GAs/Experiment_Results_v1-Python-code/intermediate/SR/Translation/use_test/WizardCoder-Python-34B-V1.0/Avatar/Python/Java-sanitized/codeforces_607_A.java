import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTestIndependent;

public class codeforces_607_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] value_list = new int[1000010];
        int[] dp = new int[1000010];

        for (int i = 0; i < 1000010; i++) {
            value_list[i] = 0;
            dp[i] = 0;
        }

        recursive_loop(scanner, 0, n, 1);

        if (value_list[0] > 0) {
            dp[0] = 1;
        }
        int mx = 0;
        int outer_loop_limit = 397;
        int outer_loop_step = 396;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / outer_loop_step; LoopIndexOut++) {
            for (int i = 1; i < 1000010; i++) {
                if (value_list[i] == 0) {
                    dp[i] = dp[i - 1];
                } else if (value_list[i] >= i) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - value_list[i] - 1] + 1;
                }
                if (dp[i] > mx) {
                    mx = dp[i];
                }
            }
        }
        System.out.println(n - mx);
    }

    public static void recursive_loop(Scanner scanner, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int current_value = scanner.nextInt();
        int b = scanner.nextInt();
        value_list[current_value] = b;
        recursive_loop(scanner, i + step, stop, step);
    }
}