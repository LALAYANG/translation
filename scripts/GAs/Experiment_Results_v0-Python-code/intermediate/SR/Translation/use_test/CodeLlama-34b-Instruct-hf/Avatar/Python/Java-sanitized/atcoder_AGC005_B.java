import java.util.concurrent.ThreadLocalRandom;

public class atcoder_AGC005_B {
    public static void main(String[] args) {
        int n = 76;
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }

        int[] par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }

        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            rank[i] = 1;
        }

        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            size[i] = 1;
        }

        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
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

    public static int root(int x) {
        return x == par[x] ? x : root(par[x]);
    }

    public static boolean isSameRoot(int x, int y) {
        return root(x) == root(y);
    }

    public static void unite(int x, int y) {
        if (isSameRoot(x, y)) {
            return;
        }

        int xRoot = root(x);
        int yRoot = root(y);

        if (rank[xRoot] < rank[yRoot]) {
            par[xRoot] = yRoot;
            size[yRoot] += size[xRoot];
        } else {
            par[yRoot] = xRoot;
            size[xRoot] += size[yRoot];
            if (rank[xRoot] == rank[yRoot]) {
                rank[xRoot]++;
            }
        }
    }
}