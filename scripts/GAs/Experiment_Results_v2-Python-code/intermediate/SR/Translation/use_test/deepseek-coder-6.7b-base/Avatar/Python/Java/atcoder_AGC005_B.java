```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] parent = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            int l = 1;
            int r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(parent, k - 1)];
                unite(parent, rank, size, k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(parent, k + 1)];
                unite(parent, rank, size, k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }

    public static int root(int[] parent, int x) {
        if (parent[x] == x) {
            return x;
        }
        return root(parent, parent[x]);
    }

    public static boolean same(int[] parent, int x, int y) {
        return root(parent, x) == root(parent, y);
    }

    public static void unite(int[] parent, int[] rank, int[] size, int x, int y) {
        int rootX = root(parent, x);
        int rootY = root(parent, y);
        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
                size[rootY] += size[rootX];
            } else {
                parent[rootY] = rootX;
                size[rootX] += size[rootY];
                if (rank[rootX] == rank[rootY]) {
                    rank[rootX]++;
                }
            }
        }
    }
}
```

