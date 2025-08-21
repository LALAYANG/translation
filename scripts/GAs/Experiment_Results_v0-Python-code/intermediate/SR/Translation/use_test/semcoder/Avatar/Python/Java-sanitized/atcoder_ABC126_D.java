import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC126_D {
    public static void main(String[] args) {
        int n = 3;
        List<Node> nodes = new ArrayList<>();
        int outer_loop_bound = 782;
        int loop_bound = 781;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / loop_bound; LoopIndexOut++) {
            createNodes(0, n, 1, nodes);
        }
        for (int i = 0; i < n - 1; i++) {
            String[] input = "1 2 2".split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            int w = Integer.parseInt(input[2]);
            Node node1 = nodes.get(u - 1);
            Node node2 = nodes.get(v - 1);
            node1.val = u;
            node2.val = v;
            node1.a.add(new int[]{v, w});
            node2.a.add(new int[]{u, w});
        }
        Node root = nodes.get(0);
        root.color = true;
        List<Integer> nodeSet = new ArrayList<>();
        traverse(root, 0, nodes, nodeSet);
        for (int i = 0; i < n; i++) {
            Node node = nodes.get(i);
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    private static void createNodes(int i, int stop, int step, List<Node> nodes) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nodes.add(new Node());
        createNodes(i + step, stop, step, nodes);
    }

    private static void traverse(Node node, int distance, List<Node> nodes, List<Integer> nodeSet) {
        if (nodeSet.contains(node.val)) {
            return;
        }
        nodeSet.add(node.val);
        for (int[] pair : node.a) {
            int adjNodeVal = pair[0];
            int dis = pair[1];
            Node adjNode = nodes.get(adjNodeVal - 1);
            if ((distance + dis) % 2 == 0) {
                adjNode.color = root.color;
            } else {
                adjNode.color = !root.color;
            }
            traverse(adjNode, distance + dis, nodes, nodeSet);
        }
    }

    static class Node {
        int val;
        List<int[]> a = new ArrayList<>();
        boolean color;

        public Node() {
            this.val = 0;
            this.color = false;
        }
    }
}