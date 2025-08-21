Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int denominator = x2 - x1;
        int numerator = y2 - y1;
        if (denominator != 0) {
            double quotient = (double) numerator / denominator;
            if (quotient == 1) {
                System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);
            } else if (quotient == -1) {
                System.out.println(x2 + " " + y2 + " " + x1 + " " + y1);
            } else {
                System.out.println("-1");
            }
        } else {
            int d = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            int x3 = x1;
            int x4 = x2;
            int y3 = y2 + d;
            int y4 = y1 + d;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
    }
}
```

Please note that the Java version of the code uses `Scanner` to read the input from the console. The `nextInt()` method is used to read the integers from the console. The `Math.sqrt()` and `Math.pow()` methods are used to calculate the square root and power respectively. The `System.out.println()` method is used to print the output to the console.

