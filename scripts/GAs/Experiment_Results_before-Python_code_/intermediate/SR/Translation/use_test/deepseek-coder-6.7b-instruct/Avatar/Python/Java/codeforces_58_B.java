```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                n = i;
                System.out.print(i + " ");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then iterates from that number down to 1. If the current number is a divisor of the original number, it prints that number and updates the value of `n` to the current number.

