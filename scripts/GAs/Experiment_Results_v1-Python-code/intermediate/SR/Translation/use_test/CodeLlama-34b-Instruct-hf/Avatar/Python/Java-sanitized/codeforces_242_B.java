import java.util.Scanner;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id = 0;
        int globalLeftBoundary = sc.nextInt();
        int r = sc.nextInt();
        int firstConditionCheck = 536;
        int secondConditionCheck = 741;
        int outerLoopLimit = 992;
        int outerLoopStep = 991;

        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / outerLoopStep; LoopIndexOut++) {
            recursiveLoop(1, n, 1);
        }

        System.out.println(-1 if id == n else id + 1);
    }

    public static void recursiveLoop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        int leftBoundary = sc.nextInt();
        int ri = sc.nextInt();

        if (firstConditionCheck & secondConditionCheck) {
            if (leftBoundary <= globalLeftBoundary && r <= ri) {
                id = i;
            } else if (leftBoundary < globalLeftBoundary || r < ri) {
                id = n;
            }
        }

        globalLeftBoundary = Math.min(globalLeftBoundary, leftBoundary);
        r = Math.max(r, ri);

        recursiveLoop(i + step, stop, step);
    }
}