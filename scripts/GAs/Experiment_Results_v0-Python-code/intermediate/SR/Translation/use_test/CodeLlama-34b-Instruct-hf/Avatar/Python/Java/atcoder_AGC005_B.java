```java
import java.util.concurrent.ThreadLocalRandom;

public class Solution {
    public static void main(String[] args) {
        int n = 76;
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }

        int[] par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }

        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            rank[i] = 1;
        }

        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = 1;
        }

        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
            if (k > 0 && values[k - 1] > values[k]) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && values[k + 1] > values[k]) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += l * r * values[k];
        }

        System.out.println(c);
    }

    public static int root(int x) {
        return x == par[x] ? x : root(par[x]);
    }

    public static boolean isSameRoot(int x, int y) {
        return root(x) == root(y);
    }

    public static void unite(int x, int y) {
        if (isSameRoot(x, y)) {
            return;
        }

        int xRoot = root(x);
        int yRoot = root(y);

        if (rank[xRoot] < rank[yRoot]) {
            par[xRoot] = yRoot;
            size[yRoot] += size[xRoot];
        } else {
            par[yRoot] = xRoot;
            size[xRoot] += size[yRoot];
            if (rank[xRoot] == rank[yRoot]) {
                rank[xRoot]++;
            }
        }
    }
}
```
Explanation:

The code is a Java implementation of the union-find algorithm, which is used to solve the problem of finding the number of connected components in a graph. The algorithm works by maintaining a set of trees, where each tree represents a connected component in the graph. The `root` function returns the root node of a tree, and the `isSameRoot` function checks if two nodes are in the same tree. The `unite` function merges two trees by attaching the root of one tree to the root of the other tree.

The `main` function first initializes the `values` array with random integers between 1 and 100. It then initializes the `par`, `rank`, and `size` arrays, which are used to store the parent, rank, and size of each node in the graph.

The `c` variable is used to store the final result, which is the number of connected components in the graph. The `for` loop iterates over the nodes in the graph, and for each node, it checks if the node is connected to its left and right neighbors. If the node is connected to both neighbors, it merges the trees by calling the `unite` function. The `c` variable is incremented by the product of the sizes of the left and right trees, and the size of the current node.

Finally, the `main` function prints the final result, which is the number of connected components in the graph.
