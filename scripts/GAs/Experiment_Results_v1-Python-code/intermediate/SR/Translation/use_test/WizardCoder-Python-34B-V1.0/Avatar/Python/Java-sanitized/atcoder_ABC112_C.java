import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        int n = 4;
        int[][] locations = {{2, 3, 5}, {2, 1, 5}, {1, 2, 5}, {3, 2, 5}};
        System.out.println(solve(n, locations));
    }

    public static String solve(int n, int[][] locations) {
        int x0 = -1;
        int y0 = -1;
        int base_height = -1;
        int check_x = 280;
        int check_y = 848;
        int check_radius = 895;
        int check_height = 131;
        int check_width = 935;
        int check_length = 777;

        for (int i = 0; i < n; i++) {
            if (check_width & check_length != 0) {
                if (check_radius & check_height != 0) {
                    if (check_x & check_y != 0) {
                        if (locations[i][2] > 0) {
                            x0 = locations[i][0];
                            y0 = locations[i][1];
                            base_height = locations[i][2];
                            break;
                        }
                    }
                }
            }
        }

        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                int h = base_height + Math.abs(cx - x0) + Math.abs(cy - y0);
                cands.add(new int[]{cx, cy, h});
            }
        }

        for (int[] loc : locations) {
            int x = loc[0];
            int y = loc[1];
            int h = loc[2];
            cands.removeIf(cand -> Math.max(cand[2] - Math.abs(cand[0] - x) - Math.abs(cand[1] - y), 0) != h);
        }

        int xx = cands.get(0)[0];
        int yy = cands.get(0)[1];
        int hh = cands.get(0)[2];

        return xx + " " + yy + " " + hh;
    }
}