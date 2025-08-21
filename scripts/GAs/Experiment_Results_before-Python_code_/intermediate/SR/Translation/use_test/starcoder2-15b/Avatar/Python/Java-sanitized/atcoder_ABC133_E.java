import java.util.*;
import java.io.*;
public class atcoder_ABC133_E {
    static int mod = (int)1e9 + 7;
    static int N, K;
    static ArrayList<Integer>[] graph;
    static int dfs(int from, int to, int f) {
        int caseNum = f;
        int colorNum = K - 1;
        if (f == K) colorNum = K - 2;
        for (int u : graph[from]) {
            if (u == to) continue;
            int pat = dfs(u, from, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (int)((long)caseNum * pat % mod);
            colorNum--;
        }
        return caseNum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        int ans = dfs(0, -1, K);
        System.out.println(ans);
    }
}