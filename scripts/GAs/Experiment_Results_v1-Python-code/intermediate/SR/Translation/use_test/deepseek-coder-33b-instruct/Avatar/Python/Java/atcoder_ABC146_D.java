```java
import java.util.*;

public class Main {
    static class Node {
        int index;
        int color;
        Node(int index, int color) {
            this.index = index;
            this.color = color;
        }
    }

    static int breadthFirstSearch(int v, int N, ArrayList<ArrayList<Integer>> G, int[][] E) {
        boolean[] visited = new boolean[N];
        Queue<Node> queue = new LinkedList<>();
        int K = -1;
        int[] node2color = new int[N];
        Arrays.fill(node2color, -1);
        queue.add(new Node(v, 0));
        visited[v] = true;
        while (!queue.isEmpty()) {
            Node q = queue.poll();
            int color = 0;
            for (int nex : G.get(q.index)) {
                if (visited[nex]) {
                    continue;
                }
                visited[nex] = true;
                color = color + 1;
                if (color == node2color[q.index]) {
                    color += 1;
                }
                node2color[nex] = color;
                E[Math.min(q.index, nex)][Math.max(q.index, nex)] = color;
                queue.add(new Node(nex, color));
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<ArrayList<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        int[][] E = new int[N][N];
        for (int i = 0; i < N - 1; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
            E[a][b] = 0;
        }
        int K = breadthFirstSearch(0, N, G, E);
        System.out.println(K);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                System.out.println(E[i][j]);
            }
        }
    }
}
```

