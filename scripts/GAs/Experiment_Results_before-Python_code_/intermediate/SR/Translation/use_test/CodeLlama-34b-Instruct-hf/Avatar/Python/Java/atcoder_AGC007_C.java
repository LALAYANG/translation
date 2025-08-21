```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N--;
        }

        System.out.println(ret);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write this code in Java.
