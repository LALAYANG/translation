```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.Thread;

public class SumX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] numbers_c = new int[n];
        int x = 0;
        int y = 0;
        int z = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            numbers_c[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            x += a[i];
        }

        for (int i = 0; i < n; i++) {
            y += b[i];
        }

        for (int i = 0; i < n; i++) {
            z += numbers_c[i];
        }

        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - z));
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write the code in Java.
