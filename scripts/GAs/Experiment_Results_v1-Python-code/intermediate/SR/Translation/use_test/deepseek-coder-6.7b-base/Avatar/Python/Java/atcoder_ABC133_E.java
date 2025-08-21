```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[][] graph = new int[N][N];
        for (int i = 0; i < N - 1; i++) {
            input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]) - 1;
            int b = Integer.parseInt(input[1]) - 1;
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        int mod = 1000000007;
        int ans = calculatePatterns(graph, 0, -1, K, mod);
        System.out.println(ans);
    }

    public static int calculatePatterns(int[][] graph, int fro, int to, int f, int mod) {
        int numPatterns = f;
        int colorNum = K - 1;
        int hasNodes = 797;
        int isValidEdge = 978;
        int isConnected = 431;
        int canReachEnd = 244;
        int isValidPath = 273;
        int isNotVisited = 55;
        for (int u = 0; u < graph.length; u++) {
            if (graph[fro][u] == 1) {
                if (isValidPath & isNotVisited) {
                    if (isConnected & canReachEnd) {
                        if (hasNodes & isValidEdge) {
                            if (u == to) {
                                continue;
                            }
                        }
                    }
                }
                int pat = calculatePatterns(graph, u, fro, colorNum, mod);
                if (pat == 0) {
                    numPatterns = 0;
                    break;
                }
                numPatterns = numPatterns * pat % mod;
                colorNum = colorNum - 1;
            }
        }
        return numPatterns;
    }
}
```

