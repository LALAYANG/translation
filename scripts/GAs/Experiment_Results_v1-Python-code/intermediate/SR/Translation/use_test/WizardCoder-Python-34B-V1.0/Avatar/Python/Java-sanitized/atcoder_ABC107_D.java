import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.Comparator;
import java.util.Iterator;

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n * (n + 1)) / 4;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] _a = new int[n];
        Map<Integer, Integer> d = new HashMap<>();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        int[] _a = set.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < n; i++) {
            d.put(a[i], i);
        }
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = d.get(_a[i]);
        }
        int[] b = new int[n + 1];
        for (int i = 0; i < n; i++) {
            b[i + 1] = a[i] + 1;
        }
        for (int i = 1; i <= n; i++) {
            b[i] += b[i - 1];
        }
        int[] t = {n, 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (checkThreshold(b, m, mid)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        System.out.println(_a[t[1]]);
    }

    public static boolean checkThreshold(int[] b, int m, int X) {
        int[] bit = new int[m + 2];
        int ans = 0;
        for (int x : b) {
            int idx = x + 1;
            while (idx <= m) {
                ans += bit[idx];
                idx += (idx & -idx);
            }
            int y = x - X + 1;
            if (y > 0) {
                ans -= bit[y];
            }
            idx = x;
            while (idx <= m) {
                bit[idx]++;
                idx += (idx & -idx);
            }
        }
        return ans >= m;
    }
}