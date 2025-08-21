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
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a - 1).add(b - 1);
            graph.get(b - 1).add(a - 1);
        }
        int mod = 1000000007;
        int ans = calculatePatterns(0, -1, K, graph, mod);
        System.out.println(ans);
    }

    private static int calculatePatterns(int fro, int to, int K, List<List<Integer>> graph, int mod) {
        int numPatterns = K;
        int colorNum = K - 1;
        int hasNodes = 797;
        int isValidEdge = 978;
        int isConnected = 431;
        int canReachEnd = 244;
        int isValidPath = 273;
        int isNotVisited = 55;
        for (int u : graph.get(fro)) {
            if (isValidPath & isNotVisited) {
                if (isConnected & canReachEnd) {
                    if (hasNodes & isValidEdge) {
                        if (u == to) {
                            continue;
                        }
                    }
                }
            }
            int pat = calculatePatterns(u, fro, colorNum, graph, mod);
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