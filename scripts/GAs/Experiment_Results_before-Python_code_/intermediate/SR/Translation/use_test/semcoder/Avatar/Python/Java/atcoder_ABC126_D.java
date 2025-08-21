Thought process:
1. Define a Node class with attributes for value, color, and adjacency list.
2. Read input for the number of nodes and create nodes based on the input.
3. Connect the nodes with edges and assign values to them.
4. Set the root node's color to True and start traversing the graph.
5. Implement the traverse function to color the nodes based on the distance from the root.
6. Print the color of each node (1 for True, 0 for False).

```java
import java.util.*;

class Node {
    int val;
    boolean color;
    List<int[]> a;

    Node() {
        val = 0;
        color = false;
        a = new ArrayList<>();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            Node node1 = nodes[u - 1];
            Node node2 = nodes[v - 1];
            node1.val = u;
            node2.val = v;
            node1.a.add(new int[]{v - 1, w});
            node2.a.add(new int[]{u - 1, w});
        }
        Node root = nodes[0];
        root.color = true;
        Set<Integer> nodeSet = new HashSet<>();

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        while (!stack.isEmpty()) {
            int nodeIndex = stack.pop();
            if (nodeSet.contains(nodeIndex)) {
                continue;
            }
            nodeSet.add(nodeIndex);
            Node node = nodes[nodeIndex];
            for (int[] pair : node.a) {
                int adjNodeIndex = pair[0];
                int dis = pair[1];
                Node adjNode = nodes[adjNodeIndex];
                if ((node.color && dis % 2 == 0) || (!node.color && dis % 2 != 0)) {
                    adjNode.color = true;
                } else {
                    adjNode.color = false;
                }
                stack.push(adjNodeIndex);
            }
        }

        for (int i = 0; i < n; i++) {
            if (nodes[i].color) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
```
