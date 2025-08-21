```java
import org.apache.commons.math3.stat.inference.TTest;

public class Solution {
    public static void main(String[] args) {
        solve_case();
    }

    public static void solve_case() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] count = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[i][j] = 0;
            }
        }
        for (int k = 0; k < m; k++) {
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                    }
                }
            }
        }
        int answer = -1;
        int[] a = {43, 4, 32};
        int[] b = {79, 54, 22};
        TTest tTest = new TTest();
        double pValue = tTest.tTest(a, b);
        if (pValue < 0.05) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (count[i][j] == 9) {
                        answer = 1;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
```
