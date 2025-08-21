```java
import java.util.*;

class Node {
    int val;
    boolean color;
    ArrayList<Pair> a = new ArrayList<>();

    Node() {
        val = -1;
        color = false;
    }
}

class Pair {
    Node node;
    int w;

    Pair(Node node, int w) {
        this.node = node;
        this.w = w;
    }
}

public class Main {
    static ArrayList<Node> nodes = new ArrayList<>();
    static Node rootNode;
    static Set<Node> nodeSet = new HashSet<>();

    static void initializeNodes(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nodes.add(new Node());
        initializeNodes(i + step, stop, step);
    }

    static void connectNodes(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        Scanner scanner = new Scanner(System.in);
        int firstNodeIndex = scanner.nextInt();
        int v = scanner.nextInt();
        int w = scanner.nextInt();
        Node node1 = nodes.get(firstNodeIndex - 1);
        Node node2 = nodes.get(v - 1);
        node1.val = firstNodeIndex;
        node2.val = v;
        node1.a.add(new Pair(node2, w));
        node2.a.add(new Pair(node1, w));
        connectNodes(i + step, stop, step);
    }

    static void traverse(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.w;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = rootNode.color;
            } else {
                adjNode.color = !rootNode.color;
            }
            traverse(adjNode, distance + dis);
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
        int n = scanner.nextInt();
        initializeNodes(0, n, 1);
        connectNodes(0, n - 1, 1);
        rootNode = nodes.get(0);
        rootNode.color = true;
        traverse(rootNode, 0);
        printNodeColors(0, n, 1);
    }
}
```

This Java code does the same thing as the Python code. It creates a graph with nodes and edges, then traverses the graph and assigns colors to the nodes based on the distance from the root node. The color of each node is printed as 1 if it's true and 0 if it's false.

