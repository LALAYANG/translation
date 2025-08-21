import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC004_D {
    static int n, k;
    static List<Integer>[] links;

    static int dfs(int v, int p) {
        int heightFromLeaf = 0;
        int cutCount = 0;
        for (int u : links[v]) {
            if (u == p) continue;
            int[] result = dfs(u, v);
            heightFromLeaf = Math.max(heightFromLeaf, result[0]);
            cutCount += result[1];
        }
        heightFromLeaf++;
        if (p != -1 && heightFromLeaf == k) {
            heightFromLeaf = 0;
            cutCount++;
        }
        return new int[]{heightFromLeaf, cutCount};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        links = new List[n];
        for (int i = 0; i < n; i++) {
            links[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            int a = sc.nextInt() - 1;
            links[a].add(i);
        }
        int[] result = dfs(0, -1);
        if (links[0].get(0) != 1) {
            result[1]++;
        }
        System.out.println(result[1]);
    }
}