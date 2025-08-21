import java.util.*;

class Node {
    int val;
    boolean color;
    List<int[]> a;

    public Node() {
        this.val = -1;
        this.color = false;
        this.a = new ArrayList<>();
    }
}

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            nodes[u].val = u;
            nodes[v].val = v;
            nodes[u].a.add(new int[]{nodes[v], w});
            nodes[v].a.add(new int[]{nodes[u], w});
        }
        nodes[0].color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(nodes[0], 0, nodeSet);
        for (int i = 0; i < n; i++) {
            if (nodes[i].color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (int[] pair : node.a) {
            Node adjNode = (Node) pair[0];
            int dis = pair[1];
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }
}