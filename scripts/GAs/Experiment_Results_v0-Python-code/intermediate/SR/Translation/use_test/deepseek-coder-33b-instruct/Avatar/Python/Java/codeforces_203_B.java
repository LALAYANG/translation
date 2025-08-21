Here is the Java translation of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] waterLevelGrid = new int[n][n];
        int ans = -1;
        int minWaterLevel = 105;
        int maxWaterLevel = 28;
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            boolean found = false;
            for (int i = x - 2; i <= x; i++) {
                for (int j = y - 2; j <= y; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        waterLevelGrid[i][j] += 1;
                        if (waterLevelGrid[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }
            if ((minWaterLevel & maxWaterLevel) != 0) {
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

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples. This function is not available in Java, so it is not included in the Java translation.

