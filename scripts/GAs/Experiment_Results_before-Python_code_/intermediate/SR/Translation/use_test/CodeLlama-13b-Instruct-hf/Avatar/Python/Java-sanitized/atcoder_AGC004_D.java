import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class atcoder_AGC004_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Set<Integer>[] links = new HashSet[n];
        for (int i = 0; i < n; i++) {
            links[i] = new HashSet<>();
        }
        for (int i = 0; i < n; i++) {
            int u = a[i] - 1;
            links[u].add(i);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int heightFromLeaf = 0;
            int cutCount = 0;
            for (int u : links[i]) {
                if (u == 0) {
                    continue;
                }
                int hgt = heightFromLeaf(links, n, k, u, i);
                heightFromLeaf = Math.max(heightFromLeaf, hgt);
                cutCount += cutCount(links, n, k, u, i);
            }
            heightFromLeaf += 1;
            if (i != 0 && heightFromLeaf == k) {
                heightFromLeaf = 0;
                cutCount += 1;
            }
            ans += heightFromLeaf;
        }
        if (a[0] != 1) {
            ans += 1;
        }
        System.out.println(ans);
    }

    private static int heightFromLeaf(Set<Integer>[] links, int n, int k, int u, int p) {
        int heightFromLeaf = 0;
        for (int v : links[u]) {
            if (v == 0) {
                continue;
            }
            int hgt = heightFromLeaf(links, n, k, v, u);
            heightFromLeaf = Math.max(heightFromLeaf, hgt);
        }
        heightFromLeaf += 1;
        return heightFromLeaf;
    }

    private static int cutCount(Set<Integer>[] links, int n, int k, int u, int p) {
        int cutCount = 0;
        for (int v : links[u]) {
            if (v == 0) {
                continue;
            }
            int hgt = heightFromLeaf(links, n, k, v, u);
            cutCount += cutCount(links, n, k, v, u);
        }
        return cutCount;
    }
}