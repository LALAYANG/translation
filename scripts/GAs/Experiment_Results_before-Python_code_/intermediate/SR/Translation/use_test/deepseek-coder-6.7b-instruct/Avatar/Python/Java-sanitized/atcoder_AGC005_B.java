import java.util.*;

public class atcoder_AGC005_B {
    static int[] par, rank, size;
    static int n;
    static ArrayList<Integer> a;

    static int root(int x) {
        if (par[x] == x) return x;
        else return par[x] = root(par[x]);
    }

    static boolean same(int x, int y) {
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
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(sc.nextInt() - 1);
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1, r = 1;
            if (k > 0 && a.get(k - 1) > a.get(k)) {
                l += size[root(k - 1)];
                unite(k - 1, k);
            }
            if (k + 1 < n && a.get(k + 1) > a.get(k)) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += l * r * a.get(k);
        }
        System.out.println(c);
    }
}