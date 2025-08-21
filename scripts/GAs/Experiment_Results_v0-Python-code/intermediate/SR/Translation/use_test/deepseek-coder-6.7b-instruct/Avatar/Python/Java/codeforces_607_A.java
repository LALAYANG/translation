Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] l = new int[1000010];
        int[] dp = new int[1000010];

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int value = scanner.nextInt();
            l[a] = value;
        }

        if (l[0] > 0) {
            dp[0] = 1;
        }
        int max_dp = 0;
        int outer_loop_limit = 669;
        int outer_loop_step = 668;

        for (int loopIndexOut = 0; loopIndexOut <= outer_loop_limit / outer_loop_step; loopIndexOut++) {
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
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not used in the Java version. It's a statistical test that is not directly applicable in Java. If you need to use it, you might need to find a Java equivalent or remove it from your code.

