import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        int[] par = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        int[] rank = new int[n];
        int[] size = new int[n];
        int[] b = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            b[values[i] - 1] = i;
        }
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
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
        if (par[x] != x) {
            return par[x] = find(par, par[x]);
        }
        return x;
    }

    public static void unite(int[] par, int[] rank, int[] size, int x, int y) {
        x = find(par, x);
        y = find(par, y);
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