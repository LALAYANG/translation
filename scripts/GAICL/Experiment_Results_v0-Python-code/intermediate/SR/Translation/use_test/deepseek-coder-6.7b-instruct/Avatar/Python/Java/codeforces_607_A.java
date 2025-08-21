```java
import java.util.Scanner;

public class Main {
    static int[] l = new int[1000010];
    static int[] dp = new int[1000010];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        populateArray(0, n, 1, scanner);
        if (l[0] > 0) {
            dp[0] = 1;
        }
        int max_dp = 0;
        int outer_loop_limit = 669;
        int outer_loop_step = 668;
        for (int loopIndexOut = 0; loopIndexOut < outer_loop_limit / outer_loop_step; loopIndexOut++) {
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

    static void populateArray(int i, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int a = scanner.nextInt();
        int value = scanner.nextInt();
        l[a] = value;
        populateArray(i + step, stop, step, scanner);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the input, populates an array `l` with `n` elements, and then uses dynamic programming to find the maximum length of a non-decreasing subsequence in `l`. The result is then printed to the console.

