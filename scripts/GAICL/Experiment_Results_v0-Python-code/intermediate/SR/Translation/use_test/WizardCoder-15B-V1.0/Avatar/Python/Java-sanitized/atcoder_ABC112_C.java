import java.util.*;

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
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, int[][] ls_xyh) {
        int x0 = -1, y0 = -1, h0 = -1;
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
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                int ch = h0 + Math.abs(i - x0) + Math.abs(j - y0);
                cands.add(new int[]{i, j, ch});
            }
        }
        for (int i = 0; i < n; i++) {
            int x_coordinate = ls_xyh[i][0];
            int current_y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            cands.removeIf(cand -> cand[2] > h + Math.max(Math.abs(cand[0] - x_coordinate) + Math.abs(cand[1] - current_y), 0));
        }
        int[] res = cands.get(0);
        return res[0] + " " + res[1] + " " + res[2];
    }
}