```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
            size[i] = 1;
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            int x = values[i] - 1;
            int y = root(par, x);
            if (y != i) {
                if (rank[y] > rank[x]) {
                    par[y] = x;
                    size[x] += size[y];
                } else {
                    par[x] = y;
                    size[y] += size[x];
                    if (rank[x] == rank[y]) {
                        rank[y]++;
                    }
                }
            }
            int l = 1, r = 1;
            if (x > 0 && values[x - 1] > values[x]) {
                l += size[root(par, x - 1)];
            }
            if (x + 1 < n && values[x + 1] > values[x]) {
                r += size[root(par, x + 1)];
            }
            c += l * r * values[x];
        }
        System.out.println(c);
    }

    public static int root(int[] par, int x) {
        if (par[x] == x) {
            return x;
        }
        return root(par, par[x]);
    }
}
```
