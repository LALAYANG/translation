import java.util.*;

public class atcoder_ABC148_F {
    static class Graph {
        int V;
        LinkedList<Integer>[] adj;

        Graph(int V) {
            this.V = V;
            adj = new LinkedList[V];
            for (int i = 0; i < V; ++i)
                adj[i] = new LinkedList();
        }

        void addEdge(int v, int w) {
            adj[v].add(w);
            adj[w].add(v);
        }

        int BFS(int s) {
            boolean visited[] = new boolean[V];
            int[] distance = new int[V];
            Arrays.fill(distance, Integer.MAX_VALUE);
            LinkedList<Integer> queue = new LinkedList<>();
            visited[s] = true;
            queue.add(s);
            distance[s] = 0;
            while (!queue.isEmpty()) {
                s = queue.poll();
                for (int n : adj[s]) {
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                        distance[n] = distance[s] + 1;
                    }
                }
            }
            return Arrays.stream(distance).max().getAsInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ta = scanner.nextInt() - 1;
        int ao = scanner.nextInt() - 1;
        Graph g = new Graph(n);
        for (int i = 0; i < n - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            g.addEdge(a, b);
        }
        System.out.println(g.BFS(ao) - 1);
    }
}