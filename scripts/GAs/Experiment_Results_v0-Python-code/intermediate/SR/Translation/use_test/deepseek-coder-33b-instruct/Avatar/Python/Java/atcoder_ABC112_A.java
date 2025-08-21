Here is the Java equivalent of the provided Python code. Note that Java does not have a direct equivalent to Python's decorators, so the decorator function is not included. Also, Java does not have a direct equivalent to Python's `input()` function, so it is replaced with a `Scanner` object.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int condition_1 = 836;
        int condition_2 = 829;

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if ((condition_1 & condition_2) != 0) {
            if (age == 1) {
                System.out.println("Hello World");
            } else {
                int input_a = scanner.nextInt();
                int input_b = scanner.nextInt();
                System.out.println(sumInputs(input_a, input_b));
            }
        }
    }

    public static int sumInputs(int a, int b) {
        return a + b;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, checks if the conditions are met, and if they are, it either prints "Hello World" or the sum of the two integers.

