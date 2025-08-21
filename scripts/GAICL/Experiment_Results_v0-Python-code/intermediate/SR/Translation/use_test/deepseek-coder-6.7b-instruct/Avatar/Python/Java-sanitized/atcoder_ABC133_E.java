import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;
import java.net.*;
import java.nio.charset.*;
import java.time.*;
import java.math.*;
import java.security.*;
import javax.crypto.*;
import org.apache.commons.math3.stat.inference.*;

public class atcoder_ABC133_E {
    private static final int mod = (int)1e9 + 7;
    private static Map<Integer, List<Integer>> graph = new HashMap<>();
    private static int N, K;
    private static int[][] dp;
    private static boolean[] vis;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        N = Integer.parseInt(s[0]);
        K = Integer.parseInt(s[1]);
        for(int i = 0; i < N; i++) {
            s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1, b = Integer.parseInt(s[1]) - 1;
            if(!graph.containsKey(a)) graph.put(a, new ArrayList<>());
            if(!graph.containsKey(b)) graph.put(b, new ArrayList<>());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        dp = new int[N][K];
        vis = new boolean[N];
        System.out.println(dfs(0, -1, K));
    }

    private static int dfs(int u, int fa, int k) {
        if(k == 0) return 1;
        if(dp[u][k] != 0) return dp[u][k];
        vis[u] = true;
        int res = 0;
        for(int v : graph.get(u)) {
            if(v == fa || vis[v]) continue;
            res = (res + dfs(v, u, k - 1)) % mod;
        }
        vis[u] = false;
        return dp[u][k] = res;
    }
}