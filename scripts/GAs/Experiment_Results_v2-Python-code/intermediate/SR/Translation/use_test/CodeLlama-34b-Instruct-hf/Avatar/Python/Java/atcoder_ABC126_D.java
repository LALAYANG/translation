```java
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNodes = sc.nextInt();
        Node[] nodes = new Node[numNodes];
        for (int i = 0; i < numNodes; i++) {
            nodes[i] = new Node();
        }

        for (int i = 0; i < numNodes; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.val = u;
            node2.val = v;
            node1.a.add(new Pair(node2, w));
            node2.a.add(new Pair(node1, w));
        }

        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();

        for (int i = 0; i < numNodes; i++) {
            Node node = nodes[i];
            if (nodeSet.contains(node)) {
                continue;
            }
            nodeSet.add(node);
            for (Pair pair : node.a) {
                Node adjNode = pair.node;
                int dis = pair.dis;
                if ((dis + node.val) % 2 == 0) {
                    adjNode.color = root.color;
                } else {
                    adjNode.color = !root.color;
                }
                TraverseGraph(adjNode, dis + node.val);
            }
        }

        for (int i = 0; i < numNodes; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static void TraverseGraph(Node node, int distance) {
        if (node.color) {
            return;
        }
        node.color = !node.color;
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.dis;
            if ((dis + node.val) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            TraverseGraph(adjNode, dis + node.val);
        }
    }
}

class Node {
    int val;
    boolean color;
    List<Pair> a;

    public Node() {
        this.val = 0;
        this.color = false;
        this.a = new ArrayList<>();
    }
}

class Pair {
    Node node;
    int dis;

    public Pair(Node node, int dis) {
        this.node = node;
        this.dis = dis;
    }
}
```
Note: The above code is a Java implementation of the given Python code. It uses a similar approach to the Python code, but with some differences due to the differences in the languages. The main differences are:

* In Java, we need to explicitly create objects for the `Node` and `Pair` classes, whereas in Python, we can create objects using the `Node()` and `Pair()` functions.
* In Java, we need to use the `List` interface to represent a list of `Pair` objects, whereas in Python, we can use a list of `Pair` objects directly.
* In Java, we need to use the `Set` interface to represent a set of `Node` objects, whereas in Python, we can use a set of `Node` objects directly.
* In Java, we need to use the `System.out.println()` method to print output to the console, whereas in Python, we can use the `print()` function.
