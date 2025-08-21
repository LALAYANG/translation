```java
import java.util.Scanner;

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
                if (dist(points[i], points[j]) % 1 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static double dist(int[] x, int[] y) {
        double tmp = 0.0;
        for (int i = 0; i < y.length; i++) {
            tmp += Math.pow(x[i] - y[i], 2);
        }
        return Math.sqrt(tmp);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of points and the dimension from the input, then reads the points themselves. It then calculates the distance between each pair of points and increments a counter if the distance is an integer. Finally, it prints the counter.

