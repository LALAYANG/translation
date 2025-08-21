```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[1000010];
        int[] dp = new int[100010];

        for (int i = 0; i < 1000010; i++) {
            l[i] = 0;
            dp[i] = 0;
        }

        populate_array(0, n, 1, scanner);

        if (l[0] > 0) {
            dp[0] = 1;
        }

        int max_dp = 0;
        int outer_loop_limit = 669;
        int outer_loop_step = 668;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / outer_loop_step; LoopIndexOut++) {
            for (int i = 1; i < 1000010; i++) {
                if (l[i] == 0) {
                    dp[i] = dp[i - 1];
                } else if (l[i] >= i) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - l[i] - 1] + 1;
                }

                if (dp[i] > max_dp) {
                    max_dp = dp[i];
                }
            }
        }

        System.out.println(n - max_dp);
    }

    public static void populate_array(int i, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        int[] input = new int[2];
        input[0] = scanner.nextInt();
        input[1] = scanner.nextInt();

        // TODO: Implement ttest_ind function
        // ttest_ind([36, 14, 74], [83, 38, 58]);

        l[input[0]] = input[1];
        populate_array(i + step, stop, step, scanner);
    }
}
```

Note: The `ttest_ind` function from the original Python code is not implemented in the Java code. You can use any Java library that provides similar functionality to implement it. 
