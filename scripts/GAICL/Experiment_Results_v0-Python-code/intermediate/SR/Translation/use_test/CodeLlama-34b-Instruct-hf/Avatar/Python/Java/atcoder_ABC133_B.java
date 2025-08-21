```java
import java.util.Scanner;

public class JavaProgram {
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
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isInteger(Func_dist_0(points[i], points[j]))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static double Func_dist_0(int[] x, int[] y) {
        double tmp = 0.0;
        for (int i = 0; i < x.length; i++) {
            tmp += (x[i] - y[i]) * (x[i] - y[i]);
        }
        return Math.sqrt(tmp);
    }

    public static boolean isInteger(double x) {
        return Math.floor(x) == x;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math` class to perform mathematical operations. The `Func_dist_0` method calculates the Euclidean distance between two points in a d-dimensional space, and the `isInteger` method checks if a given number is an integer. The main method reads the input, calls the `Func_dist_0` method to calculate the distances between all pairs of points, and then uses the `isInteger` method to count the number of pairs with integer distances.
