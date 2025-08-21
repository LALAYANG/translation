```java
import java.util.Scanner;

public class UnionFind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        int[] rank = new int[n];
        Arrays.fill(rank, 1);
        int[] size = new int[n];
        Arrays.fill(size, 1);
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
            if ((check_left & check_right) != 0) {
                if ((has_left_neighbor & can_merge_left) != 0 && k > 0 && a[k - 1] > a[k]) {
                    l += size[find(par, k - 1)];
                    unite(par, rank, size, k - 1, k);
                }
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[find(par, k + 1)];
                unite(par, rank, size, k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }

    public static int find(int[] par, int x) {
        if (par[x] == x) {
            return x;
        }
        return par[x] = find(par, par[x]);
    }

    public static void unite(int[] par, int[] rank, int[] size, int x, int y) {
        int rootX = find(par, x);
        int rootY = find(par, y);
        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY]) {
                par[x] = rootY;
                size[rootY] += size[x];
            } else {
                par[y] = rootX;
                size[rootX] += size[y];
                if (rank[rootX] == rank[rootY]) {
                    rank[rootX]++;
                }
            }
        }
    }
}
``` 
