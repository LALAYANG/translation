Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is correct and free from syntax errors.

```java
// Translated code snippet to Java

// Define the Node class
class Node {
    int val;
    boolean color;
    List<int[]> a;

    public Node() {
        val = -1;
        color = false;
        a = new ArrayList<>();
    }
}

// Initialize nodes
int n = Integer.parseInt(input());
Node[] nodes = new Node[n];
for (int i = 0; i < n; i++) {
    nodes[i] = new Node();
}

// Connect nodes
for (int i = 1; i < n; i++) {
    String[] inputLine = input().split(" ");
    int firstNodeIndex = Integer.parseInt(inputLine[0]);
    int v = Integer.parseInt(inputLine[1]);
    int w = Integer.parseInt(inputLine[2]);
    nodes[firstNodeIndex - 1].val = firstNodeIndex;
    nodes[v - 1].val = v;
    nodes[firstNodeIndex - 1].a.add(new int[]{v - 1, w});
    nodes[v - 1].a.add(new int[]{firstNodeIndex - 1, w});
}

// Set root node color
nodes[0].color = true;

// Traverse and color nodes
Set<Node> nodeSet = new HashSet<>();
for (Node node : nodes) {
    if (!nodeSet.contains(node)) {
        for (int[] pair : node.a) {
            Node adjNode = nodes[pair[0]];
            int dis = pair[1];
            if ((node.color && dis % 2 == 0) || (!node.color && dis % 2 != 0)) {
                adjNode.color = !node.color;
            }
            nodeSet.add(adjNode);
        }
    }
}

// Print node colors
for (Node node : nodes) {
    if (node.color) {
        System.out.println(1);
    } else {
        System.out.println(0);
    }
}
```

This Java code snippet translates the given Python code snippet to Java while maintaining the logic and functionality of the original problem.
