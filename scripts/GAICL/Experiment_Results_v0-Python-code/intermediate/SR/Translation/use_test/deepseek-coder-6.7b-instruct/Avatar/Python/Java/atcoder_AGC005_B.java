Here is the Java equivalent of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] par;
    static int[] rank;
    static int[] size;
    static int[] b;

    static int root(int x) {
        return par[x] == x ? x : (par[x] = root(par[x]));
    }

    static boolean isSameRoot(int x, int y) {
        return root(x) == root(y);
    }

    static void unite(int x, int y) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        b = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            b[values[i] - 1] = i;
        }
        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1, r = 1;
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
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and `n` integers from the standard input, and then it calculates the product of the input integers. The result is printed to the standard output.

