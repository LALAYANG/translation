import java.util.*;

public class codeforces_607_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numArray = new int[1000010];
        int[] dp = new int[1000010];

        populateArray(scanner, 0, arraySize, 1, numArray);

        if (numArray[0] > 0) {
            dp[0] = 1;
        }

        int mx = 0;
        int outerLoopEnd = 963;
        int outerLoopStep = 962;

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopEnd / outerLoopStep; LoopIndexOut++) {
            for (int i = 1; i < 1000010; i++) {
                if (numArray[i] == 0) {
                    dp[i] = dp[i - 1];
                } else if (numArray[i] >= i) {
                    dp[i] = 1;
                } else {
                    dp[i] = dp[i - numArray[i] - 1] + 1;
                }
                if (dp[i] > mx) {
                    mx = dp[i];
                }
            }
        }

        System.out.println(arraySize - mx);
    }

    private static void populateArray(Scanner scanner, int i, int stop, int step, int[] numArray) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        numArray[a] = b;
        populateArray(scanner, i + step, stop, step, numArray);
    }
}