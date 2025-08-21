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
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
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
                l += size[find(par, k - 1)];
                union(par, k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[find(par, k + 1)];
                union(par, k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }

    public static int find(int[] par, int x) {
        if (par[x] == x) {
            return x;
        }
        return find(par, par[x]);
    }

    public static void union(int[] par, int x, int y) {
        int px = find(par, x);
        int py = find(par, y);
        if (rank[px] < rank[py]) {
            par[px] = py;
            size[py] += size[px];
        } else if (rank[px] > rank[py]) {
            par[py] = px;
            size[px] += size[py];
        } else {
            par[py] = px;
            size[px] += size[py];
            rank[px]++;
        }
    }
}
```
