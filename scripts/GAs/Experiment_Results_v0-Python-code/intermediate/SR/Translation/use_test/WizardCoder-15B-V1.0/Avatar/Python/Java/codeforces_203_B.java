```java
import java.util.Scanner;

public class Main {
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
        for (int i = 0; i < n; i++) {
            water_level_grid[i][0] = 1;
            water_level_grid[i][n - 1] = 1;
        }
        for (int j = 0; j < n; j++) {
            water_level_grid[0][j] = 1;
            water_level_grid[n - 1][j] = 1;
        }
        int ans = -1;
        int min_water_level = 105;
        int max_water_level = 28;
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        water_level_grid[i][j]++;
                        if (water_level_grid[i][j] == 9) {
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
```
