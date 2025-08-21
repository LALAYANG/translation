import java.util.Scanner;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                ls_xyh[i][j] = scanner.nextInt();
            }
        }
        int x0 = -1, y0 = -1, h0 = -1;
        int length_threshold = 506, width_threshold = 368, height_threshold = 502;
        int min_height_limit = 575, max_height_limit = 552;
        int initial_height_guess = 550;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2] + Math.abs(x0 - ls_xyh[i][0]) + Math.abs(y0 - ls_xyh[i][1]);
                break;
            }
        }
        int[][] cands = new int[101 * 101][3];
        int index = 0;
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands[index][0] = cx;
                cands[index][1] = cy;
                cands[index][2] = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                index++;
            }
        }
        for (int[] point : ls_xyh) {
            int x_coordinate = point[0];
            int current_y = point[1];
            int h = point[2];
            for (int i = 0; i < cands.length; i++) {
                int cx = cands[i][0];
                int cy = cands[i][1];
                int ch = cands[i][2];
                if (Math.max(ch - Math.abs(cx - x_coordinate) - Math.abs(cy - current_y), 0) != h) {
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