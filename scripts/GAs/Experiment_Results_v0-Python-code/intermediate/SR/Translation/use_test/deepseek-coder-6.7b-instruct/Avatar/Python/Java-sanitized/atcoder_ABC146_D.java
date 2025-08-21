import java.util.*;
import java.io.*;

class Main {
    static int N;
    static ArrayList<Integer>[] G;
    static HashMap<Integer, Integer> E = new HashMap<>();
    static int[] visited;
    static int K = -1;
    static int[] node2color;

    static int Func_bfs_0(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = 1;
        while (!queue.isEmpty()) {
            int current_node = queue.poll();
            int color = 0;
            for (int nex : G[current_node]) {
                if (visited[nex] == 1)
                    continue;
                visited[nex] = 1;
                color++;
                if (color == node2color[current_node])
                    color++;
                node2color[nex] = color;
                E.put(Math.min(current_node, nex) * N + Math.max(current_node, nex), color);
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        G = new ArrayList[N];
        for (int i = 0; i < N; i++)
            G[i] = new ArrayList<>();
        visited = new int[N];
        node2color = new int[N];
        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            G[a].add(b);
            G[b].add(a);
            E.put(a * N + b, 0);
        }
        System.out.println(Func_bfs_0(0));
        for (int value : E.values())
            System.out.println(value);
    }
}