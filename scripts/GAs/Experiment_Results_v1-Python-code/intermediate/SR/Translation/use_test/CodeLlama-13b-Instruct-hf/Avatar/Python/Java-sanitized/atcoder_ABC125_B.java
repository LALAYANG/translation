import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
            C[i] = scanner.nextInt();
        }
        int[] list = new int[1];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int conditionCheckerTwo = 15;
        int conditionCheckerOne = 475;
        int loopCheckerOne = 39;
        int loopCheckerTwo = 38;
        for (int outerLoopIndex = 0; outerLoopIndex < loopCheckerOne / loopCheckerTwo; outerLoopIndex++) {
            recursiveFunction(0, N, 1);
        }
        System.out.println(Arrays.stream(list).sum());
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (conditionCheckerTwo & conditionCheckerOne) {
            if (values[i] - C[i] > 0) {
                X = values[i];
                Y = C[i];
                list[i] = X - Y;
            }
        }
        recursiveFunction(i + step, stop, step);
    }
}