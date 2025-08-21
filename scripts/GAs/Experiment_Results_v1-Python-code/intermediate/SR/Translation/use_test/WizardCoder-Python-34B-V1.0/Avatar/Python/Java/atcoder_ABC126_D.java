```java
import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nodes.add(new Node());
        }
        for (int i = 0; i < n - 1; i++) {
            int firstNodeIndex = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            nodes.get(firstNodeIndex - 1).val = firstNodeIndex;
            nodes.get(v - 1).val = v;
            nodes.get(firstNodeIndex - 1).neighbors.add(new Pair(nodes.get(v - 1), w));
            nodes.get(v - 1).neighbors.add(new Pair(nodes.get(firstNodeIndex - 1), w));
        }
        nodes.get(0).color = true;
        Set<Node> nodeSet = new HashSet<>();
        traverse(nodes.get(0), 0);
        for (Node node : nodes) {
            System.out.println(node.color ? 1 : 0);
        }
    }

    public static void traverse(Node node, int distance) {
        if (nodeSet.contains(node)) {
            return;
        } else {
            nodeSet.add(node);
            for (Pair pair : node.neighbors) {
                Node adjNode = pair.node;
                int dis = pair.distance;
                if ((distance + dis) % 2 == 0) {
                    adjNode.color = node.color;
                } else {
                    adjNode.color = !node.color;
                }
                traverse(adjNode, distance + dis);
            }
        }
    }

    static class Node {
        int val;
        boolean color;
        List<Pair> neighbors = new ArrayList<>();
    }

    static class Pair {
        Node node;
        int distance;

        public Pair(Node node, int distance) {
            this.node = node;
            this.distance = distance;
        }
    }
}
```

Sample test case:
```
3
1 2 2
2 3 1
```

Output:
```
0
0
1
``` 
