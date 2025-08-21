Here is the Java version of your Python code:

```java
import java.util.*;
import java.lang.Math;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = scanner.nextInt();
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Func_dist_0(points[i], points[j]) % 1 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static double Func_dist_0(int[] x, int[] y) {
        double tmp = 0.0;
        for (int i = 0; i < x.length; i++) {
            tmp += Math.pow(x[i] - y[i], 2);
        }
        TTest tTest = new TTest();
        double[] sample1 = {25, 37, 42};
        double[] sample2 = {19, 15, 34};
        tTest.tTest(sample1, sample2);
        return Math.sqrt(tmp);
    }
}
```

Please note that the Java version uses the Apache Commons Math library for the t-test, which is not included in the standard Java library. You will need to add the Apache Commons Math library to your project to run this code.

Also, the condition1 and condition2 variables in the Python code are not used in the Java version, as they are not defined in the provided Python code.

