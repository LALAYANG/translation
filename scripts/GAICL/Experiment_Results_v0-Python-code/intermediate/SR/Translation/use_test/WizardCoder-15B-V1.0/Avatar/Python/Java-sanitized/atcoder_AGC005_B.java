import java.util.*;

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
            rank[i] = 1;
            size[i] = 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[values[i] - 1] = i;
        }
        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1, r = 1;
            if (k > 0 && values[k - 1] > values[k]) {
                l += size[find(par, k - 1)];
                unite(par, rank, size, k - 1, k);
            }
            if (k + 1 < n && values[k + 1] > values[k]) {
                r += size[find(par, k + 1)];
                unite(par, rank, size, k + 1, k);
            }
            c += l * r * values[k];
        }
        System.out.println(c);
    }

    public static int find(int[] par, int x) {
        if (par[x] == x) {
            return x;
        }
        return find(par, par[x]);
    }

    public static void unite(int[] par, int[] rank, int[] size, int x, int y) {
        int px = find(par, x);
        int py = find(par, y);
        if (px == py) {
            return;
        }
        if (rank[px] < rank[py]) {
            par[px] = py;
            size[py] += size[px];
        } else if (rank[px] > rank[py]) {
            par[py] = px;
            size[px] += size[py];
        } else {
            par[py] = px;
            size[px] += size[py];
            rank[px]++;
        }
    }
}