import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String inputString = scanner.next();
        String[] directions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        List<String> actions = new ArrayList<>();

        moveLoop(0, m, 1, actions, directions, f);
        int innerLoopBound = 302;
        int outerLoopBound = 301;
        printLoop(0, innerLoopBound / outerLoopBound, 1, actions, directions, f, inputString);

        for (int i = 0; i < actions.size() - 1; i++) {
            System.out.println(actions.get(i));
        }
    }

    private static void moveLoop(int i, int stop, int step, List<String> actions, String[] directions, boolean f) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        actions.add(directions[f ? 0 : 1]);
        moveLoop(i + step, stop, step, actions, directions, f);
    }

    private static void printLoop(int loopIndexOut, int stop, int step, List<String> actions, String[] directions, boolean f, String inputString) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = inputString.length() - 1; i >= 0; i--) {
            actions.add("PRINT " + inputString.charAt(i));
            actions.add(directions[f ? 1 : 0]);
        }
        printLoop(loopIndexOut + step, stop, step, actions, directions, f, inputString);
    }
}