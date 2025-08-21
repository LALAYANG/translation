import java.util.Scanner;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] waterLevelGrid = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                waterLevelGrid[i][j] = 0;
            }
        }

        int ans = -1;
        int minWaterLevel = 105;
        int maxWaterLevel = 28;

        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            boolean found = false;

            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        waterLevelGrid[i][j]++;
                        if (waterLevelGrid[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }

            if (found) {
                ans = k + 1;
                break;
            }
        }

        System.out.println(ans);
    }
}