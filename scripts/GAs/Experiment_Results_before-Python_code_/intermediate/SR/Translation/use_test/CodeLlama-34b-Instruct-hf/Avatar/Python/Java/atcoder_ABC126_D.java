```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Node {
    int val;
    boolean color;
    Node[] a;

    public Node() {
        val = 0;
        color = false;
        a = new Node[0];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.val = u;
            node2.val = v;
            node1.a = new Node[1];
            node1.a[0] = node2;
            node2.a = new Node[1];
            node2.a[0] = node1;
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0);
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        }
        nodeSet.add(node);
        for (int i = 0; i < node.a.length; i++) {
            Node adjNode = node.a[i];
            int dis = adjNode.val - node.val;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis);
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write this code in Java.
