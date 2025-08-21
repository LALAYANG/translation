```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        long leftOver = a - c;
        long takahashi = Math.max(0, leftOver);
        System.out.println(takahashi + " " + (takahashi > 0 ? b : Math.max(0, b - Math.abs(leftOver))));
    }
}
```

This Java code does the same thing as the Python code. It reads three long integers from the input, calculates the difference between the first and the third, and assigns this value to `leftOver`. Then it calculates the value of `takahashi` as the maximum of `0` and `leftOver`. Finally, it prints the values of `takahashi` and `b` (or `b - Math.abs(leftOver)` if `takahashi` is not greater than `0`) separated by a space.

