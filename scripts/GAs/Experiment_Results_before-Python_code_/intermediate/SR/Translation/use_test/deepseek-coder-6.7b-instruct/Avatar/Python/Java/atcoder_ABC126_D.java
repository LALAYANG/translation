```java
import java.util.*;

class Node {
    int val;
    boolean color;
    List<Pair> a = new ArrayList<>();
}

class Pair {
    Node node;
    int dis;

    Pair(Node node, int dis) {
        this.node = node;
        this.dis = dis;
    }
}

public class Main {
    static Node[] nodes;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        nodes = new Node[n];
        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            int w = scanner.nextInt();
            nodes[u].a.add(new Pair(nodes[v], w));
            nodes[v].a.add(new Pair(nodes[u], w));
        }
        nodes[0].color = true;
        traverse(nodes[0], 0);
        for (int i = 0; i < n; i++) {
            if (nodes[i].color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    static void traverse(Node node, int distance) {
        if (visited[node.val - 1]) {
            return;
        } else {
            visited[node.val - 1] = true;
        }
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.dis;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis);
        }
    }
}
```

