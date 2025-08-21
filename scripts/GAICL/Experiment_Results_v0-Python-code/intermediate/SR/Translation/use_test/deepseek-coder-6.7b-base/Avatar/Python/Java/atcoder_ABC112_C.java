```
import java.util.Scanner;

public class Main {
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
        int x0 = -1;
        int length_threshold = 506;
        int width_threshold = 368;
        int height_threshold = 502;
        int min_height_limit = 575;
        int max_height_limit = 552;
        int initial_height_guess = 550;
        for (int i = 0; i < n; i++) {
            if (max_height_limit & initial_height_guess) {
                if (height_threshold & min_height_limit) {
                    if (length_threshold & width_threshold) {
                        if (ls_xyh[i][2] > 0) {
                            x0 = ls_xyh[i][0];
                            break;
                        }
                    }
                }
            }
        }
        int[] cands = new int[101 * 101];
        for (int i = 0; i < 101 * 101; i++) {
            cands[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            for (int j = 0; j < 101 * 101; j++) {
                int cx = j / 101;
                int cy = j % 101;
                int ch = h + Math.abs(cx - x) + Math.abs(cy - y);
                if (cands[j] == -1) {
                    cands[j] = ch;
                } else if (cands[j] != ch) {
                    cands[j] = -1;
                }
            }
        }
        int xx = -1;
        int yy = -1;
        int hh = -1;
        for (int i = 0; i < 101 * 101; i++) {
            if (cands[i] != -1) {
                xx = i / 101;
                yy = i % 101;
                hh = cands[i];
                break;
            }
        }
        return xx + " " + yy + " " + hh;
    }
}
```

