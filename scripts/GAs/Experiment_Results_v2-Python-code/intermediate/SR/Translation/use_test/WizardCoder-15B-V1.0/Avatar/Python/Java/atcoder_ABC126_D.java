```java
import java.util.*;

public class Main {
    static Node[] nodes;
    static Node node1, node2;
    static Set<Node> nodeSet;
    static int numNodes;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numNodes = sc.nextInt();
        nodes = new Node[numNodes];
        for (int i = 0; i < numNodes; i++) {
            nodes[i] = new Node();
        }
        ConstructGraph(0, numNodes - 1, 1);
        root = nodes[0];
        root.color = true;
        nodeSet = new HashSet<Node>();
        TraverseGraph(root, 0);
        PrintNodeColors(0, numNodes, 1);
    }

    static void ConstructGraph(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int u, v, w;
        u = sc.nextInt();
        v = sc.nextInt();
        w = sc.nextInt();
        node1 = nodes[u - 1];
        node2 = nodes[v - 1];
        node1.val = u;
        node2.val = v;
        node1.a.add(new Node[] { node2, w });
        node2.a.add(new Node[] { node1, w });
        ConstructGraph(i + step, stop, step);
    }

    static void TraverseGraph(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (Node[] pair : node.a) {
            Node adjNode = pair[0];
            int dis = pair[1];
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            TraverseGraph(adjNode, distance + dis);
        }
    }

    static void PrintNodeColors(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Node node = nodes[i];
        if (node.color) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        PrintNodeColors(i + step, stop, step);
    }
}

class Node {
    int val;
    boolean color;
    List<Node[]> a;

    public Node() {
        val = 0;
        color = false;
        a = new ArrayList<Node[]>();
    }
}
```
