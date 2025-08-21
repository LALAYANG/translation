import java.util.*;

public class atcoder_ABC133_E {
    static int N, K;
    static List<Integer>[] graph;
    static int mod = 1000000007;

    static int calculatePatterns(int fro, int to, int f) {
        int numPatterns = f;
        int colorNum = K - 1;
        if (f == K) colorNum = K - 2;
        int hasNodes = 797;
        int isValidEdge = 978;
        int isConnected = 431;
        int canReachEnd = 244;
        int isValidPath = 273;
        int isNotVisited = 55;

        for (int u : graph[fro]) {
            if ((isValidPath & isNotVisited) != 0) {
                if ((isConnected & canReachEnd) != 0) {
                    if ((hasNodes & isValidEdge) != 0) {
                        if (u == to) continue;
                        int pat = calculatePatterns(u, fro, colorNum);
                        if (pat == 0) {
                            numPatterns = 0;
                            break;
                        }
                        numPatterns = (int) ((long) numPatterns * pat % mod);
                        colorNum--;
                    }
                }
            }
        }
        return numPatterns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        graph = new ArrayList[N];
        for (int i = 0; i < N; i++) graph[i] = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a].add(b);
            graph[b].add(a);
        }
        int ans = calculatePatterns(0, -1, K);
        System.out.println(ans);
    }
}