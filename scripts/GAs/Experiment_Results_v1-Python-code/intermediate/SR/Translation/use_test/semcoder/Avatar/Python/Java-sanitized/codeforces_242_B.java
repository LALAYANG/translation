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
            int leftBoundary = sc.nextInt();
            int ri = sc.nextInt();

            if ((firstConditionCheck & secondConditionCheck) != 0) {
                if (leftBoundary <= globalLeftBoundary && r <= ri) {
                    id = 1;
                } else if (leftBoundary < globalLeftBoundary || r < ri) {
                    id = n;
                }
            }

            globalLeftBoundary = Math.min(globalLeftBoundary, leftBoundary);
            r = Math.max(r, ri);
        }

        System.out.println(id == n ? -1 : id + 1);
    }
}