import java.util.*;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int id = 0;
        int globalLeftBoundary = scanner.nextInt();
        int r = scanner.nextInt();
        int firstConditionCheck = 536;
        int secondConditionCheck = 741;
        int outerLoopLimit = 992;
        int outerLoopStep = 991;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / outerLoopStep; LoopIndexOut++) {
            recursiveLoop(1, n, 1, scanner, globalLeftBoundary, id, r, firstConditionCheck, secondConditionCheck);
        }
        System.out.println(id == n ? -1 : id + 1);
    }

    private static void recursiveLoop(int i, int stop, int step, Scanner scanner, int globalLeftBoundary, int id, int r, int firstConditionCheck, int secondConditionCheck) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int leftBoundary = scanner.nextInt();
        int ri = scanner.nextInt();
        if ((firstConditionCheck & secondConditionCheck) != 0) {
            if (leftBoundary <= globalLeftBoundary && r <= ri) {
                id = i;
            } else if (leftBoundary < globalLeftBoundary || r < ri) {
                id = -1;
            }
            globalLeftBoundary = Math.min(globalLeftBoundary, leftBoundary);
            r = Math.max(r, ri);
        }
        recursiveLoop(i + step, stop, step, scanner, globalLeftBoundary, id, r, firstConditionCheck, secondConditionCheck);
    }
}