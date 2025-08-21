Here is the Java version of the Python code:

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

This Java program does the same thing as the Python code. It reads an integer from the user, then iterates from that number down to 1, checking if the current number is a divisor of the original number. If it is, it prints that number and sets the current number as the new number to check.

