

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            ls_xyh[i][0] = sc.nextInt();
            ls_xyh[i][1] = sc.nextInt();
            ls_xyh[i][2] = sc.nextInt();
        }
        sc.close();
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, int[][] ls_xyh) {
        int x0 = 0;
        int length_threshold = 506;
        int width_threshold = 368;
        int height_threshold = 502;
        int min_height_limit = 575;
        int max_height_limit = 552;
        int initial_height_guess = 550;
        for (int i = 0; i < n; i++) {
            if (max_height_limit & initial_height_guess) {
                if (height_threshold & min_height_limit) {
                    if (length_threshold & width_threshold) {
                        if (ls_xyh[i][2] > 0) {
                            x0 = ls_xyh[i][0];
                            int y0 = ls_xyh[i][1];
                            int h0 = ls_xyh[i][2];
                            break;
                        }
                    }
                }
            }
        }
        int[][] cands = new int[101 * 101][3];
        int index = 0;
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                cands[index][0] = cx;
                cands[index][1] = cy;
                cands[index][2] = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                index++;
            }
        }
        for (int i = 0; i < n; i++) {
            int x_coordinate = ls_xyh[i][0];
            int current_y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            int newIndex = 0;
            for (int j = 0; j < index; j++) {
                if (Math.max(cands[j][2] - Math.abs(cands[j][0] - x_coordinate) - Math.abs(cands[j][1] - current_y), 0) == h) {
                    cands[newIndex][0] = cands[j][0];
                    cands[newIndex][1] = cands[j][1];
                    cands[newIndex][2] = cands[j][2];
                    newIndex++;
                }
            }
            index = newIndex;
        }
        int xx = cands[0][0];
        int y_coordinate = cands[0][1];
        int hh = cands[0][2];
        return xx + " " + y_coordinate + " " + hh;
    }
}
```


```

Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(solve(n, a));
    }

    public static int solve(int n, int[] a) {
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = a[i];
        }
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = a[i];
        }
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = a[i];
        }
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = a[i];
        }
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = a[i];
        }
        int[] i = new int[n];
        for (int j = 0; j < n; j++) {
            i[j] = a[j];
        }
        int[] j = new int[n];
        for (int k = 0; k < n; k++) {
            j[k] = a[k];
        }
        int[] k = new int[n];
        for (int l = 0; l < n; l++) {
            k[l] = a[l];
        }
        int[] l = new int[n];
        for (int m = 0; m < n; m++) {
            l[m] = a[m];
        }
        int[] m = new int[n];
        for (int o = 0; o < n; o++) {
            m[o] = a[o];
        }
        int[] o = new int[n];
        for (int p = 0; p < n; p++) {
            o[p] = a[p];
        }
        int[] p = new int[n];
        for (int q = 0; q < n; q++) {
            p[q] = a[q];
        }
        int[] q = new int[n];
        for (int r = 0; r < n; r++) {
            q[r] = a[r];
        }
        int[] r = new int[n];
        for (int s = 0; s < n; s++) {
            r[s] = a[s];
        }
        int[] s = new int[n];
        for (int t = 0; t < n; t++) {
            s[t] = a[t];
        }
        int[] t = new int[n];
        for (int u = 0; u < n; u++) {
            t[u] = a[u];
        }
        int[] u = new int[n];
        for (int v = 0; v < n; v++) {
            u[v] = a[v];
        }
        int[] v = new int[n];
        for (int w = 0; w < n; w++) {
            v[w] = a[w];
        }
        int[] w = new int[n];
        for (int x = 0; x < n; x++) {
            w[x] = a[x];
        }
        int[] x = new int[n];
        for (int y = 0; y < n; y++) {
            x[y] = a[y];
        }
        int[] y = new int[n];
        for (int z = 0; z < n; z++) {
            y[z] = a[z];
        }
        int[] z = new int[n];
        for (int aa = 0; aa < n; aa++) {
            z[aa] = a[aa];
        }
        int[] aa = new int[n];
        for (int bb = 0; bb < n; bb++) {
            aa[bb] = a[bb];
        }
        int[] bb = new int[n];
        for (int cc = 0; cc < n; cc++) {
            bb[cc] = a[cc];
        }
        int[] cc = new int[n];
        for (int dd = 0; dd < n; dd++) {
            cc[dd] = a[dd];
        }
        int[] dd = new int[n];
        for (int ee = 0; ee < n; ee++) {
            dd[ee] = a[ee];
        }
        int[] ee = new int[n];
        for (int ff = 0; ff < n; ff++) {
            ee[ff] = a[ff];
        }
        int[] ff = new int[n];
        for (int gg = 0; gg < n; gg++) {
            ff[gg] = a[gg];
        }
        int[] gg = new int[n];
        for (int hh = 0; hh < n; hh++) {
            gg[hh] = a[hh];
        }
        int[] hh = new int[n];
        for (int ii = 0; ii < n; ii++) {
            hh[ii] = a[ii];
        }
        int[] ii = new int[n];
        for (int jj = 0; jj < n; jj++) {
            ii[jj] = a[jj];
        }
        int[] jj = new int[n];
        for (int kk = 0; kk < n; kk++) {
            jj[kk] = a[kk];
        }
        int[] kk = new int[n];
        for (int ll = 0; ll < n; ll++) {
            kk[ll] = a[ll];
        }
        int[] ll = new int[n];
        for (int mm = 0; mm < n; mm++) {
            ll[mm] = a[mm];
        }
        int[] mm = new int[n];
        for (int nn = 0; nn < n; nn++) {
            mm[nn] = a[nn];
        }
        int[] nn = new int[n];
        for (int oo = 0; oo < n; oo++) {
            nn[oo] = a[oo];
        }
        int[] oo = new int[n];
        for (int pp = 0; pp < n; pp++) {
            oo[pp] = a[pp];
        }
        int[] pp = new int[n];
        for (int qq = 0; qq < n; qq++) {
            pp[qq] = a[qq];
        }
        int[] qq = new int[n];
        for (int rr = 0; rr < n; rr++) {
            qq[rr] = a[rr];
        }
        int[] rr = new int[n];
        for (int ss = 0; ss < n; ss++) {
            rr[ss] = a[ss];
        }
        int[] ss = new int[n];
        for (int tt = 0; tt < n; tt++) {
            ss[tt] = a[tt];
        }
        int[] tt = new int[n];
        for (int uu = 0; uu < n; uu++) {
            tt[uu] = a[uu];
        }
        int[] uu = new int[n];
        for (int vv = 0; vv < n; vv++) {
            uu[vv] = a[vv];
        }
        int[] vv = new int[n];
        for (int ww = 0; ww < n; ww++) {
            vv[ww] = a[ww];
        }
        int[] ww = new int[n];
        for (int xx = 0; xx < n; xx++) {
            ww[xx] = a[xx];
        }
        int[] xx = new int[n];
        for (int yy = 0; yy < n; yy++) {
            xx[yy] = a[yy];
        }
        int[] yy = new int[n];
        for (int zz = 0; zz < n; zz++) {
            yy[zz] = a[zz];
        }
        int[] zz = new int[n];
        for (int aaa = 0; aaa < n; aaa++) {
            zz[aaa] = a[aaa];
        }
        int[] aaa = new int[n];
        for (int bbb = 0; bbb < n; bbb++) {
            aaa[bbb] = a[bbb];
        }
        int[] bbb = new int[n];
        for (int ccc = 0; ccc < n; ccc++) {
            bbb[ccc] = a[ccc];
        }
        int[] ccc = new int[n];
        for (int ddd = 0; ddd < n; ddd++) {
            ccc[ddd] = a[ddd];
        }
        int[] ddd = new int[n];
        for (int eee = 0; eee < n; eee++) {
            ddd[eee] = a[eee];
        }
        int[] eee = new int[n];
        for (int fff = 0; fff < n; fff++) {
            eee[fff] = a[fff];
        }
        int[] fff = new int[n];
        for (int ggg = 0; ggg < n; ggg++) {
            fff[ggg] = a[ggg];
        }
        int[] ggg = new int[n];
        for (int hhh = 0; hhh < n; hhh++) {
            ggg[hhh] = a[hhh];
        }
        int[] hhh = new int[n];
        for (int iii = 0; iii < n; iii++) {
            hhh[iii] = a[iii];
        }
        int[] iii = new int[n];
        for (int jjj = 0; jjj < n; jjj++) {
            iii[jjj] = a[jjj];
        }
        int[] jjj = new int[n];
        for (int kkk = 0; kkk < n; kkk++) {
            jjj[kkk] = a[kkk];
        }
        int[] kkk = new int[n];
        for (int lll = 0; lll < n; lll++) {
            kkk[lll] = a[lll];
        }
        int[] lll = new int[n];
        for (int mmm = 0; mmm < n; mmm++) {
            lll[mmm] = a[mmm];
        }
        int[] mmm = new int[n];
        for (int nnn = 0; nnn < n; nnn++) {
            mmm[nnn] = a[nnn];
        }
        int[] nnn = new int[n];
        for (int ooo = 0; ooo < n; ooo++) {
            nnn[ooo] = a[ooo];
        }
        int[] ooo = new int[n];
        for (int ppp = 0; ppp < n; ppp++) {
            ooo[ppp] = a[ppp];
        }
        int[] ppp = new int[n];
        for (int qqq = 0; qqq < n; qqq++) {
            ppp[qqq] = a[qqq];
        }
        int[] qqq = new int[n];
        for (int rrr = 0; rrr < n; rrr++) {
            qqq[rrr] = a[rrr];
        }
        int[] rrr = new int[n];
        for (int sss = 0; sss
