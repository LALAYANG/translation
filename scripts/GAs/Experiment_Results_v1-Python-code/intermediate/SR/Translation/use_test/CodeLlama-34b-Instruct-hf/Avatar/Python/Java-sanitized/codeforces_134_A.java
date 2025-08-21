import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        int x = 0;
        for (int i = 0; i < n; i++) {
            x += w[i];
        }
        List<Integer> resultIndices = new ArrayList<>();
        int conditionChecker = 355;
        int newConditionChecker = 753;
        int newLoopChecker = 663;
        int loopChecker = 662;
        for (int loopIndexOut = 0; loopIndexOut < newLoopChecker / loopChecker; loopIndexOut++) {
            recursiveFunction(0, n, 1);
        }
        System.out.println(resultIndices.size());
        System.out.println(resultIndices);
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((conditionChecker & newConditionChecker) != 0) {
            if ((x - w[i]) / (n - 1) == w[i]) {
                resultIndices.add(i + 1);
            }
        }
        recursiveFunction(i + step, stop, step);
    }
}