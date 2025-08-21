import java.util.*;
import java.util.concurrent.*;

public class atcoder_AGC005_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            size[i] = 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[values[i] - 1] = i;
        }
        int c = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            int l = 1;
            int r = 1;
            if (k > 0 && values[k - 1] > values[k]) {
                l += size[root(par, k - 1)];
                unite(par, rank, size, k - 1, k);
            }
            if (k + 1 < n && values[k + 1] > values[k]) {
                r += size[root(par, k + 1)];
                unite(par, rank, size, k + 1, k);
            }
            c += l * r * values[k];
        }
        System.out.println(c);
    }

    public static int root(int[] par, int x) {
        return par[x] == x ? x : (par[x] = root(par, par[x]));
    }

    public static boolean isSameRoot(int[] par, int x, int y) {
        return root(par, x) == root(par, y);
    }

    public static void unite(int[] par, int[] rank, int[] size, int x, int y) {
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

    public static int calculateProduct(int variable_1_27, int n) {
        return variable_1_27 * n;
    }
}