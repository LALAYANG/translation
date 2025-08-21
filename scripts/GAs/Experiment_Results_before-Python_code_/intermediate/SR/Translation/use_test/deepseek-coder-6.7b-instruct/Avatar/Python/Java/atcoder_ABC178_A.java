```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        solve(tc);
    }

    public static void solve(int tc) {
        if (tc == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then calls the `solve` method with this integer as an argument. The `solve` method checks if the integer is 0, and if it is, it prints 1. If the integer is not 0, it prints 0.

