import java.util.Scanner;

public class atcoder_AGC005_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = 1;
            rank[i] = 1;
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
                l += size[root(parent, k - 1)];
                unite(parent, rank, size, k - 1, k);
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(parent, k + 1)];
                unite(parent, rank, size, k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }

    public static int root(int[] parent, int x) {
        return parent[x] == x ? x : root(parent, parent[x]);
    }

    public static boolean same(int[] parent, int x, int y) {
        return root(parent, x) == root(parent, y);
    }

    public static void unite(int[] parent, int[] rank, int[] size, int x, int y) {
        int xRoot = root(parent, x);
        int yRoot = root(parent, y);
        if (xRoot != yRoot) {
            if (rank[xRoot] < rank[yRoot]) {
                parent[xRoot] = yRoot;
                size[yRoot] += size[xRoot];
            } else {
                parent[yRoot] = xRoot;
                size[xRoot] += size[yRoot];
                if (rank[xRoot] == rank[yRoot]) {
                    rank[xRoot]++;
                }
            }
        }
    }
}