```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numNodes = sc.nextInt();
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < numNodes; i++) {
            nodes.add(new Node());
        }
        for (int i = 0; i < numNodes - 1; i++) {
            int u = sc.nextInt() - 1;
            int v = sc.nextInt() - 1;
            int w = sc.nextInt();
            nodes.get(u).val = u + 1;
            nodes.get(v).val = v + 1;
            nodes.get(u).a.add(new int[]{v, w});
            nodes.get(v).a.add(new int[]{u, w});
        }
        nodes.get(0).color = true;
        Set<Node> nodeSet = new HashSet<>();
        TraverseGraph(nodes.get(0), 0);
        for (Node node : nodes) {
            if (node.color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void TraverseGraph(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
            for (int[] pair : node.a) {
                Node adjNode = nodes.get(pair[0]);
                int dis = pair[1];
                if ((distance + dis) % 2 == 0) {
                    adjNode.color = node.color;
                } else {
                    adjNode.color = !node.color;
                }
                TraverseGraph(adjNode, distance + dis);
            }
        }
    }

    public static class Node {
        int val;
        boolean color;
        List<int[]> a = new ArrayList<>();
    }
}
```

Test input:
3
1 2 2
2 3 1

Expected output:
0
0
1 
