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

    static int bfs(int start, List<List<Integer>> graph) {
        int n = graph.size();
        int[] visited = new int[n];
        int[] node2color = new int[n];
        Arrays.fill(node2color, -1);
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(start, 0));
        visited[start] = 1;
        int K = -1;
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int color = 0;
            for (int nex : graph.get(currentNode.index)) {
                if (visited[nex] == 1) {
                    continue;
                }
                visited[nex] = 1;
                color = color + 1;
                if (color == node2color[currentNode.index]) {
                    color = color + 1;
                }
                node2color[nex] = color;
                queue.add(new Node(nex, color));
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<List<Integer>> G = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            G.add(new ArrayList<>());
        }
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            G.get(a).add(b);
            G.get(b).add(a);
        }
        int K = bfs(0, G);
        System.out.println(K);
    }
}
```

