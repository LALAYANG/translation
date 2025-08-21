```java
import java.util.Scanner;

public class CookieCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        double time = a;
        while (time <= t + 0.5) {
            cookie += b;
            time += a;
        }
        System.out.println(cookie);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. It first prompts the user to enter three integers, `a`, `b`, and `t`, and then uses a `while` loop to calculate the number of cookies that will be produced over a time period of `t + 0.5` seconds. The `cookie` variable is incremented by `b` for each iteration of the loop, and the `time` variable is incremented by `a` for each iteration. The final value of `cookie` is printed to the console.
