```java
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
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[find(parent, k - 1)];
                union(parent, rank, size, k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[find(parent, k + 1)];
                union(parent, rank, size, k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }

    public static int find(int[] parent, int i) {
        if (parent[i] == i) {
            return i;
        }
        return find(parent, parent[i]);
    }

    public static void union(int[] parent, int[] rank, int[] size, int i, int j) {
        int x = find(parent, i);
        int y = find(parent, j);
        if (x != y) {
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
    }
}
```
