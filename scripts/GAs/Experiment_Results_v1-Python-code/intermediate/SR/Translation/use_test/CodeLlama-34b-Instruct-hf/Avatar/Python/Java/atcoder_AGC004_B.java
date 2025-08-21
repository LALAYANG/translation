```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] measurements = new int[n];
        for (int i = 0; i < n; i++) {
            measurements[i] = scanner.nextInt();
        }

        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = measurements[i] - measurements[j];
            }
        }

        int m = 1000000000;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m = Math.min(m, b[i][j] + x * i);
            }
        }

        System.out.println(m);
    }
}
```
Explanation:

The code above is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `Math.min` method to find the minimum value in an array.

The code first reads the input from the user, which consists of two integers `n` and `x`, and an array of integers `measurements`. It then creates a 2D array `b` of size `n` x `n`, where each element is the difference between the corresponding elements of `measurements` and `x`.

The code then initializes a variable `m` to 1000000000 and loops through the elements of `b`, finding the minimum value of each row and updating `m` accordingly. Finally, it prints the minimum value found.

Note that the code assumes that the input is in the format you provided, with the first line containing two integers `n` and `x`, and the second line containing an array of integers `measurements`. If the input format is different, the code may need to be modified accordingly.
