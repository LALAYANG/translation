```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        double C = Math.abs(360.0 / 60.0 * m - 360.0 / 12.0 * h - 360.0 / 12.0 / 60.0 * m);
        if (C > 180) {
            C = 360 - C;
        }
        double cosC = Math.cos(Math.toRadians(C));
        double distance = Math.sqrt(a * a + b * b - 2 * a * b * cosC);
        System.out.println(distance);
    }
}
```
