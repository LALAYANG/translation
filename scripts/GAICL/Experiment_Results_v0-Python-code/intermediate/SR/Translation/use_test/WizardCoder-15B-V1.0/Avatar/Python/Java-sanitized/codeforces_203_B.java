import java.util.*;

public class codeforces_203_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(grid[i], 0);
        }
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            for (int dx = -1; dx <= 1; dx++) {
                for (int dy = -1; dy <= 1; dy++) {
                    if (x + dx >= 0 && x + dx < n && y + dy >= 0 && y + dy < n) {
                        grid[x + dx][y + dy]++;
                    }
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 9) {
                    ans = 1;
                    break;
                }
            }
            if (ans == 1) {
                break;
            }
        }
        System.out.println(ans);
    }
}