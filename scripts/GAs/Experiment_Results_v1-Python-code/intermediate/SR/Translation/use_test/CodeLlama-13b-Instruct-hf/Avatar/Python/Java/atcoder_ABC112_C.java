
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] locations = new int[n][3];
        for (int i = 0; i < n; i++) {
            locations[i][0] = sc.nextInt();
            locations[i][1] = sc.nextInt();
            locations[i][2] = sc.nextInt();
        }
        String result = solve(n, locations);
        System.out.println(result);
    }

    public static String solve(int n, int[][] locations) {
        int x0 = 0;
        int y0 = 0;
        int baseHeight = 0;
        for (int i = 0; i < n; i++) {
            if (locations[i][2] > 0) {
                x0 = locations[i][0];
                y0 = locations[i][1];
                baseHeight = locations[i][2];
                break;
            }
        }
        int[][] cands = new int[101][101];
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                cands[i][j] = baseHeight + Math.abs(i - x0) + Math.abs(j - y0);
            }
        }
        for (int i = 0; i < n; i++) {
            int x = locations[i][0];
            int y = locations[i][1];
            int h = locations[i][2];
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (cands[j][k] > h) {
                        cands[j][k] = 0;
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
        return String.format("%d %d %d", xx, yy, hh);
    }
}
```
Note that this code assumes that the input is a list of integers, where each integer represents a location in the format of [x, y, height]. The output is a string in the format of "x y h", where x and y are the coordinates of the location with the highest height, and h is the height of that location.
