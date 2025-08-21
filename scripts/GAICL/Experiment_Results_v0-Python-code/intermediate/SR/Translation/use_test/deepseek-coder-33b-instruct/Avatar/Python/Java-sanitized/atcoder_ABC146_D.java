import java.util.*;
import java.util.concurrent.*;

public class atcoder_ABC146_D {
    static class Node {
        int value;
        List<Node> neighbors;

        Node(int value) {
            this.value = value;
            this.neighbors = new ArrayList<>();
        }
    }

    static class Edge {
        Node node1;
        Node node2;
        int color;

        Edge(Node node1, Node node2) {
            this.node1 = node1;
            this.node2 = node2;
            this.color = 0;
        }
    }

    static class Graph {
        List<Node> nodes;
        List<Edge> edges;

        Graph(int n) {
            this.nodes = new ArrayList<>();
            this.edges = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                this.nodes.add(new Node(i));
            }
        }

        void addEdge(int a, int b) {
            Node node1 = this.nodes.get(a);
            Node node2 = this.nodes.get(b);
            Edge edge = new Edge(node1, node2);
            node1.neighbors.add(node2);
            node2.neighbors.add(node1);
            this.edges.add(edge);
        }
    }

    static int bfs(Node start) {
        Queue<Node> queue = new LinkedList<>();
        boolean[] visited = new boolean[start.neighbors.size()];
        int[] node2color = new int[start.neighbors.size()];
        Arrays.fill(node2color, -1);
        queue.add(start);
        visited[start.value] = true;
        int K = -1;
        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            int color = 0;
            for (Node nex : currentNode.neighbors) {
                if (visited[nex.value]) {
                    continue;
                }
                visited[nex.value] = true;
                color++;
                if (color == node2color[currentNode.value]) {
                    color++;
                }
                node2color[nex.value] = color;
                queue.add(nex);
            }
            K = Math.max(K, color);
        }
        return K;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Graph graph = new Graph(N);
        for (int i = 0; i < N - 1; i++) {
            int a = scanner.nextInt() - 1;
            int b = scanner.nextInt() - 1;
            graph.addEdge(a, b);
        }
        int K = bfs(graph.nodes.get(0));
        System.out.println(K);
        for (Edge edge : graph.edges) {
            System.out.println(edge.color);
        }
    }
}