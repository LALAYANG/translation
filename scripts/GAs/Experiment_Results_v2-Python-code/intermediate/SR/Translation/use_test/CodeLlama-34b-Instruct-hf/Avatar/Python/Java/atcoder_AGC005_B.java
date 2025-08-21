```java
import java.util.Arrays;
import java.util.Scanner;

public class DisjointSet {
    private int[] parent;
    private int[] rank;
    private int[] size;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) {
            return;
        }
        if (rank[x] < rank[y]) {
            parent[x] = y;
            size[y] += size[x];
        } else {
            parent[y] = x;
            size[x] += size[y];
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }

    public int getSize(int x) {
        return size[find(x)];
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        DisjointSet ds = new DisjointSet(n);
        int c = 0;
        for (int i = 0; i < n; i++) {
            int l = ds.getSize(i - 1);
            int r = ds.getSize(i + 1);
            c += l * r * a[i];
            ds.unite(i - 1, i);
            ds.unite(i + 1, i);
        }
        System.out.println(c);
    }
}
```
Note: The above code uses the Disjoint Set data structure to keep track of the connected components in the graph. The `find` method returns the root of the component that the given element belongs to, and the `unite` method merges two components if they are not already connected. The `getSize` method returns the size of the component that the given element belongs to. The `c` variable is used to keep track of the total cost of the edges in the graph.
