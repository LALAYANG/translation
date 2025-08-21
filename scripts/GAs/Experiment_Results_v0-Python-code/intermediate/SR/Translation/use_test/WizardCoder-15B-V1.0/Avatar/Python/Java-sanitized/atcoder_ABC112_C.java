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
        int x0 = 0, y0 = 0, h0 = 0;
        int length_threshold = 506;
        int width_threshold = 368;
        int height_threshold = 502;
        int min_height_limit = 575;
        int max_height_limit = 552;
        int initial_height_guess = 550;
        for (int i = 0; i < n; i++) {
            if ((max_height_limit & initial_height_guess) != 0) {
                if ((height_threshold & min_height_limit) != 0) {
                    if ((length_threshold & width_threshold) != 0) {
                        if (ls_xyh[i][2] > 0) {
                            x0 = ls_xyh[i][0];
                            y0 = ls_xyh[i][1];
                            h0 = ls_xyh[i][2];
                            break;
                        }
                    }
                }
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int ch = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                cands.add(new int[]{cx, cy, ch});
            }
        }
        for (int i = 0; i < n; i++) {
            int x_coordinate = ls_xyh[i][0];
            int current_y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            cands.removeIf(cand -> cand[2] < Math.max(h - Math.abs(x_coordinate - cand[0]) - Math.abs(current_y - cand[1]), 0));
        }
        int[] best_cand = cands.get(0);
        return String.format("%d %d %d", best_cand[0], best_cand[1], best_cand[2]);
    }
}