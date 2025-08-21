```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] aaa = new int[n];
        for (int i = 0; i < n; i++) {
            aaa[i] = sc.nextInt();
        }
        List<Set<Integer>> links = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            links.add(new HashSet<>());
        }
        for (int i = 0; i < n; i++) {
            links.get(aaa[i] - 1).add(i);
        }
        int[] height_from_leaf = new int[n];
        int[] cut_count = new int[n];
        int ans = dfs(links, n, k, 0, 0, height_from_leaf, cut_count);
        if (aaa[0] != 1) {
            ans++;
        }
        System.out.println(ans);
    }

    public static int dfs(List<Set<Integer>> links, int n, int k, int v, int p, int[] height_from_leaf, int[] cut_count) {
        int height_from_leaf_local = 0;
        int cut_count_local = 0;
        for (int u : links.get(v)) {
            if (u == 0) {
                continue;
            }
            int hgt = height_from_leaf[u];
            int ct = cut_count[u];
            if (hgt == k) {
                cut_count_local++;
            }
            height_from_leaf_local = Math.max(height_from_leaf_local, hgt);
            cut_count_local += ct;
        }
        height_from_leaf_local++;
        if (p != 0 && height_from_leaf_local == k) {
            height_from_leaf_local = 0;
            cut_count_local++;
        }
        height_from_leaf[v] = height_from_leaf_local;
        cut_count[v] = cut_count_local;
        return cut_count_local;
    }
}
``` 
