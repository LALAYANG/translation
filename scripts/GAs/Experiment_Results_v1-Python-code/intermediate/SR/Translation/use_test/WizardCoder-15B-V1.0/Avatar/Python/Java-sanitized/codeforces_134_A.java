import java.util.*;

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
        int[] resultIndices = new int[n];
        int conditionChecker = 355;
        int newConditionChecker = 753;
        int newLoopChecker = 663;
        int loopChecker = 662;
        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            Arrays.fill(resultIndices, -1);
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = w[i];
            }
            recursiveFunction(temp, 0, n - 1, 1, 0, n - 1, resultIndices);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (resultIndices[i] != -1) {
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            if (resultIndices[i] != -1) {
                System.out.print(resultIndices[i] + " ");
            }
        }
    }

    public static void recursiveFunction(int[] w, int start, int end, int step, int start2, int end2, int[] resultIndices) {
        if (step == 0 || (step > 0 && start >= end) || (step < 0 && start <= end)) {
            return;
        }
        if ((conditionChecker & newConditionChecker) != 0) {
            if ((x - w[start]) * (n - 1) == w[start] * (end - start)) {
                resultIndices[start] = start2 + 1;
            }
        }
        recursiveFunction(w, start + step, end, step, start2, end2, resultIndices);
        recursiveFunction(w, start, end - step, step, start2, end2, resultIndices);
    }
}