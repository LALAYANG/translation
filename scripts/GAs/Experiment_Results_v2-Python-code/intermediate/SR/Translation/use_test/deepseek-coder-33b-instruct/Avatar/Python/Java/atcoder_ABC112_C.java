```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                ls_xyh[i][j] = scanner.nextInt();
            }
        }
        solve(n, ls_xyh);
    }

    public static void solve(int n, int[][] ls_xyh) {
        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
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
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int[] xyh : ls_xyh) {
            int x = xyh[0];
            int y = xyh[1];
            int h = xyh[2];
            Iterator<int[]> iterator = cands.iterator();
            while (iterator.hasNext()) {
                int[] cand = iterator.next();
                int cx = cand[0];
                int cy = cand[1];
                int ch = cand[2];
                if (Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0) != h) {
                    iterator.remove();
                }
            }
        }
        int[] res = cands.get(0);
        System.out.println(res[0] + " " + res[1] + " " + res[2]);
    }
}
```

