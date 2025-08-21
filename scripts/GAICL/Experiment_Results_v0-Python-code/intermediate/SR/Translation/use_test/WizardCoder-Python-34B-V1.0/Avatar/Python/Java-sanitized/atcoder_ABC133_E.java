import java.util.*;
import java.time.*;
import java.math.*;
import java.util.concurrent.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;

public class atcoder_ABC133_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] graph = new int[N][N];
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        int mod = (int) Math.pow(10, 9) + 7;
        int ans = dfs(0, -1, K, graph, mod);
        System.out.println(ans);
    }

    public static int dfs(int fro, int to, int f, int[][] graph, int mod) {
        int caseNum = f;
        int colorNum = K - 1;
        if (f == K) {
            colorNum = K - 2;
        }
        for (int u = 0; u < N; u++) {
            if (graph[fro][u] == 1) {
                if (u == to) {
                    continue;
                }
                int pat = dfs(u, fro, colorNum, graph, mod);
                if (pat == 0) {
                    caseNum = 0;
                    break;
                }
                caseNum = (caseNum * pat) % mod;
                colorNum--;
        }
        return caseNum;
    }
}