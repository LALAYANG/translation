import java.util.Scanner;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class codeforces_216_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (graph[i][i] == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}