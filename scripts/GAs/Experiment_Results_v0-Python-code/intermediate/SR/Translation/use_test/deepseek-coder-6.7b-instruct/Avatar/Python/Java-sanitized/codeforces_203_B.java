import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_203_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] waterLevelGrid = new int[n][n];
        int ans = -1;
        int minWaterLevel = 105;
        int maxWaterLevel = 28;
        double[] sample1 = {70, 42, 84};
        double[] sample2 = {44, 55, 99};
        TTest tTest = new TTest();
        tTest.tTest(sample1, sample2);
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        waterLevelGrid[i][j] += 1;
                        if (waterLevelGrid[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (minWaterLevel < maxWaterLevel) {
                if (found) {
                    ans = k + 1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}