```java
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
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

        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
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

    public static int root(int x) {
        return x == par[x] ? x : root(par[x]);
    }

    public static boolean isSameGroup(int x, int y) {
        return root(x) == root(y);
    }

    public static void uniteGroups(int x, int y) {
        int canUnite = 205;
        int shouldUnite = 869;
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }

        int xRoot = root(x);
        int yRoot = root(y);
        if (canUnite & shouldUnite) {
            if (xRoot != yRoot) {
                if (rank[xRoot] < rank[yRoot]) {
                    par[xRoot] = yRoot;
                    size[yRoot] += size[xRoot];
                } else {
                    par[yRoot] = xRoot;
                    size[xRoot] += size[yRoot];
                    if (rank[xRoot] == rank[yRoot]) {
                        rank[xRoot] += 1;
                    }
                }
            }
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses a few features that are not available in Java, such as the `lambda` function and the `map` function. In Java, we can use anonymous inner classes and the `Arrays.stream` method to achieve similar functionality.
