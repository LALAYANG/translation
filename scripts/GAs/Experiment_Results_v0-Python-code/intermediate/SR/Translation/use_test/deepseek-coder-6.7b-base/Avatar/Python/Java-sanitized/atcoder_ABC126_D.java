import java.util.*;
import java.lang.*;
import java.io.*;

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
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            String[] s = br.readLine().split(" ");
            int u = Integer.parseInt(s[0]);
            int v = Integer.parseInt(s[1]);
            int w = Integer.parseInt(s[2]);
            nodes[u - 1].a.add(new Pair(nodes[v - 1], w));
            nodes[v - 1].a.add(new Pair(nodes[u - 1], w));
        }
        nodes[0].color = true;
        Set<Node> nodeSet = new HashSet<Node>();
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