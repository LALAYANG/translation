```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        double C = Math.abs(360 / 60 * m - 360 / 12 * h - 360 / 12 / 60 * m);
        if (C > 180) {
            C = 360 - C;
        }
        double cosC = Math.cos(Math.toRadians(C));
        double result = Math.sqrt(a * a + b * b - 2 * a * b * cosC);
        System.out.println(result);
    }
}
```
Note: The `map` function in Python is not necessary in Java, as the `Scanner` class can directly read input as integers. The `math.radians` function in Python is not necessary in Java, as the `Math` class has a `toRadians` method that can be used to convert degrees to radians.
