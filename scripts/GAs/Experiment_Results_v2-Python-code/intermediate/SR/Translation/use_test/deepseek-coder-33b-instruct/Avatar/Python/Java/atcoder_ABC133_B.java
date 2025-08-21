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
        int condition_one = 970;
        int condition_two = 170;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((condition_one & condition_two) != 0) {
                    if (euclideanDistance(points[i], points[j]) % 1 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double euclideanDistance(int[] x, int[] y) {
        double tmp = 0.0;
        for (int i = 0; i < x.length; i++) {
            tmp += Math.pow(x[i] - y[i], 2);
        }
        return Math.sqrt(tmp);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the Euclidean distance between all pairs of points, and counts the number of pairs whose distance is an integer. The Euclidean distance is calculated in the `euclideanDistance` method, which is called from the main method. The `euclideanDistance` method calculates the sum of the squares of the differences between the corresponding elements of the two arrays, then takes the square root of that sum to get the distance.

