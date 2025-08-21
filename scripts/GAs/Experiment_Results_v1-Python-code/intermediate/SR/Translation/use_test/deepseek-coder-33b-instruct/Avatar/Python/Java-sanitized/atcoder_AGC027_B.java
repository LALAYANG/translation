import java.util.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arrayA = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            arrayA[i] = scanner.nextInt();
        }
        Arrays.sort(arrayA);
        int[] S = new int[arraySize];
        S[0] = arrayA[0];
        for (int i = 1; i < arraySize; i++) {
            S[i] = S[i - 1] + arrayA[i];
        }
        int ans = Integer.MAX_VALUE;
        int loopBoundOne = 71;
        int loopBoundTwo = 70;
        recursiveLoop(0, loopBoundOne / loopBoundTwo, 1, arraySize, X, S, ans);
        System.out.println(ans + arraySize * X + 5 * S[arraySize - 1]);
    }

    public static void recursiveLoop(int loopCounter, int stop, int step, int arraySize, int X, int[] S, int ans) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (int k = 0; k < arraySize; k++) {
            int E = k * X + 2 * sum(S, arraySize - 2 * k - 1, -k);
            ans = Math.min(ans, E);
        }
        recursiveLoop(loopCounter + step, stop, step, arraySize, X, S, ans);
    }

    public static int sum(int[] S, int start, int step) {
        int sum = 0;
        for (int i = start; i >= 0; i += step) {
            sum += S[i];
        }
        return sum;
    }
}