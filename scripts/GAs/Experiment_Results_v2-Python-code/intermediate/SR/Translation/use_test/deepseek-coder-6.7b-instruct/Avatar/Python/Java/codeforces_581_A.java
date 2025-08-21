Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = scanner.nextInt();
        int secondInput = scanner.nextInt();
        System.out.println(Math.min(firstInput, secondInput) + " " + differenceFunction(Math.max(firstInput, secondInput), Math.min(firstInput, secondInput)) / 2);
    }

    public static int differenceFunction(int a, int b) {
        return a - b;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the difference between them and prints the result. The difference is calculated by the `differenceFunction` method.

Please note that the `ttest_ind` function from the `scipy.stats` module and the `numpy` library are not used in this code. These are Python-specific functions and cannot be translated to Java.

