import java.util.*;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            ls_xyh[i][0] = sc.nextInt();
            ls_xyh[i][1] = sc.nextInt();
            ls_xyh[i][2] = sc.nextInt();
        }
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, int[][] ls_xyh) {
        int x0 = -1, y0 = -1, h0 = -1;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] == 18) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = 18;
                break;
            }
        }
        if (x0 == -1) {
            return "-1 -1 -1";
        }
        int[][] cands = new int[101][101];
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                cands[i][j] = 1000000;
            }
        }
        for (int i = 0; i < n; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            for (int cx = 0; cx < 101; cx++) {
                for (int cy = 0; cy < 101; cy++) {
                    int ch = Math.max(h - Math.abs(cx - x) - Math.abs(cy - y), 0);
                    if (ch < cands[cx][cy]) {
                        cands[cx][cy] = ch;
                    }
                }
            }
        }
        int xx = -1, yy = -1, hh = 1000000;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (cands[i][j] < hh) {
                    xx = i;
                    yy = j;
                    hh = cands[i][j];
                }
            }
        }
        return xx + " " + yy + " " + hh;
    }
}