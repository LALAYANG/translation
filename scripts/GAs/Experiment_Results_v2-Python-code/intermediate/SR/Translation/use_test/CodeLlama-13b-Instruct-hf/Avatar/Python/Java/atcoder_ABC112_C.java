
Here is the Java code that translates the Python code:
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
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2];
                break;
            }
        }
        int[][] cands = new int[101][101];
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                cands[i][j] = h0 + Math.abs(i - x0) + Math.abs(j - y0);
            }
        }
        for (int i = 0; i < n; i++) {
            int x = ls_xyh[i][0];
            int y = ls_xyh[i][1];
            int h = ls_xyh[i][2];
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (cands[j][k] > 0) {
                        cands[j][k] = Math.max(cands[j][k] - Math.abs(j - x) - Math.abs(k - y), 0);
                    }
                }
            }
        }
        int xx = 0;
        int yy = 0;
        int hh = 0;
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                if (cands[i][j] > hh) {
                    xx = i;
                    yy = j;
                    hh = cands[i][j];
                }
            }
        }
        System.out.println(xx + " " + yy + " " + hh);
    }
}
```
This code reads the input from the standard input and then solves the problem. It first reads the number of points `n` and then reads the coordinates of each point `(x, y, h)` and stores them in an array `ls_xyh`. It then finds the point with the highest `h` value and sets it as the starting point `(x0, y0, h0)`.

Next, it initializes an array `cands` of size 101x101, where each element is the sum of the absolute differences between the starting point and the current point, plus the current point's `h` value.

It then iterates over the remaining points and updates the `cands` array by subtracting the absolute differences between the current point and the starting point, and setting the result to 0 if it is negative.

Finally, it finds the point with the highest `h` value in the `cands` array and prints its coordinates and `h` value.

Note that this code assumes that the input is valid and that there is at least one point with a positive `h` value. If the input is invalid or there are no points with a positive `h` value, the code will throw an exception.
