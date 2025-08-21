import java.util.Scanner;
import java.util.Arrays;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] globalLeftBoundaryAndR = new int[2];
        globalLeftBoundaryAndR[0] = scanner.nextInt();
        globalLeftBoundaryAndR[1] = scanner.nextInt();
        int firstConditionCheck = 536;
        int secondConditionCheck = 741;
        int outerLoopLimit = 992;
        int outerLoopStep = 991;
        int id = 0;

        for (int loopIndexOut = 0; loopIndexOut * outerLoopStep < outerLoopLimit; loopIndexOut++) {
            int i = loopIndexOut * outerLoopStep + 1;
            int step = 1;
            while (true) {
                if (i >= n || (step > 0 && i > n) || (step < 0 && i < 1)) {
                    break;
                }
                int[] leftBoundaryAndR = new int[2];
                leftBoundaryAndR[0] = scanner.nextInt();
                leftBoundaryAndR[1] = scanner.nextInt();
                if ((firstConditionCheck & secondConditionCheck) != 0) {
                    if (globalLeftBoundaryAndR[0] <= leftBoundaryAndR[0] && globalLeftBoundaryAndR[1] <= leftBoundaryAndR[1]) {
                        id = i;
                    } else if (globalLeftBoundaryAndR[0] < leftBoundaryAndR[0] || globalLeftBoundaryAndR[1] < leftBoundaryAndR[1]) {
                        id = n;
                    }
                    globalLeftBoundaryAndR[0] = Math.min(globalLeftBoundaryAndR[0], leftBoundaryAndR[0]);
                    globalLeftBoundaryAndR[1] = Math.max(globalLeftBoundaryAndR[1], leftBoundaryAndR[1]);
                }
                i += step;
            }
        }
        System.out.println(id == n ? -1 : id + 1);
    }
}