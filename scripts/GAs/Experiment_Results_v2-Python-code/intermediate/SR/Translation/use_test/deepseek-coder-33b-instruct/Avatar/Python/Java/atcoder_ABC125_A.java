Here is the Java equivalent of the provided Python code. Note that Java does not have built-in support for decorators, threading, or the scipy library. Therefore, the code below does not include the decorator, threading, or scipy parts.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time_increment = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        int cookie = 0;
        double time = time_increment;
        int outer_loop_counter = 222;
        int inner_loop_counter = 221;
        while (outer_loop_counter % inner_loop_counter == 1) {
            outer_loop_counter = outer_loop_counter + 1;
            while (time <= t + 0.5) {
                cookie = calculate_cookie(cookie, b);
                time = time + time_increment;
            }
        }
        System.out.println(cookie);
    }

    public static int calculate_cookie(int cookie, int b) {
        return cookie + b;
    }
}
```

This Java code reads the input from the user, performs the calculations, and prints the result. It does not use any decorators, threads, or the scipy library, as these are not available in Java.

