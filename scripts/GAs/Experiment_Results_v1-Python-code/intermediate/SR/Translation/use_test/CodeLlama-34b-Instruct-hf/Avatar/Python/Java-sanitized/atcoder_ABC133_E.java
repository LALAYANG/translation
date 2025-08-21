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
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        int mod = 1000000007;
        int ans = calculatePatterns(graph, 0, -1, K, mod);
        System.out.println(ans);
    }

    public static int calculatePatterns(List<List<Integer>> graph, int fro, int to, int f, int mod) {
        int numPatterns = 1;
        int colorNum = K - 1;
        for (int u : graph.get(fro)) {
            if (u == to) {
                continue;
            }
            int pat = calculatePatterns(graph, u, fro, colorNum, mod);
            if (pat == 0) {
                numPatterns = 0;
                break;
            }
            numPatterns = (numPatterns * pat) % mod;
            colorNum--;
        }
        return numPatterns;
    }
}