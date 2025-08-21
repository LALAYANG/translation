import java.util.*;
import java.io.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        Set<Integer> q = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                q.add(li[i][j]);
            }
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            for (int[] s : combinations(q, i)) {
                for (int j = 0; j < m; j++) {
                    Set<Integer> u = new HashSet<>();
                    for (int k = 0; k < n; k++) {
                        u.add(li[j][k]);
                    }
                    if (s.length % 2 != p[j]) {
                        break;
                    }
                }
                ans += (int) Math.pow(2, v.size());
            }
        }
        System.out.println(ans);
    }

    public static int[][] combinations(Set<Integer> q, int i) {
        int[][] ans = new int[(int) Math.pow(2, q.size())][];
        int[] a = new int[q.size()];
        int j = 0;
        for (int x : q) {
            a[j++] = x;
        }
        for (int j = 0; j < ans.length; j++) {
            ans[j] = new int[i];
            for (int k = 0; k < i; k++) {
                ans[j][k] = a[k];
            }
        }
        return ans;
    }
}