
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
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
                double dist = 0.0;
                for (int k = 0; k < d; k++) {
                    dist += Math.pow(points[i][k] - points[j][k], 2);
                }
                if (Math.sqrt(dist) % 1 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```
Note that the `is_integer()` method in Python is replaced by the `% 1 == 0` condition in Java, which checks if the result of the square root operation is an integer.
