```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value_1 = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((value_1 / z + 1) * z);
    }
}
```

This Java code reads two integers from the standard input, calculates the integer division of the first by the second (which is equivalent to the floor division in Python), adds 1, and then multiplies the result by the second integer. The result is printed to the standard output.

