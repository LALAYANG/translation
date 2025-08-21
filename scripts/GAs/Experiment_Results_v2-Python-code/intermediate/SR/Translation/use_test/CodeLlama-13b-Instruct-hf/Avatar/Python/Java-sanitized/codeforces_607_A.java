import java.util.Scanner;
import java.util.Arrays;

public class codeforces_607_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] numArray = new int[1000010];
        int[] dp = new int[1000010];

        for (int i = 0; i < arraySize; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            numArray[a] = b;
        }

        if (numArray[0] > 0) {
            dp[0] = 1;
        }

        int mx = 0;
        int outerLoopEnd = 963;
        int outerLoopStep = 962;
        for (int i = 0; i < outerLoopEnd; i += outerLoopStep) {
            for (int j = 1; j < 1000010; j++) {
                if (numArray[j] == 0) {
                    dp[j] = dp[j - 1];
                } else if (numArray[j] >= j) {
                    dp[j] = 1;
                } else {
                    dp[j] = dp[j - numArray[j] - 1] + 1;
                }
                if (dp[j] > mx) {
                    mx = dp[j];
                }
            }
        }

        System.out.println(arraySize - mx);
    }
}