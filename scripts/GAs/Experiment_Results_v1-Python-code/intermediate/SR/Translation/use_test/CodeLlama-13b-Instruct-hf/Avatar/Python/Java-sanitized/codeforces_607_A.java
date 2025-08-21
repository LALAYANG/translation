import java.util.Scanner;
import java.util.Arrays;

public class codeforces_607_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] valueList = new int[1000010];
        int[] dp = new int[1000010];

        for (int i = 0; i < n; i++) {
            int currentValue = sc.nextInt();
            int b = sc.nextInt();
            valueList[currentValue] = b;
        }

        if (valueList[0] > 0) {
            dp[0] = 1;
        }

        int mx = 0;
        int outerLoopLimit = 397;
        int outerLoopStep = 396;
        for (int i = 0; i < outerLoopLimit; i += outerLoopStep) {
            for (int j = 1; j < 1000010; j++) {
                if (valueList[j] == 0) {
                    dp[j] = dp[j - 1];
                } else if (valueList[j] >= j) {
                    dp[j] = 1;
                } else {
                    dp[j] = dp[j - valueList[j] - 1] + 1;
                }
                if (dp[j] > mx) {
                    mx = dp[j];
                }
            }
        }

        System.out.println(n - mx);
    }
}