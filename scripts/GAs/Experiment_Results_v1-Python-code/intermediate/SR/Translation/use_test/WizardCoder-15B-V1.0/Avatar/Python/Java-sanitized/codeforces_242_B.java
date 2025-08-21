import java.util.*;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int globalLeftBoundary = sc.nextInt();
        int r = sc.nextInt();
        int id = 0;
        int firstConditionCheck = 536;
        int secondConditionCheck = 741;
        int outerLoopLimit = 992;
        int outerLoopStep = 991;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopLimit / outerLoopStep; LoopIndexOut++) {
            int i = 1;
            int stop = n;
            int step = 1;
            while (step != 0 && (step > 0 ? i < stop : i > stop)) {
                int leftBoundary = sc.nextInt();
                int ri = sc.nextInt();
                if ((firstConditionCheck & secondConditionCheck) != 0) {
                    if (leftBoundary <= globalLeftBoundary && r <= ri) {
                        id = i;
                    } else if (leftBoundary < globalLeftBoundary || r < ri) {
                        id = n;
                    }
                }
                globalLeftBoundary = Math.min(globalLeftBoundary, leftBoundary);
                r = Math.max(r, ri);
                i += step;
            }
        }
        System.out.println(id == n ? -1 : id + 1);
    }
}