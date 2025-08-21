import java.util.*;

public class atcoder_ABC133_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int mod = (int) (1e9 + 7);
        int[] memo = new int[N];
        Arrays.fill(memo, -1);
        int ans = dfs(0, -1, K, graph, memo);
        System.out.println(ans);
    }

    public static int dfs(int fro, int to, int f, List<List<Integer>> graph, int[] memo) {
        if (memo[fro] != -1) {
            return memo[fro];
        }
        int caseNum = f;
        int colorNum = K - 1;
        if (f == K) {
            colorNum--;
        }
        for (int u : graph.get(fro)) {
            if (u == to) {
                continue;
            }
            int pat = dfs(u, fro, colorNum, graph, memo);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (caseNum * pat) % mod;
            colorNum--;
        }
        memo[fro] = caseNum;
        return caseNum;
    }
}