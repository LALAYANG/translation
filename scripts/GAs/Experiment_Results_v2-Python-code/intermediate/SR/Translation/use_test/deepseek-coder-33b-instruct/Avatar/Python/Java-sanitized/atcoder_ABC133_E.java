import java.util.*;

public class atcoder_ABC133_E {
    static ArrayList<Integer>[] graph;
    static int N, K, mod = (int)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < N - 1; i++) {
            int neighbor_node = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[neighbor_node].add(b);
            graph[b].add(neighbor_node);
        }
        long ans = depthFirstSearch(0, -1, K);
        System.out.println(ans);
    }

    static long depthFirstSearch(int fro, int to, int f) {
        long caseNum = f;
        int colorNum = f == K ? K - 1 : K - 2;
        for (int u : graph[fro]) {
            if (u == to) continue;
            long pat = depthFirstSearch(u, fro, colorNum);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = caseNum * pat % mod;
            colorNum--;
        }
        return caseNum;
    }
}