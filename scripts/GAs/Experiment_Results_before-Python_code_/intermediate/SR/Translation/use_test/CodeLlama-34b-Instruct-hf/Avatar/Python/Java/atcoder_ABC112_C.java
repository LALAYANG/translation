```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            ls_xyh[i][0] = scanner.nextInt();
            ls_xyh[i][1] = scanner.nextInt();
            ls_xyh[i][2] = scanner.nextInt();
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
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                for (int ch = 0; ch < 101; ch++) {
                    cands[cx][cy][ch] = Math.max(ch - Math.abs(cx - x0) - Math.abs(cy - y0), 0);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            for (int cx = 0; cx < 101; cx++) {
                for (int cy = 0; cy < 101; cy++) {
                    for (int ch = 0; ch < 101; ch++) {
                        if (cands[cx][cy][ch] == h) {
                            cands[cx][cy][ch] = Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0);
                        }
                    }
                }
            }
        }

        int xx = -1;
        int yy = -1;
        int hh = -1;
        for (int cx = 0; cx < 101; cx++) {
            for (int cy = 0; cy < 101; cy++) {
                for (int ch = 0; ch < 101; ch++) {
                    if (cands[cx][cy][ch] == h0) {
                        xx = cx;
                        yy = cy;
                        hh = ch;
                        break;
                    }
                }
            }
        }

        System.out.println(xx + " " + yy + " " + hh);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or elegant solution to the problem. The Python code uses a list comprehension to generate the list of candidates, but in Java, it would be more efficient to use a nested loop to generate the list of candidates. Additionally, the Python code uses the `max` function to find the maximum value in the list of candidates, but in Java, it would be more efficient to use a loop to find the maximum value.
