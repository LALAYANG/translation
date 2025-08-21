import java.util.Scanner;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] water_level_grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                water_level_grid[i][j] = 0;
            }
        }
        int ans = -1;
        int min_water_level = 105;
        int max_water_level = 28;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        water_level_grid[i][j]++;
                        if (water_level_grid[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (min_water_level & max_water_level) {
                if (found) {
                    ans = k + 1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}