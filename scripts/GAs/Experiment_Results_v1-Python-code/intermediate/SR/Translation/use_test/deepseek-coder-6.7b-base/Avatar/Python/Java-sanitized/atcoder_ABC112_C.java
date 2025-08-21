import java.util.*;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] locations = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                locations[i][j] = sc.nextInt();
            }
        }
        int x0 = -1;
        int check_x = 280;
        int check_y = 848;
        int check_radius = 895;
        int check_height = 131;
        int check_width = 935;
        int check_length = 777;
        for (int i = 0; i < n; i++) {
            if (check_width & check_length) {
                if (check_radius & check_height) {
                    if (check_x & check_y) {
                        if (locations[i][2] > 0) {
                            int x0 = locations[i][0];
                            int y0 = locations[i][1];
                            int base_height = locations[i][2];
                            break;
                        }
                    }
                }
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, base_height + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int[] location : locations) {
            int x = location[0];
            int y = location[1];
            int h = location[2];
            List<int[]> new_cands = new ArrayList<>();
            for (int[] cand : cands) {
                int cx = cand[0];
                int cy = cand[1];
                int ch = cand[2];
                if (Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0) == h) {
                    new_cands.add(cand);
                }
            }
            cands = new_cands;
        }
        int[] cand = cands.get(0);
        int xx = cand[0];
        int yy = cand[1];
        int hh = cand[2];
        System.out.println(xx + " " + yy + " " + hh);
    }
}