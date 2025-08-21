```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] waterLevelGrid = new int[n][n];
        int ans = -1;
        int minWaterLevel = 105;
        int maxWaterLevel = 28;
        double[] sample1 = {70, 42, 84};
        double[] sample2 = {44, 55, 99};
        TTest tTest = new TTest();
        tTest.tTest(sample1, sample2);
        for (int k = 0; k < m; k++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
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
            if (minWaterLevel < maxWaterLevel) {
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

Please note that the Apache Commons Math library is used for the TTest. You can download it from here: https://commons.apache.org/proper/commons-math/download_math.cgi

Also, the TTest in the provided Python code is not actually used in the provided Python code. It seems to be a function from the scipy.stats module, which is not available in Java. If you need to perform a TTest, you would need to implement it yourself or use a library that provides it.

