import java.util.*;
import java.io.*;

public class atcoder_AGC005_B {
    static int root(int x, int[] par) {
        return x == par[x] ? x : (par[x] = root(par[x], par));
    }

    static boolean same(int x, int y, int[] par) {
        return root(x, par) == root(y, par);
    }

    static void unite(int x, int y, int[] par, int[] rank, int[] size) {
        x = root(x, par);
        y = root(y, par);
        if (x == y) return;
        if (rank[x] < rank[y]) {
            par[x] = y;
            size[y] += size[x];
        } else {
            par[y] = x;
            size[x] += size[y];
            if (rank[x] == rank[y]) rank[x]++;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int[] a = new int[n];
        s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[a[i] - 1] = i;
        long c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
            if (k > 0 && a[k - 1] > a[k]) {
                l += size[root(k - 1, par)];
                unite(k - 1, k, par, rank, size);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(k + 1, par)];
                unite(k + 1, k, par, rank, size);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }
}