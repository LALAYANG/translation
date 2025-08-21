
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

class Node {
    int val;
    boolean color;
    Node[] a;

    public Node(int val) {
        this.val = val;
        this.color = false;
        this.a = new Node[0];
    }
}

class Graph {
    Node[] nodes;
    int numNodes;

    public Graph(int numNodes) {
        this.numNodes = numNodes;
        this.nodes = new Node[numNodes];
        for (int i = 0; i < numNodes; i++) {
            nodes[i] = new Node(i + 1);
        }
    }

    public void constructGraph() {
        for (int i = 0; i < numNodes; i++) {
            Node node = nodes[i];
            for (int j = 0; j < node.a.length; j++) {
                Node adjNode = node.a[j];
                int dis = adjNode.val - node.val;
                if (dis % 2 == 0) {
                    adjNode.color = node.color;
                } else {
                    adjNode.color = !node.color;
                }
            }
        }
    }

    public void traverseGraph(Node node, int distance) {
        if (node.color) {
            return;
        }
        node.color = true;
        for (int i = 0; i < node.a.length; i++) {
            Node adjNode = node.a[i];
            int dis = adjNode.val - node.val;
            if (dis % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverseGraph(adjNode, distance + dis);
        }
    }

    public void printNodeColors() {
        for (int i = 0; i < numNodes; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        Graph graph = new Graph(numNodes);
        for (int i = 0; i < numNodes; i++) {
            Node node = graph.nodes[i];
            for (int j = 0; j < node.a.length; j++) {
                Node adjNode = node.a[j];
                int dis = adjNode.val - node.val;
                if (dis % 2 == 0) {
                    adjNode.color = node.color;
                } else {
                    adjNode.color = !node.color;
                }
            }
        }
        graph.traverseGraph(graph.nodes[0], 0);
        graph.printNodeColors();
    }
}
```
This code uses the same data structures and algorithms as the Python code, but it is written in Java. The `Node` class is similar to the `Node` class in the Python code, with the addition of a `color` field to keep track of the color of each node. The `Graph` class is similar to the `Graph` class in the Python code, with the addition of a `constructGraph` method to construct the graph and a `traverseGraph` method to traverse the graph. The `Main` class is similar to the `Main` class in the Python code, with the addition of a `printNodeColors` method to print the colors of the nodes.

I hope this helps! Let me know if you have any questions or need further assistance.
