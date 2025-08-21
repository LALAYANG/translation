import java.util.*;

public class codeforces_607_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] valueList = new int[1000010];
        int[] dp = new int[1000010];

        recursiveLoop(scanner, 0, n, 1, valueList);

        if (valueList[0] > 0) {
            dp[0] = 1;
        }

        int mx = 0;
        int outerLoopLimit = 397;
        int outerLoopStep = 396;

        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            for (int i = 1; i < 1000010; i++) {
                if (valueList[i] == 0) {
                    dp[i] = dp[i - 1];
                } else if (valueList[i] >= i) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - valueList[i] - 1] + 1;
                }

                if (dp[i] > mx) {
                    mx = dp[i];
                }
            }
        }

        System.out.println(n - mx);
    }

    private static void recursiveLoop(Scanner scanner, int i, int stop, int step, int[] valueList) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        int currentValue = scanner.nextInt();
        int b = scanner.nextInt();
        valueList[currentValue] = b;

        recursiveLoop(scanner, i + step, stop, step, valueList);
    }
}