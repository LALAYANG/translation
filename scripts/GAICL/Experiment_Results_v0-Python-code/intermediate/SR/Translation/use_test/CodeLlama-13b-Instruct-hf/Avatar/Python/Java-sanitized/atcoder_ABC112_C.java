import java.util.Scanner;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            ls_xyh[i][0] = scanner.nextInt();
            ls_xyh[i][1] = scanner.nextInt();
            ls_xyh[i][2] = scanner.nextInt();
        }
        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2];
                break;
            }
        }
        int[][] cands = new int[101][101];
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                cands[i][j] = h0 + Math.abs(i - x0) + Math.abs(j - y0);
            }
        }
        for (int i = 0; i < n; i++) {
            int newx = ls_xyh[i][0];
            int newy = ls_xyh[i][1];
            int newh = ls_xyh[i][2];
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (cands[j][k] > 0) {
                        cands[j][k] = Math.max(cands[j][k] - Math.abs(j - newx) - Math.abs(k - newy), 0);
                    }
                }
            }
        }
        int xx = 0;
        int yy = 0;
        int hh = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (cands[i][j] > hh) {
                    xx = i;
                    yy = j;
                    hh = cands[i][j];
                }
            }
        }
        System.out.println(xx + " " + yy + " " + hh);
    }
}