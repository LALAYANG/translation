import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC005_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] par = new int[n];
        int[] rank = new int[n];
        int[] size = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        int c = 0;
        for (int k = n - 1; k >= 0; k--) {
            int l = 1;
            int r = 1;
            if (k > 0 && b[k - 1] > b[k]) {
                l += size[findRoot(k - 1)];
                uniteGroups(k - 1, k);
            }
            if (k + 1 < n && b[k + 1] > b[k]) {
                r += size[findRoot(k + 1)];
                uniteGroups(k + 1, k);
            }
            c += l * r * b[k];
        }
        System.out.println(c);
    }

    private static int findRoot(int x) {
        if (par[x] == x) {
            return x;
        } else {
            return findRoot(par[x]);
        }
    }

    private static void uniteGroups(int x, int y) {
        int rootX = findRoot(x);
        int rootY = findRoot(y);
        if (rootX != rootY) {
            if (rank[rootX] < rank[rootY]) {
                par[rootX] = rootY;
                size[rootY] += size[rootX];
            } else {
                par[rootY] = rootX;
                size[rootX] += size[rootY];
                if (rank[rootX] == rank[rootY]) {
                    rank[rootX] += 1;
                }
            }
        }
    }
}