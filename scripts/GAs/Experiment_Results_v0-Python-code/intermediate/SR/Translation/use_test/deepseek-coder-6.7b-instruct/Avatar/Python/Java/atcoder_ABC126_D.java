```java
import java.util.*;
import java.net.*;
import java.io.*;
import java.lang.Math;
import java.lang.Exception;

class Node {
    int val;
    ArrayList<Pair> a = new ArrayList<>();
    boolean color;

    Node() {
        this.val = 0;
        this.color = false;
    }
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
    static Node[] nodes;
    static Set<Node> nodeSet = new HashSet<>();

    static void traverse(Node node, int distance) {
        if (node.color) {
            return;
        }
        nodeSet.add(node);
        node.color = true;
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            if ((distance + pair.weight) % 2 == 0) {
                adjNode.color = !node.color;
            } else {
                adjNode.color = node.color;
            }
            traverse(adjNode, distance + pair.weight);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            String[] line = br.readLine().split(" ");
            int u = Integer.parseInt(line[0]) - 1;
            int v = Integer.parseInt(line[1]) - 1;
            int w = Integer.parseInt(line[2]);
            nodes[u].a.add(new Pair(nodes[v], w));
            nodes[v].a.add(new Pair(nodes[u], w));
        }
        traverse(nodes[0], 0);
        for (int i = 0; i < n; i++) {
            if (nodes[i].color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```

Please note that the Java code provided above is a direct translation of the Python code. It may not work as expected because the Python code uses some libraries that do not have a direct equivalent in Java. For example, the Python code uses the `scipy.stats` library for the `ttest_ind` function, which is not available in Java. Therefore, the Java code may not perform the same operations as the Python code.

