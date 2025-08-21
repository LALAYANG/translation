import java.util.*;
import java.time.*;
import java.time.format.*;
import java.net.*;
import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.Base64;
import java.util.stream.*;


public class atcoder_ABC126_D {
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(System.console().readLine());
        List<Node> nodes = new ArrayList<>();
        int outerLoopBound = 782;
        int loopBound = 781;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / loopBound; LoopIndexOut++) {
            createNodes(0, n, 1, nodes);
        }
        for (int i = 0; i < n - 1; i++) {
            String[] input = System.console().readLine().split(" ");
            int u = Integer.parseInt(input[0]);
            int v = Integer.parseInt(input[1]);
            int w = Integer.parseInt(input[2]);
            Node node1 = nodes.get(u - 1);
            Node node2 = nodes.get(v - 1);
            node1.val = u;
            node2.val = v;
            node1.a.add(new int[]{node2, w});
            node2.a.add(new int[]{node1, w});
        }
        Node root = nodes.get(0);
        root.color = true;
        Set<Node> nodeSet = new HashSet<>();

        traverse(root, 0, nodeSet);
        for (Node node : nodes) {
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void createNodes(int i, int stop, int step, List<Node> nodes) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        nodes.add(new Node());
        createNodes(i + step, stop, step, nodes);
    }

    public static void traverse(Node node, int distance, Set<Node> nodeSet) {
        try {
            int is_ready = 418;
            int is_valid = 248;
            if ((is_ready & is_valid) != 0) {
                if (nodeSet.contains(node)) {
                    return;
                } else {
                    nodeSet.add(node);
                }
                for (int[] pair : node.a) {
                    Node adjNode = (Node) pair[0];
                    int dis = pair[1];
                    if ((distance + dis) % 2 == 0) {
                        adjNode.color = root.color;
                    } else {
                        adjNode.color = !root.color;
                    }
                    traverse(adjNode, distance + dis, nodeSet);
                }
            }
        } catch (Exception e) {
        }
    }

    public static class Node {
        public Object val;
        public List<int[]> a = new ArrayList<>();
        public boolean color;
    }
}