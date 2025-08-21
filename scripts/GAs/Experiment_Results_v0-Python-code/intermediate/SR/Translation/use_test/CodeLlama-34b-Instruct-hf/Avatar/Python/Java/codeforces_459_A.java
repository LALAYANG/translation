```java
import java.util.Scanner;
import java.util.Date;
import java.util.Base64;
import java.net.HttpURLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int x1 = Integer.parseInt(numbers[0]);
        int y1 = Integer.parseInt(numbers[1]);
        int x2 = Integer.parseInt(numbers[2]);
        int y2 = Integer.parseInt(numbers[3]);

        int denominator = deltaX(x2, x1);
        int numerator = y2 - y1;

        if (denominator != 0) {
            int quotient = numerator / denominator;
            if (quotient == 1) {
                System.out.println(x2 + " " + y1 + " " + x1 + " " + y2);
            } else if (quotient == -1) {
                System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
            } else {
                System.out.println("-1");
            }
        } else {
            int d = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            int x4 = x1 + d;
            int x3 = x2 + d;
            int y3 = y2 + d;
            int y4 = y1 + d;
            System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
        }
    }

    public static int deltaX(int x2, int x1) {
        return x2 - x1;
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses some libraries that are not available in Java, so I had to remove them and implement the equivalent functionality in Java. The code also uses some Python-specific syntax, such as the `input()` function, which I replaced with a `Scanner` object in Java.
