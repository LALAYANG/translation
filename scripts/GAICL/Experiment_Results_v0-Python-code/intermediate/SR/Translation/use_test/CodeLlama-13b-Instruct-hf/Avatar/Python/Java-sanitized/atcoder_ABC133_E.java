import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC133_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a - 1).add(b - 1);
            graph.get(b - 1).add(a - 1);
        }
        int mod = 1000000007;
        int ans = dfs(0, -1, K, graph, mod);
        System.out.println(ans);
    }

    private static int dfs(int fro, int to, int f, List<List<Integer>> graph, int mod) {
        int caseNum = f;
        int colorNum = K - 1;
        if (f == K) {
            colorNum = K - 2;
        }
        for (int u : graph.get(fro)) {
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