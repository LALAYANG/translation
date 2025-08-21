Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i = 1;
        while (m >= i) {
            m -= i;
            i = (i % n) + 1;
        }
        System.out.println(m);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, then it subtracts `i` from `m` in a loop until `m` is less than `i`. After that, it prints the value of `m`. The variable `i` is reset to 1 after each subtraction, and it is incremented by 1 after each subtraction. The loop continues until `m` is less than `i`.

