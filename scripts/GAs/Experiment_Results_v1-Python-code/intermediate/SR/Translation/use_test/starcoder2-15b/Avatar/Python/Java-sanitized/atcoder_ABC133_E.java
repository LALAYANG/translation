import java.util.*;

public class atcoder_ABC133_E {
    static int mod = (int) 1e9 + 7;
    static int N, K;
    static List<Integer>[] graph;
    static int[] memo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        memo = new int[N];
        Arrays.fill(memo, -1);
        System.out.println(dfs(0, -1, K));
    }

    static int dfs(int v, int p, int f) {
        if (memo[v] != -1) {
            return memo[v];
        }
        int numPatterns = f;
        int colorNum = K - 1;
        if (f == K) {
            colorNum = K - 2;
        }
        for (int u : graph[v]) {
            if (u == p) {
                continue;
            }
            int pat = dfs(u, v, colorNum);
            if (pat == 0) {
                numPatterns = 0;
                break;
            }
            numPatterns = numPatterns * pat % mod;
            colorNum--;
        }
        return memo[v] = numPatterns;
    }
}