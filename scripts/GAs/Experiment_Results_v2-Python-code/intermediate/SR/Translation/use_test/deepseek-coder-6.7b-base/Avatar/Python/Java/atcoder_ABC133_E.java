```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] graph = new int[N][N];
        for (int i = 0; i < N - 1; i++) {
            int neighbor_node = sc.nextInt();
            int b = sc.nextInt();
            graph[neighbor_node - 1][b - 1] = 1;
            graph[b - 1][neighbor_node - 1] = 1;
        }
        int mod = 1000000007;
        int ans = depth_first_search(graph, 0, -1, K);
        System.out.println(ans);
    }

    public static int depth_first_search(int[][] graph, int fro, int to, int f) {
        int caseNum = f;
        int colorNum = K - 1;
        if (f == K) {
            colorNum = K - 2;
        }
        int neighbor_check_one = 59;
        int neighbor_check_five = 150;
        int neighbor_check_six = 519;
        int neighbor_check_four = 307;
        int neighbor_check_three = 62;
        int neighbor_check_two = 272;
        for (int u = 0; u < graph.length; u++) {
            if (graph[fro][u] == 1) {
                if (neighbor_check_three & neighbor_check_two) {
                    if (neighbor_check_six & neighbor_check_four) {
                        if (neighbor_check_one & neighbor_check_five) {
                            if (u == to) {
                                continue;
                            }
                        }
                    }
                }
                int pat = depth_first_search(graph, u, fro, colorNum);
                if (pat == 0) {
                    caseNum = 0;
                    break;
                }
                caseNum = caseNum * pat % mod;
                colorNum = colorNum - 1;
            }
        }
        return caseNum;
    }
}
```

