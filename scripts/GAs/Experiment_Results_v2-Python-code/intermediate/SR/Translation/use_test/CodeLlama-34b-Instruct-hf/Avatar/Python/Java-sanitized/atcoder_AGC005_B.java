import java.util.Arrays;
import java.util.Scanner;

public class atcoder_AGC005_B {
    private int[] parent;
    private int[] rank;
    private int[] size;

    public DisjointSet(int n) {
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
    }

    public int find(int x) {
        if (x != parent[x]) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    public void unite(int x, int y) {
        x = find(x);
        y = find(y);
        if (x == y) {
            return;
        }
        if (rank[x] < rank[y]) {
            parent[x] = y;
            size[y] += size[x];
        } else {
            parent[y] = x;
            size[x] += size[y];
            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }

    public int getSize(int x) {
        return size[find(x)];
    }
}

public class atcoder_AGC005_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        DisjointSet ds = new DisjointSet(n);
        int c = 0;
        for (int i = 0; i < n; i++) {
            int l = ds.getSize(i - 1);
            int r = ds.getSize(i + 1);
            c += l * r * a[i];
            ds.unite(i - 1, i);
            ds.unite(i + 1, i);
        }
        System.out.println(c);
    }
}