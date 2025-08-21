```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String a = scanner.nextLine();
        System.out.println(solve(a));
    }

    public static int solve(String a) {
        if (!a.contains("1")) {
            return 0;
        }
        String[] split = a.split("1");
        int product = 1;
        for (String s : split) {
            product *= s.length() + 1;
        }
        return product;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, checks if there is a "1" in the string, if not it returns 0. If there is a "1", it splits the string by "1" and calculates the product of the lengths of the substrings plus one.

