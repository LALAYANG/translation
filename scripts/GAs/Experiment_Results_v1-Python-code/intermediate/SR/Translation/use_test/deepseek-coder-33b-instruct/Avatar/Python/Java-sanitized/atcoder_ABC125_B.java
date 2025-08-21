import java.util.*;

public class atcoder_ABC125_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        list.add(0);
        int X = 0;
        int Y = 0;
        int conditionCheckerTwo = 15;
        int conditionCheckerOne = 475;
        int loopCheckerOne = 39;
        int loopCheckerTwo = 38;
        for (int outerLoopIndex = 0; outerLoopIndex < loopCheckerOne / loopCheckerTwo; outerLoopIndex++) {
            recursiveFunction(0, N, 1, values, C, list, X, Y, conditionCheckerTwo, conditionCheckerOne);
        }
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println(sum);
    }

    public static void recursiveFunction(int i, int stop, int step, int[] values, int[] C, List<Integer> list, int X, int Y, int conditionCheckerTwo, int conditionCheckerOne) {
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
        recursiveFunction(i + step, stop, step, values, C, list, X, Y, conditionCheckerTwo, conditionCheckerOne);
    }
}