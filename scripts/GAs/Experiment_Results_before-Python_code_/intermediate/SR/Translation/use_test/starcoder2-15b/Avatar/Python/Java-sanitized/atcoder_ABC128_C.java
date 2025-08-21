import java.util.*;
import java.io.*;
import java.math.*;

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
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n + 1; i++) {
            for (int s = 0; s < n; s++) {
                for (int u = 0; u < m; u++) {
                    if (p[u] != (q[s] & li[u][s]) % 2) {
                        break;
                    }
                }
                ans += 2 ^ (v.length);
            }
        }
        System.out.println(ans);
    }
}