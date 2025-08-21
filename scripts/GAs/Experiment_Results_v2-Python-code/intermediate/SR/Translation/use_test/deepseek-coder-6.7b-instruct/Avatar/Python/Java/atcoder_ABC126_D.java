```java
import java.util.*;

class Node {
    int val;
    boolean color;
    List<Pair> a = new ArrayList<>();
}

class Pair {
    Node node;
    int weight;

    Pair(Node node, int weight) {
        this.node = node;
        this.weight = weight;
    }
}

public class Main {
    static List<Node> nodes = new ArrayList<>();
    static Node root;
    static Set<Node> nodeSet = new HashSet<>();

    static void createNodes(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nodes.add(new Node());
        createNodes(i + step, stop, step);
    }

    static void constructGraph(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int w = scanner.nextInt();
        Node node1 = nodes.get(u - 1);
        Node node2 = nodes.get(v - 1);
        node1.val = u;
        node2.val = v;
        node1.a.add(new Pair(node2, w));
        node2.a.add(new Pair(node1, w));
        constructGraph(i + step, stop, step);
    }

    static void traverseGraph(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.weight;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverseGraph(adjNode, distance + dis);
        }
    }

    static void printNodeColors(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Node node = nodes.get(i);
        if (node.color) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        printNodeColors(i + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        createNodes(0, numNodes, 1);
        root = nodes.get(0);
        root.color = true;
        constructGraph(0, numNodes - 1, 1);
        traverseGraph(root, 0);
        printNodeColors(0, numNodes, 1);
    }
}
```

This Java code does the same thing as the Python code. It creates a graph, traverses it, and prints the color of each node. The graph is represented as an adjacency list where each node has a list of pairs (adjacent node, weight). The traversal is done using a depth-first search. The color of each node is a boolean value where true means the node is colored black and false means the node is colored white. The color of the root node is always black.

