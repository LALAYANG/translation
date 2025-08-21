import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        String[] values = args[1].split(" ");
        String[] C = args[2].split(" ");
        List<Integer> list = new ArrayList<>();
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

        System.out.println(ans);
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        if ((conditionCheckerTwo & conditionCheckerOne) != 0) {
            if (values[i] - C[i] > 0) {
                X = values[i];
                Y = C[i];
                list.add(X - Y);
            }
        }

        recursiveFunction(i + step, stop, step);
    }
}