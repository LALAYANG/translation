```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        initializeNodes(nodes, 0, n - 1, 1);
        connectNodes(nodes, 0, n - 1, 1);
        Node rootNode = nodes[0];
        rootNode.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(rootNode, 0, nodeSet);
        printNodeColors(nodes, 0, n - 1, 1);
    }

    public static void initializeNodes(Node[] nodes, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nodes[i] = new Node();
        initializeNodes(nodes, i + step, stop, step);
    }

    public static void connectNodes(Node[] nodes, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int firstNodeIndex = sc.nextInt();
        int v = sc.nextInt();
        int w = sc.nextInt();
        Node node1 = nodes[firstNodeIndex - 1];
        Node node2 = nodes[v - 1];
        node1.val = firstNodeIndex;
        node2.val = v;
        node1.a.add(new Node[] { node2, w });
        node2.a.add(new Node[] { node1, w });
        connectNodes(nodes, i + step, stop, step);
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
        if (nodeSet.contains(node)) {
            return;
        }
        nodeSet.add(node);
        for (Node[] pair : node.a) {
            Node adjNode = pair[0];
            int dis = pair[1];
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    public static void printNodeColors(Node[] nodes, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Node node = nodes[i];
        if (node.color) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        printNodeColors(nodes, i + step, stop, step);
    }
}

class Node {
    int val;
    boolean color;
    List<Node[]> a;

    public Node() {
        val = -1;
        color = false;
        a = new ArrayList<>();
    }
}
```
