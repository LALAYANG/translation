```java
import java.util.*;

public class Main {
    static int[] par;
    static int[] rank;
    static int[] size;
    static int[] b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }

        long c = 0;
        for (int k : b) {
            long l = 1, r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(k - 1)];
                uniteGroups(k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(k + 1)];
                uniteGroups(k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }

    static int root(int x) {
        return par[x] == x ? x : root(par[x]);
    }

    static boolean isSameGroup(int x, int y) {
        return root(x) == root(y);
    }

    static void uniteGroups(int x, int y) {
        x = root(x);
        y = root(y);
        if (x != y) {
            if (rank[x] < rank[y]) {
                par[x] = y;
                size[y] += size[x];
            } else {
                par[y] = x;
                size[x] += size[y];
                if (rank[x] == rank[y]) {
                    rank[x]++;
                }
            }
        }
    }
}
```

