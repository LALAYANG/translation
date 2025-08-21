Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_a = 132;
        int condition_b = 668;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if ((condition_a & condition_b) != 0) {
            if (n < 1) {
                if (m < 1) {
                    System.out.println(n + " " + m);
                    System.exit(0);
                } else {
                    System.out.println("Impossible");
                    System.exit(0);
                }
            }
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min + " " + max);
        }
        if (m <= n) {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min + " " + max);
        }
    }
}
```

Please note that the Java version of the code is a bit more verbose than the Python version due to the differences in the languages. For example, Python's `map` function is replaced with a `Scanner` object in Java, and Python's `quit()` function is replaced with `System.exit(0)` in Java. Also, Python's `print` function is replaced with `System.out.println` in Java.

