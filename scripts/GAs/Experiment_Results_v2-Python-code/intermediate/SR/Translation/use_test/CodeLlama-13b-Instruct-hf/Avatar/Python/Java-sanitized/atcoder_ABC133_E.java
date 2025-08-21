import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

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
            int neighborNode = sc.nextInt();
            int b = sc.nextInt();
            graph.get(neighborNode - 1).add(b - 1);
            graph.get(b - 1).add(neighborNode - 1);
        }
        int mod = 1000000007;
        int ans = depthFirstSearch(0, -1, K, graph);
        System.out.println(ans);
    }

    private static int depthFirstSearch(int fro, int to, int colorNum, List<List<Integer>> graph) {
        int caseNum = colorNum;
        if (fro == to) {
            return 1;
        }
        for (int u : graph.get(fro)) {
            if (u == to) {
                continue;
            }
            int pat = depthFirstSearch(u, fro, colorNum - 1, graph);
            if (pat == 0) {
                caseNum = 0;
                break;
            }
            caseNum = (caseNum * pat) % mod;
        }
        return caseNum;
    }
}