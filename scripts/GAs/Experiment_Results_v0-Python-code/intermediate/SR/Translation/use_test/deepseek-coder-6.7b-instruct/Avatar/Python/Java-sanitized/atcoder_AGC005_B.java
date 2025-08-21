import java.util.*;

class Main {
    static int[] par, rank, size;
    static int n;
    static List<Integer> values = new ArrayList<>();

    static int root(int x) {
        return (x == par[x]) ? x : (par[x] = root(par[x]));
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
                if (rank[x] == rank[y]) rank[x]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        Arrays.fill(size, 1);
        for (int i = 0; i < n; i++) par[i] = i;
        for (int i = 0; i < n; i++) values.add(in.nextInt());

        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1, r = 1;
            if (k > 0 && values.get(k - 1) > values.get(k)) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && values.get(k + 1) > values.get(k)) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += l * r * values.get(k);
        }
        System.out.println(c);
    }
}