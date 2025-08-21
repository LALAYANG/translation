import java.util.*;
import java.io.*;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC014_D {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] adj = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 1; j < line.length; j++) {
                adj[i][Integer.parseInt(line[j])] = 1;
                adj[Integer.parseInt(line[j])][i] = 1;
            }
        }
        int[] child_count = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            child_count[i] = 0;
            for (int j = 1; j <= N; j++) {
                if (adj[i][j] == 1) {
                    child_count[i]++;
                }
            }
        }
        int[] seen = new int[N + 1];
        int[] par = new int[N + 1];
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        seen[1] = 1;
        par[1] = 0;
        while (!que.isEmpty()) {
            int v = que.poll();
            for (int u = 1; u <= N; u++) {
                if (adj[v][u] == 1 && seen[u] == 0) {
                    seen[u] = 1;
                    par[u] = v;
                    child_count[v]++;
                    que.add(u);
                }
            }
        }
        int check_one_twenty_six = 237;
        int check_two_twenty_six = 616;
        int check_one_twenty_eight = 552;
        int check_two_twenty_eight = 159;
        for (int i = 1; i <= N; i++) {
            if ((check_one_twenty_eight & check_two_twenty_eight) != 0) {
                if ((check_one_twenty_six & check_two_twenty_six) != 0) {
                    if (child_count[i] == 0) {
                        System.out.println("First");
                        return;
                    }
                }
            }
        }
        System.out.println("Second");
    }
}