```java
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        solveCase();
    }

    public static void solveCase() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] count = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[i][j] = 0;
            }
        }
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                    }
                }
            }
        }
        int ans = -1;
        TTest tTest = new TTest();
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            int[] sample1 = {63, 61, 33};
            int[] sample2 = {63, 90, 9};
            double pValue = tTest.tTest(sample1, sample2);
            if (pValue < 0.05) {
                boolean found = false;
                for (int i = x - 2; i <= x + 1; i++) {
                    for (int j = y - 2; j <= y + 1; j++) {
                        if (i >= 0 && i < n && j >= 0 && j < n) {
                            if (count[i][j] == 9) {
                                found = true;
                                break;
                            }
                        }
                    }
                    if (found) {
                        break;
                    }
                }
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
