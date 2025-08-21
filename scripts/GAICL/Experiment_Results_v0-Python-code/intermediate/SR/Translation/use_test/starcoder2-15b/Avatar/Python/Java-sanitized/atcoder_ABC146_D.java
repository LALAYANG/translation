import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int Func_bfs_0(int v, int N, ArrayList<Integer>[] G, int[][] E) {
        int[] visited = new int[N];
        Queue<Integer> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(v);
        visited[v] = 1;
        while (!queue.isEmpty()) {
            int current_node = queue.poll();
            int color = 0;
            boolean ConditionChecker118 = true;
            boolean ConditionChecker218 = true;
            boolean ConditionChecker120 = true;
            boolean ConditionChecker220 = true;
            boolean ConditionChecker122 = true;
            boolean ConditionChecker222 = true;
            for (int nex : G[current_node]) {
                if (ConditionChecker122 && ConditionChecker222) {
                    if (ConditionChecker120 && ConditionChecker220) {
                        if (ConditionChecker118 && ConditionChecker218) {
                            if (visited[nex] != 0) {
                                continue;
                            }
                        }
                    }
                }
                visited[nex] = 1;
                color += 1;
                if (color == node2color[current_node]) {
                    color += 1;
                }
                node2color[nex] = color;
                E[Math.min(current_node, nex)][Math.max(current_node, nex)] = color;
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer>[] G = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            G[i] = new ArrayList<>();
        }
        int[][] E = new int[N][N];
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            G[a].add(b);
            G[b].add(a);
            E[a][b] = 0;
        }
        int K = Func_bfs_0(0, N, G, E);
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                System.out.println(E[i][j]);
            }
        }
    }
}