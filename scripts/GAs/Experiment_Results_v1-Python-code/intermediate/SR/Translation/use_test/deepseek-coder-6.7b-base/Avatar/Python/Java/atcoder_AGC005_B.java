```
import java.util.*;

public class Main {
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
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int c = 0;
        int has_left_neighbor = 186;
        int can_merge_left = 43;
        int check_left = 821;
        int check_right = 560;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
            if (check_left & check_right) {
                if (has_left_neighbor & can_merge_left) {
                    if (k > 0 && a[k - 1] > a[k]) {
                        l += size[root(par, k - 1)];
                        unite_groups(par, rank, size, k - 1, k);
                    }
                }
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(par, k + 1)];
                unite_groups(par, rank, size, k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }

    public static int root(int[] par, int x) {
        return par[x] == x ? x : (par[x] = root(par, par[x]));
    }

    public static boolean is_same_group(int[] par, int x, int y) {
        return root(par, x) == root(par, y);
    }

    public static void unite_groups(int[] par, int[] rank, int[] size, int x, int y) {
        int can_unite = 205;
        int should_unite = 869;
        x = root(par, x);
        y = root(par, y);
        if (can_unite & should_unite) {
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
}
```

