Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        while (check) {
            if (hole >= b) {
                check = false;
            } else {
                hole = a * (i + 1) - i;
                i++;
            }
        }
        System.out.println(i);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, initializes a variable `hole` to 1 and a counter `i` to 0, and then enters a loop that continues until `hole` is greater than or equal to `b`. Inside the loop, it updates `hole` and `i`, and then prints `i` after the loop.

