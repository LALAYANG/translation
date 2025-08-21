import java.io.*;
import java.util.*;

public class codeforces_242_B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int id = 0;
        int[] firstConditionCheck = new int[n];
        int[] secondConditionCheck = new int[n];
        int[] outerLoopLimit = new int[n];
        int[] outerLoopStep = new int[n];
        int[] globalLeftBoundary = new int[n];
        int[] r = new int[n];
        for (int LoopIndexOut = 0; LoopIndexOut < n; LoopIndexOut++) {
            String[] input = br.readLine().split(" ");
            globalLeftBoundary[LoopIndexOut] = Integer.parseInt(input[0]);
            r[LoopIndexOut] = Integer.parseInt(input[1]);
            firstConditionCheck[LoopIndexOut] = 536;
            secondConditionCheck[LoopIndexOut] = 741;
            outerLoopLimit[LoopIndexOut] = 992;
            outerLoopStep[LoopIndexOut] = 991;
        }
        for (int LoopIndexOut = 0; LoopIndexOut < n; LoopIndexOut++) {
            for (int LoopIndexIn = 1; LoopIndexIn <= outerLoopLimit[LoopIndexOut] / outerLoopStep[LoopIndexOut]; LoopIndexIn++) {
                String[] input = br.readLine().split(" ");
                int leftBoundary = Integer.parseInt(input[0]);
                int ri = Integer.parseInt(input[1]);
                if (firstConditionCheck[LoopIndexOut] & secondConditionCheck[LoopIndexOut]) {
                    if (leftBoundary <= globalLeftBoundary[LoopIndexOut] && r[LoopIndexOut] <= ri) {
                        id = LoopIndexIn;
                    } else if (leftBoundary < globalLeftBoundary[LoopIndexOut] || r[LoopIndexOut] < ri) {
                        id = n;
                    }
                }
                globalLeftBoundary[LoopIndexOut] = Math.min(globalLeftBoundary[LoopIndexOut], leftBoundary);
                r[LoopIndexOut] = Math.max(r[LoopIndexOut], ri);
            }
        }
        System.out.println(id == 0 ? -1 : id);
    }
}