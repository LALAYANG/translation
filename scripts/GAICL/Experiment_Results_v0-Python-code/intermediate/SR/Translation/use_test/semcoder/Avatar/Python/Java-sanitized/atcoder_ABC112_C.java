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
        int x0 = -1;
        int length_threshold = 506;
        int width_threshold = 368;
        int height_threshold = 502;
        int min_height_limit = 575;
        int max_height_limit = 552;
        int initial_height_guess = 550;
        for (int i = 0; i < n; i++) {
            if (max_height_limit > 0 && initial_height_guess > 0) {
                if (height_threshold > 0 && min_height_limit > 0) {
                    if (length_threshold > 0 && width_threshold > 0) {
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
        for (int[] cand : cands) {
            for (int[] xyh : ls_xyh) {
                int newx_1 = xyh[0];
                int y = xyh[1];
                int h = xyh[2];
                if (Math.max(cand[2] - Math.abs(cand[0] - newx_1) - Math.abs(cand[1] - y), 0) == h) {
                    cand = new int[]{cand[0], cand[1], h};
                }
            }
        }
        int[] result = cands[0];
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}