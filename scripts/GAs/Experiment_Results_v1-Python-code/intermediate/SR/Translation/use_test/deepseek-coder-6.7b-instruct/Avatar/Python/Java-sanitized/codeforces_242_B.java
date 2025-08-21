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
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / outerLoopStep; loopIndexOut++) {
            id = recursiveLoop(scanner, n, 1, id, globalLeftBoundary, r, firstConditionCheck, secondConditionCheck);
        }
        System.out.println(id == n ? -1 : id + 1);
    }

    public static int recursiveLoop(Scanner scanner, int n, int i, int id, int globalLeftBoundary, int r, int firstConditionCheck, int secondConditionCheck) {
        if (i <= 0 || i > n) {
            return id;
        }
        int leftBoundary = scanner.nextInt();
        int ri = scanner.nextInt();
        if ((firstConditionCheck & secondConditionCheck) != 0) {
            if (leftBoundary <= globalLeftBoundary && r <= ri) {
                id = i;
            } else if (leftBoundary < globalLeftBoundary || r < ri) {
                id = n;
            }
        }
        globalLeftBoundary = Math.min(globalLeftBoundary, leftBoundary);
        r = Math.max(r, ri);
        return recursiveLoop(scanner, n, i + 1, id, globalLeftBoundary, r, firstConditionCheck, secondConditionCheck);
    }
}