```java
import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double C = Math.abs(360.0 / 60.0 * m - 360.0 / 12.0 * h - 360.0 / 12.0 / 60.0 * m);
        if (C > 180.0) {
            C = 360.0 - C;
        }
        double cosC = Math.cos(Math.toRadians(C));
        System.out.println(Math.sqrt(a * a + b * b - 2 * a * b * cosC));
    }
}
```
Note: In Java, the `Math.toRadians()` method is used to convert degrees to radians, and the `Math.cos()` method is used to calculate the cosine of an angle in radians.
