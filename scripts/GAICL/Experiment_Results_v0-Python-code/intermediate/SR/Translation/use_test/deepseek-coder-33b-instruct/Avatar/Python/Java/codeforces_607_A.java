Here is the Java translation of the Python code:

```java
import java.util.Scanner;

public class Main {
    static int n;
    static int[] l = new int[1000010];
    static int[] dp = new int[1000010];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        populateArray(0, n, 1);
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

    public static void populateArray(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int a = scanner.nextInt();
        int value = scanner.nextInt();
        l[a] = value;
        populateArray(i + step, stop, step);
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module is not available in Java. If you need to use this function, you may need to find an equivalent library in Java.

