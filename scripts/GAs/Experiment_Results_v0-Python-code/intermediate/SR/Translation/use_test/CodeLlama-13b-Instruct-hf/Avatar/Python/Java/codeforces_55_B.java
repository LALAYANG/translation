
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = scanner.nextInt();
        int t = scanner.nextInt();
        int result = currentNumber + t;
        System.out.println(result);
    }
}
```
This code takes two integers as input from the user and calculates the sum of the two numbers. The result is then printed to the console.

Note that the code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print the result to the console.
