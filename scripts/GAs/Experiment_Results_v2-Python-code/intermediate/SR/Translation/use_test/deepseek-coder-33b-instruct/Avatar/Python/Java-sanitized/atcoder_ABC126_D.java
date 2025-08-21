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

public class atcoder_ABC126_D {
    static ArrayList<Node> nodes = new ArrayList<>();
    static Set<Node> nodeSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNodes = sc.nextInt();

        for (int i = 0; i < numNodes; i++) {
            nodes.add(new Node());
        }

        for (int i = 0; i < numNodes - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            Node node1 = nodes.get(u - 1);
            Node node2 = nodes.get(v - 1);

            node1.val = u;
            node2.val = v;

            node1.a.add(new Pair(node2, w));
            node2.a.add(new Pair(node1, w));
        }

        Node root = nodes.get(0);
        root.color = true;

        TraverseGraph(root, 0);

        for (Node node : nodes) {
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void TraverseGraph(Node node, int distance) {
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

            TraverseGraph(adjNode, distance + dis);
        }
    }
}