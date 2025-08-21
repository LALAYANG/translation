// Translated code snippet

// Define the Power function
public static int Power(int a, int b) {
    if (b == 0) {
        return 1;
    } else {
        return a * Power(a, b - 1);
    }
}

// Set the recursion limit
Power(10, 5);

// Define the Node class
class Node {
    int val;
    boolean color;
    ArrayList<int[]> a;
}

// Create nodes and construct the graph
int numNodes = Integer.parseInt(input());
Node[] nodes = new Node[numNodes];
for (int i = 0; i < numNodes; i++) {
    nodes[i] = new Node();
}

// Traverse the graph and color nodes
Node root = nodes[0];
root.color = true;
HashSet<Node> nodeSet = new HashSet<>();

// Print the colors of nodes
for (int i = 0; i < numNodes; i++) {
    if (nodes[i].color) {
        System.out.println(1);
    } else {
        System.out.println(0);
    }
}