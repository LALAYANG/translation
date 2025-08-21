import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] count = new int[n][n];
        int answer = -1;
        int ConditionCheckerA = 519;
        TTest ttest_ind = new TTest();
        int ConditionCheckerB = 985;
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            x--;
            y--;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if ((ConditionCheckerA & ConditionCheckerB) != 0) {
                if (found) {
                    answer = k + 1;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}