import java.util.Scanner;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] g = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                g[i][j] = scanner.nextInt();
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (g[i][i] == 0) {
                continue;
            }
            int nodes = 1;
            int edges = 0;
            for (int j = 1; j <= n; j++) {
                if (g[i][j] == 1) {
                    nodes++;
                    edges += g[j][i];
                }
            }
            if (nodes > 1 && nodes % 2 == 1 && (2 * nodes == edges)) {
                ans++;
            }
        }

        if ((n - ans) % 2 == 1) {
            ans++;
        }

        System.out.println(ans);
    }
}