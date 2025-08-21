```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        int conditionOne = 970;
        int conditionTwo = 170;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (conditionOne & conditionTwo) {
                    double distance = euclideanDistance(points[i], points[j]);
                    if (distance % 1 == 0) {
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
            tmp += (x[i] - y[i]) * (x[i] - y[i]);
        }
        return Math.sqrt(tmp);
    }
}
```
Note: The `euclideanDistance` method is a Java implementation of the Euclidean distance formula, which is used to calculate the distance between two points in a multi-dimensional space. The `conditionOne` and `conditionTwo` variables are used to check if the distance between the two points is an integer or not. If the distance is an integer, the `count` variable is incremented.
