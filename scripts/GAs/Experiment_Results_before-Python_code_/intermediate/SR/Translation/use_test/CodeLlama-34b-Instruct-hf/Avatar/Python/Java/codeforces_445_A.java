```java
import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[][] grid = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        grid[i][j] = "B";
                    } else {
                        grid[i][j] = "W";
                    }
                } else {
                    if (j % 2 == 0) {
                        grid[i][j] = "W";
                    } else {
                        grid[i][j] = "B";
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
```
Test input:
2 5
.....
.....

Expected output:
BWBWB
WBWBW

Actual output:
BWBWB
WBWBW
