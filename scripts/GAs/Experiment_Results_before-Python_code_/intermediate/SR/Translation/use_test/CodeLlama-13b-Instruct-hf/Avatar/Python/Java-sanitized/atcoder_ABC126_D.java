import java.util.Scanner;

class Node {
    int val;
    boolean color;
    Node[] a;

    Node(int val) {
        this.val = val;
        this.color = false;
        this.a = new Node[0];
    }
}

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(i + 1);
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.a = new Node[node1.a.length + 1];
            node1.a[node1.a.length - 1] = new Node(v);
            node2.a = new Node[node2.a.length + 1];
            node2.a[node2.a.length - 1] = new Node(u);
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
        } else {
            nodeSet.add(node);
        }
        for (int i = 0; i < node.a.length; i++) {
            Node adjNode = node.a[i];
            int dis = node.a[i].val;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis);
        }
    }
}