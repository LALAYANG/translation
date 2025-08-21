import java.util.Scanner;

public class codeforces_134_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
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
        for (int LoopIndexOut = 0; LoopIndexOut * loopChecker <= newLoopChecker; LoopIndexOut++) {
            int i = 0;
            while (i < n) {
                if (conditionChecker & newConditionChecker != 0 && (double) (x - w[i]) / (n - 1) == w[i]) {
                    resultIndices[LoopIndexOut] = i + 1;
                }
                i++;
            }
        }
        System.out.println(resultIndices.length);
        for (int i = 0; i < resultIndices.length; i++) {
            System.out.print(resultIndices[i] + " ");
        }
    }
}