```java
import java.util.Scanner;

public class Decorator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int secondInput = sc.nextInt();
        System.out.println(sumInputs(x, secondInput));
    }

    public static int sumInputs(int a, int b) {
        return a + b;
    }
}
```
Note: The `lambda` functions in the Python code are not needed in Java, as Java has built-in support for functional programming. The `map` and `reduce` functions in the Python code can be replaced with the `Stream` API in Java.
