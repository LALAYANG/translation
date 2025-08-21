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

        int x0 = -1;
        int y0 = -1;
        int baseHeight = -1;
        for (int i = 0; i < n; i++) {
            if (locations[i][2] > 0) {
                x0 = locations[i][0];
                y0 = locations[i][1];
                baseHeight = locations[i][2];
                break;
            }
        }

        int[][] cands = new int[101][101][101];
        for (int i = 0; i < 101; i++) {
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    cands[i][j][k] = Math.max(baseHeight - Math.abs(i - x0) - Math.abs(j - y0), 0);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int x = locations[i][0];
            int y = locations[i][1];
            int h = locations[i][2];
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
                    if (cands[i][j][k] > 0) {
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
Note: The above code is a direct translation of the given Python code to Java. It is not optimized for performance or readability.
