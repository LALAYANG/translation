
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] XY = new int[N][2];
        for (int i = 0; i < N; i++) {
            XY[i][0] = sc.nextInt();
            XY[i][1] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            double[] D = new double[N];
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    D[j] = Math.atan2(XY[i][0] - XY[j][0], XY[i][1] - XY[j][1]);
                }
            }
            D[N - 1] = D[0] + 2 * Math.PI;
            double ans = 0;
            for (int k = 0; k < N - 1; k++) {
                if (D[k + 1] - D[k] >= Math.PI) {
                    ans = (D[k + 1] - D[k]) - Math.PI;
                }
            }
            System.out.println(ans / (2 * Math.PI));
        }
    }
}
```
This code first reads the input from the user and stores it in an array of arrays `XY`. It then calculates the angle between each pair of points using the `atan2` function from the `Math` class, and stores the result in an array `D`. The `D` array is then sorted, and the difference between each adjacent pair of angles is calculated. If the difference is greater than or equal to `pi`, the angle is considered to be greater than `pi`, and the difference is subtracted from `2 * pi`. The final result is then divided by `2 * pi` to get the fraction of the circle that is covered by the points.

Note that the `atan2` function takes two arguments: the first is the difference between the x-coordinates of the two points, and the second is the difference between the y-coordinates of the two points. This is because the `atan2` function returns the angle between the positive x-axis and the line connecting the two points, and the `Math.PI` constant represents the angle of a full circle.
