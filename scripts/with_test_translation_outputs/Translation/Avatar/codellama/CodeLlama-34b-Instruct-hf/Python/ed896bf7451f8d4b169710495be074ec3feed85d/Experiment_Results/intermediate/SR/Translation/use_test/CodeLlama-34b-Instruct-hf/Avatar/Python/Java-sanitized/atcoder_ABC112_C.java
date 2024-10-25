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

        int[][] cands = new int[101][101][101];
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                for (int ch = 0; ch < 101; ch++) {
                    cands[cx][cy][ch] = Math.max(ch - Math.abs(cx - x0) - Math.abs(cy - y0), 0);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            for (int cx = 0; cx < 101; cx++) {
                for (int cy = 0; cy < 101; cy++) {
                    for (int ch = 0; ch < 101; ch++) {
                        if (cands[cx][cy][ch] == h) {
                            cands[cx][cy][ch] = 0;
                        }
                    }
                }
            }
        }

        int xx = 0;
        int yy = 0;
        int hh = 0;
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                for (int ch = 0; ch < 101; ch++) {
                    if (cands[cx][cy][ch] > 0) {
                        xx = cx;
                        yy = cy;
                        hh = ch;
                        break;
                    }
                }
            }
        }

        System.out.println(xx + " " + yy + " " + hh);
    }
}