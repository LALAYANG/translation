Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
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

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the number of cookies produced by the baker, and prints the result. The while loop continues until the time is greater than or equal to the target time plus 0.5.

