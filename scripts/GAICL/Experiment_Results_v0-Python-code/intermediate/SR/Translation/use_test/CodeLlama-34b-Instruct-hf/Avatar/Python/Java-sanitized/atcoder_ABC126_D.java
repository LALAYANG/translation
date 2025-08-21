import java.util.*;

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node());
        }

        for (int i = 0; i < n - 1; i++) {
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
        Set<Node> nodeSet = new HashSet<>();

        traverse(root, 0, nodeSet);

        for (int i = 0; i < n; i++) {
            Node node = nodes.get(i);
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
        if (nodeSet.contains(node)) {
            return;
        }
        nodeSet.add(node);
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.dis;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }
}

class Node {
    int val;
    List<Pair> a;
    boolean color;

    public Node() {
        this.val = 0;
        this.a = new ArrayList<>();
        this.color = false;
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