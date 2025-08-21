```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            ls_xyh[i][0] = sc.nextInt();
            ls_xyh[i][1] = sc.nextInt();
            ls_xyh[i][2] = sc.nextInt();
        }

        int x0 = -1;
        int y0 = -1;
        int h0 = -1;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2];
                break;
            }
        }

        int[][] cands = new int[101][101][101];
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    cands[i][j][k] = Math.max(k - Math.abs(i - x0) - Math.abs(j - y0), 0);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (cands[j][k][h] == 0) {
                        cands[j][k][h] = Math.max(h - Math.abs(j - x) - Math.abs(k - y), 0);
                    }
                }
            }
        }

        int xx = -1;
        int yy = -1;
        int hh = -1;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (cands[i][j][k] == 0) {
                        xx = i;
                        yy = j;
                        hh = k;
                        break;
                    }
                }
            }
        }

        System.out.println(xx + " " + yy + " " + hh);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
