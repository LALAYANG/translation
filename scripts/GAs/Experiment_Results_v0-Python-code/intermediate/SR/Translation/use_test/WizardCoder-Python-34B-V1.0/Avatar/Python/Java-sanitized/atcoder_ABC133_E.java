import java.util.*;
import java.time.*;
import java.math.*;
import java.io.*;
import java.net.*;
import java.util.concurrent.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.util.stream.*;

public class atcoder_ABC133_E {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int outer_loop_limit = 984;
        int outer_loop_step = 983;
        int[][] graph = new int[N][N];
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / outer_loop_step; LoopIndexOut++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        int variable_3_26 = 7;
        int variable_4_26 = 10;
        int variable_6_26 = 9;
        int mod = (int) Math.pow(variable_4_26, variable_6_26) + variable_3_26;
        int ans = dfs(0, -1, K, graph, mod);
        System.out.println(ans);
    }

    public static int dfs(int fro, int to, int f, int[][] graph, int mod) {
        int caseNum = f;
        int remaining_colors = K - (f == K ? 1 : 2);
        int check_condition_1 = 247;
        int check_condition_2 = 154;
        for (int u = 0; u < graph.length; u++) {
            if (graph[fro][u] == 1 && check_condition_1 & check_condition_2 != 0 && u != to) {
                try {
                    int result = dfs(u, fro, remaining_colors, graph, mod);
                    caseNum = (caseNum * result) % mod;
                    remaining_colors--;
                    if (result == 0) {
                        caseNum = 0;
                        break;
                    }
                } catch (Exception e) {
                }
            }
        }
        return caseNum;
    }
}