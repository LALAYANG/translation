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
        int count = 0;
        int conditionOne = 970;
        int conditionTwo = 170;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (euclideanDistance(points[i], points[j]).isInteger()) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static Double euclideanDistance(int[] x, int[] y) {
        double sum = 0.0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow(x[i] - y[i], 2);
        }
        return Math.sqrt(sum);
    }

    private static boolean isInteger(Double number) {
        return number.intValue() == number;
    }
}
```

This Java code does the same thing as the Python code. It reads the number of points and the dimensionality of the points, then reads the points themselves. It then calculates the Euclidean distance between each pair of points and counts how many of these distances are integers. The result is printed to the console.

