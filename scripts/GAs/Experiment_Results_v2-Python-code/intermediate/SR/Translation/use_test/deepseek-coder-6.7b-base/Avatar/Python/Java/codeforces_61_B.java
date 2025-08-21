```
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            String[] arr = s.split(" ");
            int n = Integer.parseInt(arr[0]);
            int m = Integer.parseInt(arr[1]);
            int k = Integer.parseInt(arr[2]);
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s1[j]);
                }
            }
            int[][] b = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    b[i][j] = Integer.parseInt(s1[j]);
                }
            }
            int[][] c = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    c[i][j] = Integer.parseInt(s1[j]);
                }
            }
            int[][] d = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    d[i][j] = Integer.parseInt(s1[j]);
                }
            }
            int[][] e = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    e[i][j] = Integer.parseInt(s1[j]);
                }
            }
            int[][] f = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    f[i][j] = Integer.parseInt(s1[j]);
                }
            }
            int[][] g = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    g[i][j] = Integer.parseInt(s1[j]);
                }
            }
            int[][] h = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] s1 = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    h[i][j] = Integer.parseInt(s1[j]);
                }
            }
            int[][] i = new int[n][m];
            for (int j = 0; j < n; j++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    i[j][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] j = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    j[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] k1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    k1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] l = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    l[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] m1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    m1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] n1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    n1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] o = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    o[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] p = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    p[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] q = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    q[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] r = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    r[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] s = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    s[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] t = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    t[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] u = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    u[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] v = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    v[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] w = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    w[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] x = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    x[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] y = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    y[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] z = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    z[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] a1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    a1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] b1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    b1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] c1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    c1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] d1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    d1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] e1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    e1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] f1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    f1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] g1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    g1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] h1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    h1[j1][k] = Integer.parseInt(s1[k]);
                }
            }
            int[][] i1 = new int[n][m];
            for (int j1 = 0; j1 < n; j1++) {
                String[] s1 = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    i1[j1][
