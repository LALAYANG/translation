```java
import java.util.Scanner;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(calculateSum(x, y));
    }

    public static int calculateSum(int x, int y) {
        return sumD(x, y);
    }

    public static int sumD(int x, int y) {
        return sumC(x, y);
    }

    public static int sumC(int x, int y) {
        return sumB(x, y);
    }

    public static int sumB(int x, int y) {
        return sumA(x, y);
    }

    public static int sumA(int x, int y) {
        return sumE(x, y);
    }

    public static int sumE(int x, int y) {
        return x + y;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print output to the console. The `calculateSum()` method is the main method that calls the other methods to calculate the sum of two numbers. The `sumD()`, `sumC()`, `sumB()`, `sumA()`, and `sumE()` methods are the same as the Python methods you provided, but implemented in Java.
