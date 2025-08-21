import java.util.Scanner;

class Node {
    int val;
    boolean color;
    Node[] a;

    public Node(int val) {
        this.val = val;
        this.color = false;
        this.a = new Node[0];
    }
}

class Graph {
    Node[] nodes;
    int numNodes;

    public Graph(int numNodes) {
        this.numNodes = numNodes;
        this.nodes = new Node[numNodes];
        for (int i = 0; i < numNodes; i++) {
            nodes[i] = new Node(i + 1);
        }
    }

    public void constructGraph() {
        for (int i = 0; i < numNodes; i++) {
            Node node = nodes[i];
            for (int j = 0; j < node.a.length; j++) {
                Node adjNode = node.a[j];
                int dis = adjNode.val - node.val;
                if (dis % 2 == 0) {
                    adjNode.color = node.color;
                } else {
                    adjNode.color = !node.color;
                }
            }
        }
    }

    public void traverseGraph(Node node, int distance) {
        if (node.color) {
            return;
        }
        node.color = true;
        for (int i = 0; i < node.a.length; i++) {
            Node adjNode = node.a[i];
            int dis = adjNode.val - node.val;
            if (dis % 2 == 0) {
                adjNode.color = node.color;
            } else {
                adjNode.color = !node.color;
            }
            traverseGraph(adjNode, distance + dis);
        }
    }

    public void printNodeColors() {
        for (int i = 0; i < numNodes; i++) {
            Node node = nodes[i];
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        Graph graph = new Graph(numNodes);
        for (int i = 0; i < numNodes; i++) {
            Node node = graph.nodes[i];
            for (int j = 0; j < node.a.length; j++) {
                Node adjNode = node.a[j];
                int dis = adjNode.val - node.val;
                if (dis % 2 == 0) {
                    adjNode.color = node.color;
                } else {
                    adjNode.color = !node.color;
                }
            }
        }
        graph.traverseGraph(graph.nodes[0], 0);
        graph.printNodeColors();
    }
}