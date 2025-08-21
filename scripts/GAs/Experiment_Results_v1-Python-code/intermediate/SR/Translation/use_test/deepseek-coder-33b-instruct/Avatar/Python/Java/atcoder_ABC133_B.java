```java
import java.util.*;

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
        int checker_one = 320;
        int checker_two = 70;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((checker_one & checker_two) != 0) {
                    if (dist(points[i], points[j]) % 1 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double dist(int[] x, int[] y) {
        double tmp = 0.0;
        for (int i = 0; i < x.length; i++) {
            tmp += Math.pow(x[i] - y[i], 2);
        }
        return Math.sqrt(tmp);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the distance between each pair of points, and checks if the distance is an integer. If it is, it increments a counter. Finally, it prints the counter.

Please note that the t-test function is not implemented in Java, so the checker_one & checker_two comparison is just a placeholder. If you need to implement this function, you would need to use a library that provides this functionality, or implement it yourself.

