import java.util.*;

public class atcoder_ABC133_E {
    static int N, K;
    static List<Integer>[] graph;
    static int mod = 1000000007;

    static int dfs(int fro, int to, int f) {
        int caseNum = f;
        int colorNum = f == K ? K - 1 : K - 2;
        for (int u : graph[fro]) {
            if (u == to) continue;
            int pat = dfs(u, fro, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (int) ((long) caseNum * pat % mod);
            colorNum--;
        }
        return caseNum;
    }

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
        int ans = dfs(0, -1, K);
        System.out.println(ans);
    }
}