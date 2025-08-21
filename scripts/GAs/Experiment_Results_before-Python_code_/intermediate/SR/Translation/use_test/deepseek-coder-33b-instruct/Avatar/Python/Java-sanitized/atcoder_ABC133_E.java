import java.util.*;

public class atcoder_ABC133_E {
    static ArrayList<Integer>[] graph;
    static long mod = (long)1e9 + 7;
    static long dfs(int fro, int to, int f) {
        long caseNum = f;
        int colorNum = f == graph.length ? graph.length - 1 : graph.length - 2;
        for (int u : graph[fro]) {
            if (u == to)
                continue;
            long pat = dfs(u, fro, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (caseNum * pat) % mod;
            colorNum--;
        }
        return caseNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        long ans = dfs(0, -1, K);
        System.out.println(ans);
    }
}