```java
import java.util.*;

class Node {
    int val;
    Boolean color;
    ArrayList<Pair> a;

    Node() {
        this.val = 0;
        this.color = null;
        this.a = new ArrayList<>();
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
    static ArrayList<Node> nodes = new ArrayList<>();
    static Set<Node> nodeSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        initializeNodes(0, n, 1);

        for (int i = 0; i < n - 1; i++) {
            int firstNodeIndex = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();

            Node node1 = nodes.get(firstNodeIndex - 1);
            Node node2 = nodes.get(v - 1);

            node1.val = firstNodeIndex;
            node2.val = v;

            node1.a.add(new Pair(node2, w));
            node2.a.add(new Pair(node1, w));
        }

        Node rootNode = nodes.get(0);
        rootNode.color = true;

        traverse(rootNode, 0);

        printNodeColors(0, n, 1);
    }

    static void initializeNodes(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nodes.add(new Node());
        initializeNodes(i + step, stop, step);
    }

    static void traverse(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.weight;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
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
}
```

