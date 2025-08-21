import java.util.Scanner;

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

        for (int i = 1; i < 1000010; i++) {
            if (valueList[i] == 0) {
                dp[i] = dp[i - 1];
            } else if (valueList[i] >= i) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i - valueList[i] - 1] + 1;
            }
        }

        int mx = 0;
        for (int i = 0; i < 1000010; i++) {
            if (dp[i] > mx) {
                mx = dp[i];
            }
        }

        System.out.println(n - mx);
    }
}