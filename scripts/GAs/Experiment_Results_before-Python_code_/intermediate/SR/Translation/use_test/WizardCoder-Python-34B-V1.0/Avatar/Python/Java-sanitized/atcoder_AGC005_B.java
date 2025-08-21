import java.util.Scanner;

public class atcoder_AGC005_B {
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
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            int l = 1;
            int r = 1;
            if (i > 0 && a[i - 1] > a[i]) {
                l += size[root(b[i - 1])];
                unite(b[i - 1], b[i]);
            }
            if (i + 1 < n && a[i + 1] > a[i]) {
                r += size[root(b[i + 1]);
                unite(b[i + 1], b[i]);
            }
            c += l * r * a[i];
        }
        System.out.println(c);
    }

    public static int root(int x) {
        return x == par[x] ? x : root(par[x]);
    }

    public static boolean same(int x, int y) {
        return root(x) == root(y);
    }

    public static void unite(int x, int y) {
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