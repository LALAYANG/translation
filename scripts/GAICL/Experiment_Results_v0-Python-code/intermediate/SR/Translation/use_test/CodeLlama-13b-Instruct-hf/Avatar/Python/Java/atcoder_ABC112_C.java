
The provided Python code is a solution to a problem that involves finding the optimal location for a building in a given area. The code uses a series of conditions to determine the optimal location, and then uses a set of coordinates to calculate the distance between the building and the optimal location.

Here is the equivalent Java code:
```java
import java.util.Scanner;

public class BuildingLocation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            ls_xyh[i][0] = scanner.nextInt();
            ls_xyh[i][1] = scanner.nextInt();
            ls_xyh[i][2] = scanner.nextInt();
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
            int newx = ls_xyh[i][0];
            int newy = ls_xyh[i][1];
            int newh = ls_xyh[i][2];
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (cands[j][k] > 0) {
                        cands[j][k] = Math.max(cands[j][k] - Math.abs(j - newx) - Math.abs(k - newy), 0);
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
This code uses a similar approach as the Python code, but it is written in Java. It first reads the input from the user, which is the number of buildings and their coordinates. It then uses a series of conditions to determine the optimal location, and then uses a set of coordinates to calculate the distance between the building and the optimal location. Finally, it prints the optimal location and the distance to the console.

Note that this code is not optimized for performance, and it may not be the most efficient way to solve this problem. However, it should give you a good starting point for understanding the problem and how to solve it in Java.
