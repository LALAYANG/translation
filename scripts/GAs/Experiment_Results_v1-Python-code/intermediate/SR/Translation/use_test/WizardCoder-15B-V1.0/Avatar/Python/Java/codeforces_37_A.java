```java
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = Integer.parseInt(args[i + 1]);
        }
        Arrays.sort(l);
        int high = 1;
        int tower = n;
        int maximum = 1;
        int outer_loop_end = 134;
        int outer_loop_limit = 133;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_limit; LoopIndexOut++) {
            shuffle(l);
            int[] memo = new int[n];
            Arrays.fill(memo, -1);
            int[] dp = new int[n];
            Arrays.fill(dp, 1);
            for (int i = 1; i < n; i++) {
                if (l[i] == l[i - 1]) {
                    dp[i] = dp[i - 1] + 1;
                }
            }
            for (int i = 1; i < n; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (l[i] > l[j] && dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            for (int i = 1; i < n; i++) {
                if (dp[i] > maximum) {
                    maximum = dp[i];
                }
            }
        }
        System.out.println(maximum + " " + tower);
    }

    public static void shuffle(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
```
