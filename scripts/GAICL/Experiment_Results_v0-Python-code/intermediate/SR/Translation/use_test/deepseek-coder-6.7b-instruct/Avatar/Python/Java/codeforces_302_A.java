Here is the Java equivalent of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_elements = scanner.nextInt();
        int num_queries = scanner.nextInt();
        int sa = scanner.nextInt();
        for (int i = 0; i < num_queries; i++) {
            int value_a = scanner.nextInt();
            int b = scanner.nextInt();
            b = subtract(b, value_a);
            sa = Math.min(num_elements - sa, sa);
            System.out.println((b % 2 == 0 || b > sa * 2) ? "0" : "1");
        }
    }

    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }
}
```

This Java code does the same thing as your Python code. It reads the number of elements and queries, and the count of '-' in the input. Then it reads the queries and subtracts the first number from the second. It then checks if the result is even or greater than twice the minimum count of '-'. If it is, it prints '0', otherwise it prints '1'.

