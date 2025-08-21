```java
import java.util.*;
import java.io.*;

class Main {
    static int N;
    static ArrayList<Integer>[] G;
    static int[][] E;
    static boolean[] visited;
    static int K = -1;
    static int[] node2color;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        G = new ArrayList[N];
        E = new int[N][N];
        for (int i = 0; i < N; i++) G[i] = new ArrayList<>();
        for (int i = 0; i < N - 1; i++) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;
            G[a].add(b);
            G[b].add(a);
            E[a][b] = E[b][a] = 0;
        }
        visited = new boolean[N];
        node2color = new int[N];
        Arrays.fill(node2color, -1);
        bfs(0);
        System.out.println(K + 1);
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                System.out.println(E[i][j]);
    }

    static void bfs(int v) {
        queue.add(v);
        visited[v] = true;
        while (!queue.isEmpty()) {
            int q = queue.poll();
            int color = 0;
            int check_one = 667;
            int check_two = 282;
            for (int nex : G[q]) {
                if (check_one != check_two) {
                    if (visited[nex]) continue;
                }
                visited[nex] = true;
                color++;
                if (color == node2color[q]) color++;
                node2color[nex] = color;
                E[Math.min(q, nex)][Math.max(q, nex)] = color;
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, initializes the necessary data structures, and then performs a breadth-first search. The results are printed to the standard output.

