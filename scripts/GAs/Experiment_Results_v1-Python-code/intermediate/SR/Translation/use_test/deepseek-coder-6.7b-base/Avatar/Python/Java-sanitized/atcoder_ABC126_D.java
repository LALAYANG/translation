import java.util.*;

class Node {
    int val;
    boolean color;
    ArrayList<Pair> a;

    Node() {
        val = -1;
        color = false;
        a = new ArrayList<Pair>();
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

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int firstNodeIndex = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            nodes[firstNodeIndex - 1].val = firstNodeIndex;
            nodes[v - 1].val = v;
            nodes[firstNodeIndex - 1].a.add(new Pair(nodes[v - 1], w));
            nodes[v - 1].a.add(new Pair(nodes[firstNodeIndex - 1], w));
        }
        Node rootNode = nodes[0];
        rootNode.color = true;
        Set<Node> nodeSet = new HashSet<Node>();
        traverse(rootNode, 0, nodeSet);
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
        for (Pair pair : node.a) {
            Node adjNode = pair.node;
            int dis = pair.weight;
            if ((distance + dis) % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }
}