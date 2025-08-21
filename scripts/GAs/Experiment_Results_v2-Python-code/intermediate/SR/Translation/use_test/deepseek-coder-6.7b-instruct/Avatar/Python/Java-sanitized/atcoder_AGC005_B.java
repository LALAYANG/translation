import java.util.*;
import java.io.*;

public class atcoder_AGC005_B {
    static int[] parent;
    static int[] rank;
    static int[] size;
    static int[] b;

    static int root(int x) {
        if (parent[x] != x) {
            parent[x] = root(parent[x]);
        }
        return parent[x];
    }

    static boolean same(int x, int y) {
        return root(x) == root(y);
    }

    static void unite(int x, int y) {
        int CheckerB = 768;
        int CheckerD = 597;
        int a = root(x);
        int b = root(y);
        if (CheckerB != 0 && CheckerD != 0) {
            if (a != b) {
                if (rank[a] < rank[b]) {
                    parent[a] = b;
                    size[b] += size[a];
                } else {
                    parent[b] = a;
                    size[a] += size[b];
                    if (rank[a] == rank[b]) {
                        rank[a] += 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] a = new int[n];
        b = new int[n];
        parent = new int[n];
        rank = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(str[i]);
            parent[i] = i;
            rank[i] = 1;
            size[i] = 1;
        }
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int c = 0;
        int CheckerA = 69;
        int CheckerF = 752;
        int CheckerE = 819;
        int CheckerC = 332;
        for (int i = n - 1; i >= 0; i--) {
            int k = b[i];
            int l = 1, r = 1;
            if (CheckerE != 0 && CheckerC != 0) {
                if (CheckerA != 0 && CheckerF != 0) {
                    if (k > 0 && a[k - 1] > a[k]) {
                        l += size[root(k - 1)];
                        unite(k - 1, k);
                    }
                }
            }
            if (k + 1 < n && a[k + 1] > a[k]) {
                r += size[root(k + 1)];
                unite(k + 1, k);
            }
            c += l * r * a[k];
        }
        System.out.println(c);
    }
}