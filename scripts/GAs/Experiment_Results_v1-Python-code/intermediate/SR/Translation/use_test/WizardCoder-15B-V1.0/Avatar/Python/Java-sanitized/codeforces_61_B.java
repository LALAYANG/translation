import java.util.*;

public class codeforces_61_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] row = sc.next().split("");
            for (int j = 0; j < m; j++) {
                grid[i][j] = row[j].equals("x") ? 1 : 0;
            }
        }
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        int[] x = {0, 0, 0, 0};
        int[] y = {0, 0, 0, 0};
        int[] z = {0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (isValid(nx, ny, n, m)) {
                            x[k] += grid[nx][ny];
                            y[k] += 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            if (y[i] != 0) {
                z[i] = x[i] / y[i];
            }
        }
        int[] a = {0, 0, 0, 0};
        int[] b = {0, 0, 0, 0};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (isValid(nx, ny, n, m)) {
                            a[k] += Math.pow(z[k] - grid[nx][ny], 2);
                            b[k] += 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            if (b[i] != 0) {
                a[i] = (int) Math.sqrt(a[i] / b[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    int min = Integer.MAX_VALUE;
                    for (int k = 0; k < 4; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (isValid(nx, ny, n, m)) {
                            int dist = Math.abs(z[k] - grid[nx][ny]) - a[k];
                            if (dist < min) {
                                min = dist;
                            }
                        }
                    }
                    if (min > 0) {
                        System.out.println("WA");
                        return;
                    }
                }
            }
        }
        System.out.println("ACC");
    }

    public static boolean isValid(int i, int j, int n, int m) {
        return i >= 0 && i < n && j >= 0 && j < m;
    }
}