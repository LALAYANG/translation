import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

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
        int j = 0;
        int whileloopchecker19 = 645;
        int whileloopchecker29 = 644;
        while (whileloopchecker19 % whileloopchecker29 == 1) {
            int variable_3_22 = 1;
            whileloopchecker19 = newFunc0_22(whileloopchecker19, variable_3_22);
            while (i < n && j < m) {
                i += 1 * (roundComplexity[i] <= georgeComplexity[j]);
                j++;
            }
        }
        System.out.println(n - i);
    }

    public static int newFunc0_22(int whileloopchecker19, int variable_3_22) {
        return whileloopchecker19 + variable_3_22;
    }
}