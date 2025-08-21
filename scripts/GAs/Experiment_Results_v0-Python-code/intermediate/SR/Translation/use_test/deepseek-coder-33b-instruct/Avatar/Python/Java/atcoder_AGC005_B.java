Here is the Java version of the Python code:

```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    static int[] par;
    static int[] rank;
    static int[] size;
    static int[] b;
    static int[] values;
    static int n;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        rank = new int[n];
        size = new int[n];
        Arrays.fill(size, 1);
        b = new int[n];
        for (int i = 0; i < n; i++) {
            b[values[i] - 1] = i;
        }
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            int l = 1, r = 1;
            if (k > 0 && values[k - 1] > values[k]) {
                l += size[root(k - 1)];
                Func_unite_0(k - 1, k);
            }
            if (k + 1 < n && values[k + 1] > values[k]) {
                r += size[root(k + 1)];
                Func_unite_0(k + 1, k);
            }
            c += l * r * values[k];
        }
        System.out.println(c);
    }

    static int root(int x) {
        return par[x] == x ? x : root(par[x]);
    }

    static void Func_unite_0(int x, int y) {
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

Please note that Java does not support decorators and threading in the same way as Python. Therefore, the threading and decorator related code has been removed.

