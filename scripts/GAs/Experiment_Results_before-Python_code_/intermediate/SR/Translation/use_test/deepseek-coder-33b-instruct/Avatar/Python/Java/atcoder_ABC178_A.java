Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            solve(scanner, tc);
            tc += 1;
        }
    }

    public static void solve(Scanner scanner, int tc) {
        int a = scanner.nextInt();
        System.out.println(a == 0 ? 1 : 0);
    }
}
```

Please note that in Java, you need to import the `Scanner` class from the `java.util` package to read input from the console. The `solve` method takes a `Scanner` object and an integer as parameters, and it reads an integer from the console and prints `1` if the integer is `0`, and `0` otherwise. The `main` method creates a `Scanner` object and calls the `solve` method in a loop until the test case count is reached.

