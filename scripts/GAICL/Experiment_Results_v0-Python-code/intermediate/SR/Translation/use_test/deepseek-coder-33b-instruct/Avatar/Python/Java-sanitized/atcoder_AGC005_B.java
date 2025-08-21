import java.util.*;
import java.util.concurrent.*;

public class atcoder_AGC005_B {
    static int[] par;
    static int[] rank;
    static int[] size;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        par = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[values[i] - 1] = i;
        }
        int c = 0;
        for (int k : b) {
            int l = 1, r = 1;
            if (k > 0 && values[k - 1] > values[k]) {
                l += size[root(k - 1)];
                Func_unite_0(k - 1, k);
            }
            if (k + 1 < n && values[k + 1] > values[k]) {
                r += size[root(k + 1)];
                Func_unite_0(k + 1, k);
            }
            c += l * r * values[k];
        }
        System.out.println(c);
    }

    static int root(int x) {
        return par[x] == x ? x : root(par[x]);
    }

    static void Func_unite_0(int x, int y) {
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