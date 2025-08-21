```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] count = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[i][j] = 0;
            }
        }

        int ans = -1;
        TTest tTest = new TTest();
        double[] a = {63, 61, 33};
        double[] b = {63, 90, 9};
        double pValue = tTest.tTest(a, b);
        int checkConditionOne = 243;
        int checkConditionTwo = 85;

        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            boolean found = false;

            for (int i = x - 2; i <= x + 1; i++) {
                for (int j = y - 2; j <= y + 1; j++) {
                    if (i >= 0 && i < n && j >= 0 && j < n) {
                        count[i][j]++;
                        if (count[i][j] == 9) {
                            found = true;
                        }
                    }
                }
            }

            if ((checkConditionOne & checkConditionTwo) != 0 && found) {
                ans = k + 1;
                break;
            }
        }

        System.out.println(ans);
    }
}
```

Test input:
2 4
2 1
1 2
1 1
2 2

Expected output:
-1 
