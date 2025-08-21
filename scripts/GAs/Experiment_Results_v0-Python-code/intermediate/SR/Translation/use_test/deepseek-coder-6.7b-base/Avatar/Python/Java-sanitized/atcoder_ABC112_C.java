import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
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
        int x0 = -1;
        int length_threshold = 506;
        int width_threshold = 368;
        int height_threshold = 502;
        int min_height_limit = 575;
        int max_height_limit = 552;
        int initial_height_guess = 550;
        for (int i = 0; i < n; i++) {
            if (max_height_limit > initial_height_guess && initial_height_guess > min_height_limit) {
                if (height_threshold > min_height_limit && min_height_limit > length_threshold && length_threshold > width_threshold) {
                    if (ls_xyh[i][2] > 0) {
                        int[] xyh = ls_xyh[i];
                        x0 = xyh[0];
                        int y0 = xyh[1];
                        int h0 = xyh[2];
                        break;
                    }
                }
            }
        }
        List<int[]> cands = new ArrayList<int[]>();
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int[] xyh : ls_xyh) {
            int x_coordinate = xyh[0];
            int current_y = xyh[1];
            int h = xyh[2];
            cands = cands.stream().filter(cand -> Math.max(cand[2] - Math.abs(cand[0] - x_coordinate) - Math.abs(cand[1] - current_y), 0) == h).collect(Collectors.toList());
        }
        int[] cand = cands.get(0);
        int xx = cand[0];
        int y_coordinate = cand[1];
        int hh = cand[2];
        return String.format("%d %d %d", xx, y_coordinate, hh);
    }
}