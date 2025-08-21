import java.util.Scanner;
import java.util.Arrays;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.nextLine();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        String[] actions = new String[n];

        moveLoop(0, m, 1);
        int innerLoopBound = 302;
        int outerLoopBound = 301;

        printLoop(0, innerLoopBound / outerLoopBound, 1);
        System.out.println(String.join("\n", Arrays.copyOf(actions, actions.length - 1)));
    }

    private static void moveLoop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        actions[i] = directions[f];
        moveLoop(i + step, stop, step);
    }

    private static void printLoop(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < inputString.length(); i++) {
            actions[i] = "PRINT " + inputString.charAt(i);
            actions[i] = directions[f];
        }
        printLoop(LoopIndexOut + step, stop, step);
    }
}