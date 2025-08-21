Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.min(a, b) + " " + (Math.max(a, b) - Math.min(a, b)) / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the minimum and maximum of the two, and then prints the minimum followed by the difference between the maximum and minimum divided by 2.

