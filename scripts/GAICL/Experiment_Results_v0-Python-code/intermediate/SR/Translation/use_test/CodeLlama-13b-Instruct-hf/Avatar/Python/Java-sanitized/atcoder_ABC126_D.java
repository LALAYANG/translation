import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i));
        }
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            nodes.get(u - 1).addAdjacentNode(nodes.get(v - 1), w);
            nodes.get(v - 1).addAdjacentNode(nodes.get(u - 1), w);
        }
        Node root = nodes.get(0);
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(root, 0);
        for (Node node : nodes) {
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static void traverse(Node node, int distance) {
        nodeSet.add(node);
        for (Node adjNode : node.adjacentNodes) {
            int dis = adjNode.value - node.value;
            if (distance + dis % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis);
        }
    }

    private static class Node {
        int value;
        List<Node> adjacentNodes;
        boolean color;

        public Node(int value) {
            this.value = value;
            this.adjacentNodes = new ArrayList<>();
        }

        public void addAdjacentNode(Node node, int weight) {
            adjacentNodes.add(node);
        }
    }
}