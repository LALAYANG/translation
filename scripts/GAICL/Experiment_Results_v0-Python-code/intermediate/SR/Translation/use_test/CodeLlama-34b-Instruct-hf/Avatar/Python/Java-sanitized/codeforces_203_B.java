import java.util.Scanner;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] waterLevelGrid = new int[n][n];
        int minWaterLevel = 105;
        int maxWaterLevel = 28;

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x--;
            y--;
            boolean found = false;
            for (int j = x - 2; j <= x + 1; j++) {
                for (int k = y - 2; k <= y + 1; k++) {
                    if (j >= 0 && j < n && k >= 0 && k < n) {
                        waterLevelGrid[j][k]++;
                        if (waterLevelGrid[j][k] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (found) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}