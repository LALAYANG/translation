```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[100010];
        int[] dp = new int[10010];

        for (int i = 0; i < 10010; i++) {
            l[i] = 0;
            dp[i] = 0;
        }

        populate_array(0, n, 1, sc);

        if (l[0] > 0) {
            dp[0] = 1;
        }
        int max_dp = 0;
        int outer_loop_limit = 669;
        int outer_loop_step = 668;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / outer_loop_step; LoopIndexOut++) {
            for (int i = 1; i < 10010; i++) {
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

    public static void populate_array(int i, int stop, int step, Scanner sc) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int a = sc.nextInt();
        int value = sc.nextInt();
        //ttest_ind([36, 14, 74], [83, 38, 58]); // This line is not required in Java
        l[a] = value;
        populate_array(i + step, stop, step, sc);
    }
}
```

Test input:
7
1 1
2 1
3 1
4 1
5 1
6 1
7 1

Expected output:
3 
