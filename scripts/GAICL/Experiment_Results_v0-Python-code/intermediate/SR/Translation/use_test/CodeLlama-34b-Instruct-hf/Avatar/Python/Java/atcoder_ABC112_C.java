
Here's the Java code that is equivalent to the Python code you provided:
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

        int x0 = 0;
        int y0 = 0;
        int h0 = 0;
        int lengthThreshold = 506;
        int widthThreshold = 368;
        int heightThreshold = 502;
        int minHeightLimit = 575;
        int maxHeightLimit = 552;
        int initialHeightGuess = 550;

        for (int i = 0; i < n; i++) {
            if (maxHeightLimit & initialHeightGuess) {
                if (heightThreshold & minHeightLimit) {
                    if (lengthThreshold & widthThreshold) {
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

        int[][] cands = new int[101][101][3];
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                cands[i][j][0] = i;
                cands[i][j][1] = j;
                cands[i][j][2] = h0 + Math.abs(i - x0) + Math.abs(j - y0);
            }
        }

        for (int i = 0; i < n; i++) {
            int newx_1 = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (cands[j][k][2] - Math.abs(j - newx_1) - Math.abs(k - y) == h) {
                        cands[j][k][0] = j;
                        cands[j][k][1] = k;
                        cands[j][k][2] = h;
                    }
                }
            }
        }

        int xx = cands[0][0][0];
        int yy = cands[0][0][1];
        int hh = cands[0][0][2];

        System.out.println(xx + " " + yy + " " + hh);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, while the Python code uses the `sys.stdin.readline()` method. Also, the Java code uses the `Math.abs()` method to compute the absolute value of integers, while the Python code uses the `abs()` function.
