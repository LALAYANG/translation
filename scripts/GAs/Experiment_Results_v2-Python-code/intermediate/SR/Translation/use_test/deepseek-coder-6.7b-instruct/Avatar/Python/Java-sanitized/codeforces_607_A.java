import java.util.Scanner;

public class codeforces_607_A {
    static int[] numArray = new int[1000010];
    static int[] dp = new int[1000010];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        populateArray(scanner, arraySize, 1);
        if (numArray[0] > 0) {
            dp[0] = 1;
        }
        int mx = 0;
        int outerLoopEnd = 963;
        int outerLoopStep = 962;
        for (int loopIndexOut = 0; loopIndexOut <= outerLoopEnd / outerLoopStep; loopIndexOut++) {
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

    public static void populateArray(Scanner scanner, int stop, int step) {
        if (step == 0) {
            return;
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        numArray[a] = b;
        populateArray(scanner, stop, step - 1);
    }
}