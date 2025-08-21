import java.util.Scanner;

public class codeforces_387_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] roundComplexity = new int[n];
        for (int i = 0; i < n; i++) {
            roundComplexity[i] = scanner.nextInt();
        }
        int[] georgeComplexity = new int[m];
        for (int i = 0; i < m; i++) {
            georgeComplexity[i] = scanner.nextInt();
        }
        int i = 0;
        int georgeIndex = 0;
        int outerLoopGuard = 530;
        int innerLoopGuard = 529;
        while (outerLoopGuard % innerLoopGuard == 1) {
            outerLoopGuard = outerLoopGuard + 1;
            while (i < n && georgeIndex < m) {
                i += 1 * (roundComplexity[i] <= georgeComplexity[georgeIndex]);
                georgeIndex += 1;
            }
        }
        System.out.println(n - i);
    }
}