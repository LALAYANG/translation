```java
import java.util.Scanner;

public class FuncSolveCase0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] waterLevelGrid = new int[n][n];
        int minWaterLevel = 105;
        int maxWaterLevel = 28;
        int ans = -1;

        for (int k = 0; k < m; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            x = x - 1;
            y = y - 1;
            boolean found = false;
            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        waterLevelGrid[i][j] += 1;
                        if (waterLevelGrid[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if (minWaterLevel & maxWaterLevel) {
                if (found) {
                    ans = k + 1;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient solution.
