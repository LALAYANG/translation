import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_412_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String inputString = scanner.nextLine();
        List<String> actions = new ArrayList<>();
        boolean f = k - 1 < n - k;
        int m = Math.min(k - 1, n - k);
        moveLoop(0, m, 1, f, actions);
        printLoop(0, inputString, actions, f);
        for (String action : actions.subList(0, actions.size() - 1)) {
            System.out.println(action);
        }
    }

    private static void moveLoop(int i, int stop, int step, boolean f, List<String> actions) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        actions.add(f ? "LEFT" : "RIGHT");
        moveLoop(i + step, stop, step, f, actions);
    }

    private static void printLoop(int loopIndex, String inputString, List<String> actions, boolean f) {
        if (loopIndex == inputString.length()) {
            return;
        }
        for (int i = inputString.length() - 1 - (f ? 2 : 0); i >= 0; i -= 2) {
            actions.add("PRINT " + inputString.charAt(i));
            actions.add(f ? "LEFT" : "RIGHT");
        }
        printLoop(loopIndex + 1, inputString, actions, f);
    }
}