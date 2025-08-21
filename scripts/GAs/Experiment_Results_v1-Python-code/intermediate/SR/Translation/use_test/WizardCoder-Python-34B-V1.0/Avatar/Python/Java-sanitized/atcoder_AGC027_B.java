import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arrayA = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayA[i] = scanner.nextInt();
        }
        int loopBoundOne = 71;
        int loopBoundTwo = 70;
        int ans = Integer.MAX_VALUE;
        int[] S = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            if (i == 0) {
                S[i] = arrayA[i];
            } else {
                S[i] = S[i - 1] + arrayA[i];
            }
        }
        recursiveLoop(0, loopBoundOne / loopBoundTwo, 1, ans, S, X);
        System.out.println(ans + arraySize * X + 5 * S[arraySize - 1]);
    }

    public static void recursiveLoop(int loopCounter, int stop, int step, int ans, int[] S, int X) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (int k = 1; k <= arraySize; k++) {
            int E = k * X + 2 * sum(S, arraySize - 2 * k - 1, -k);
            ans = Math.min(ans, E);
        }
        recursiveLoop(loopCounter + step, stop, step, ans, S, X);
    }

    public static int sum(int[] S, int start, int step) {
        int sum = 0;
        for (int i = start; i < S.length; i += step) {
            sum += S[i];
        }
        return sum;
    }
}