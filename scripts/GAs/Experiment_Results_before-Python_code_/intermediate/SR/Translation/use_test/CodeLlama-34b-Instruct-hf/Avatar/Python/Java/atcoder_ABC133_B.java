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
                double distance = 0.0;
                for (int k = 0; k < d; k++) {
                    distance += Math.pow(points[i][k] - points[j][k], 2);
                }
                if (Math.sqrt(distance) % 1 == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
```
Note: In Java, we use the `Math.pow()` method to calculate the power of a number, and the `Math.sqrt()` method to calculate the square root of a number. We also use the `%` operator to check if a number is an integer.
