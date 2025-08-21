Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sa = n - scanner.next().length();
        sa = Math.min(sa, n - sa);
        List<String> ss = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            b -= a;
            ss.add(((b % 2 == 1) && (b <= sa * 2)) ? "1\n" : "0\n");
        }
        System.out.print(String.join("", ss));
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the number of "-" characters in the input, and then checks for each pair of numbers if the difference is odd and less than or equal to twice the number of "-" characters. The result is printed line by line.

