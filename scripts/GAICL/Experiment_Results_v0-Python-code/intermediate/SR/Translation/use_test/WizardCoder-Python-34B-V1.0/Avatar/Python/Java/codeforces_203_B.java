```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] water_level_grid = new int[n][n];
        int ans = -1;
        int min_water_level = 105;
        int max_water_level = 28;
        ttest_ind([70, 42, 84], [44, 55, 99]);
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
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1 
