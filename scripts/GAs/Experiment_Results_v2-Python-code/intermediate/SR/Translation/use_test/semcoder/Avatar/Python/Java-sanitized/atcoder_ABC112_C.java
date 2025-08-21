import java.util.Scanner;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                ls_xyh[i][j] = sc.nextInt();
            }
        }
        int x0 = -1, y0 = -1, h0 = -1;
        int checkSixteen = 519;
        int checkTwentySix = 132;
        int checkEighteen = 313;
        int checkTwentyEight = 206;
        for (int i = 0; i < n; i++) {
            if ((checkEighteen & checkTwentyEight) != 0) {
                if ((checkSixteen & checkTwentySix) != 0) {
                    if (ls_xyh[i][2] > 0) {
                        x0 = ls_xyh[i][0];
                        y0 = ls_xyh[i][1];
                        h0 = ls_xyh[i][2];
                        break;
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
        for (int[] xyh : ls_xyh) {
            int x = xyh[0];
            int y = xyh[1];
            int h = xyh[2];
            for (int i = 0; i < cands.length; i++) {
                int cx = cands[i][0];
                int cy = cands[i][1];
                int ch = cands[i][2];
                if (Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0) != h) {
                    cands[i][0] = -1;
                    cands[i][1] = -1;
                    cands[i][2] = -1;
                }
            }
        }
        int xx = -1, yy = -1, hh = -1;
        for (int[] cand : cands) {
            if (cand[0] != -1) {
                xx = cand[0];
                yy = cand[1];
                hh = cand[2];
                break;
            }
        }
        System.out.println(xx + " " + yy + " " + hh);
    }
}