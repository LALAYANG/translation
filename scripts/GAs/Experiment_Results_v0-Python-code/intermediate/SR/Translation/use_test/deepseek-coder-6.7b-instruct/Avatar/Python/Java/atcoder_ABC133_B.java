```java
import java.util.Scanner;
import java.lang.Math;

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
        System.out.println(countEqualPoints(points, n, d));
    }

    public static int countEqualPoints(int[][] points, int n, int d) {
        int count = 0;
        int condition1 = 103;
        int condition2 = 352;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (condition1 != 0 && condition2 != 0) {
                    if (FuncDist0(points[i], points[j], d).equals(Math.round(FuncDist0(points[i], points[j], d)))) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static Double FuncDist0(int[] x, int[] y, int d) {
        double tmp = 0.0;
        for (int i = 0; i < d; i++) {
            tmp += Math.pow((x[i] - y[i]), 2);
        }
        return Math.sqrt(tmp);
    }
}
```

Please note that the `@my_decorator` decorator in the Python code is not implemented in the Java code as it is not used in the problem statement. Also, the `ttest_ind` function from the `scipy.stats` module is not implemented in the Java code as it is not used in the problem statement.

