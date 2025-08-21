```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] waterLevelGrid = new int[n][n];
        int ans = -1;
        boolean found = false;
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
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
            if (found) {
                ans = k + 1;
                break;
            }
        }
        System.out.println(ans);
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not included in the Java version. The `ttest_ind` function is used for a two-sample t-test, which is a statistical test that determines whether the means of two groups are significantly different from each other. In this case, it is not relevant to the problem and has been omitted.

