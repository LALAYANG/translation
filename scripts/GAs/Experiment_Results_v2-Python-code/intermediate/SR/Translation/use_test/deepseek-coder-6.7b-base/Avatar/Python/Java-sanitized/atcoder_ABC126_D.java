import java.util.*;

class Node {
    int val;
    boolean color;
    ArrayList<Pair> a;

    Node() {
        val = 0;
        color = false;
        a = new ArrayList<Pair>();
    }
}

class Pair {
    Node node;
    int dis;

    Pair(Node node, int dis) {
        this.node = node;
        this.dis = dis;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNodes = sc.nextInt();
        Node[] nodes = new Node[numNodes];
        for (int i = 0; i < numNodes; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < numNodes - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            nodes[u - 1].a.add(new Pair(nodes[v - 1], w));
            nodes[v - 1].a.add(new Pair(nodes[u - 1], w));
        }
        Node root = nodes[0];
        root.color = true;
        Set<Node> nodeSet = new HashSet<Node>();
        nodeSet.add(root);
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            Pair pair = q.poll();
            Node node = pair.node;
            int distance = pair.dis;
            if (nodeSet.contains(node)) {
                continue;
            }
            nodeSet.add(node);
            for (Pair adjPair : node.a) {
                Node adjNode = adjPair.node;
                int dis = adjPair.dis;
                if ((distance + dis) % 2 == 0) {
                    adjNode.color = root.color;
                } else {
                    adjNode.color = !root.color;
                }
                q.add(new Pair(adjNode, distance + dis));
            }
        }
        for (int i = 0; i < numNodes; i++) {
            if (nodes[i].color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}