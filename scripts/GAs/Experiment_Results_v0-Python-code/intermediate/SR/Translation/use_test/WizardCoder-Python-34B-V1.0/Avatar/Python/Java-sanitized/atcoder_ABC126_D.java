import java.util.*;
import java.time.*;
import java.net.*;
import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.util.Base64;
import java.time.format.*;

public class atcoder_ABC126_D {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Node> nodes = new ArrayList<>();
        int outerLoopBound = 782;
        int loopBound = 781;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / loopBound; LoopIndexOut++) {
            createNodes(0, n, 1, nodes);
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
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
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
        }
        for (int[] pair : node.a) {
            Node adjNode = pair[0];
            int dis = pair[1];
            if ((distance + dis) % 2 == 0) {
                adjNode.color = !node.color;
            } else {
                adjNode.color = node.color;
            }
            traverse(adjNode, distance + dis, nodeSet);
        }
    }

    public static class Node {
        int val;
        List<int[]> a = new ArrayList<>();
        boolean color;
    }
}