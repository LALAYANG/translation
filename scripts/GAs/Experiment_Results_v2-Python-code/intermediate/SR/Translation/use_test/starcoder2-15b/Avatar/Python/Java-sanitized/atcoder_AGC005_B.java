import java.util.*;

public class atcoder_AGC005_B {
    static int[] parent;
    static int[] rank;
    static int[] size;
    static int[] a;
    static int[] b;
    static int n;
    static int c;

    static int root(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = root(parent[x]);
    }

    static boolean same(int x, int y) {
        return root(x) == root(y);
    }

    static void unite(int x, int y) {
        x = root(x);
        y = root(y);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        b = new int[n];
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            parent[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            int l = 1;
            int r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }
}