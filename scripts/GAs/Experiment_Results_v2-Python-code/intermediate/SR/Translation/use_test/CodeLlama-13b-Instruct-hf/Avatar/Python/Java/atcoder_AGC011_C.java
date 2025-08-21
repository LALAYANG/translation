
The provided Python code is a solution to a problem involving a graph with nodes and edges. The code uses a depth-first search algorithm to traverse the graph and count the number of connected components, the number of connected components with an odd number of nodes, and the number of connected components with an even number of nodes.

Here is the Java code that implements the same logic:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private int n;
    private int m;
    private int[] vis;
    private int ci;
    private int cb;
    private int cc;
    private List<List<Integer>> g;

    public Graph(int n, int m) {
        this.n = n;
        this.m = m;
        this.vis = new int[n + 1];
        this.ci = 0;
        this.cb = 0;
        this.cc = 0;
        this.g = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            this.g.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int neighbor) {
        this.g.get(u).add(neighbor);
        this.g.get(neighbor).add(u);
    }

    public int countConnectedComponents() {
        for (int i = 1; i <= n; i++) {
            if (vis[i] == 0) {
                if (depthFirstSearch(i)) {
                    cb++;
                } else {
                    cc++;
                }
            }
        }
        return ci * ci + 2 * ci * (n - ci) + cc * cc + 2 * cb * cc + 2 * cb * cb;
    }

    private boolean depthFirstSearch(int u) {
        Stack<Integer> stk = new Stack<>();
        stk.push(u);
        while (!stk.isEmpty()) {
            int v = stk.pop();
            if (vis[v] == 0) {
                vis[v] = 1;
                for (int neighbor : g.get(v)) {
                    if (vis[neighbor] == 0) {
                        stk.push(neighbor);
                    }
                }
            }
        }
        return true;
    }
}
```
This code defines a `Graph` class that represents a graph with nodes and edges. The class has the following fields:

* `n`: the number of nodes in the graph
* `m`: the number of edges in the graph
* `vis`: an array of integers that represents the visited status of each node
* `ci`: the number of connected components with an odd number of nodes
* `cb`: the number of connected components with an even number of nodes
* `cc`: the number of connected components with an odd number of nodes
* `g`: a list of lists that represents the graph, where each list represents a node and contains the indices of its neighbors

The class also has the following methods:

* `addEdge(int u, int neighbor)`: adds an edge between nodes `u` and `neighbor`
* `countConnectedComponents()`: counts the number of connected components in the graph and returns the result
* `depthFirstSearch(int u)`: performs a depth-first search of the graph starting from node `u` and returns `true` if the search is successful, `false` otherwise

The `countConnectedComponents()` method uses the `depthFirstSearch()` method to traverse the graph and count the number of connected components, the number of connected components with an odd number of nodes, and the number of connected components with an even number of nodes. The method returns the sum of the squares of `ci`, `cb`, and `cc`, which represents the number of connected components in the graph.

The `depthFirstSearch()` method uses a stack to store the nodes that have not been visited yet. It starts from the node `u` and performs a depth-first search of the graph. If a node `v` has not been visited yet, it is marked as visited and its neighbors are added to the stack. If a node `v` has already been visited, it is not added to the stack. The method returns `true` if the search is successful, `false` otherwise.

The provided Python code uses a `queue.LifoQueue()` to store the nodes that have not been visited yet. The Java code uses a `Stack` to store the nodes that have not been visited yet. The rest of the logic is similar in both cases.
