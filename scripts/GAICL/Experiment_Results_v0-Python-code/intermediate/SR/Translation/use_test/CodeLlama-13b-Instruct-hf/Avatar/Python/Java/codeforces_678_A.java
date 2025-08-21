
Here is the Java code that produces the same output as the Python code:
```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int z = scanner.nextInt();
        int result = (value1 / z + 1) * z;
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses the `/` operator to divide `value1` by `z`, and the `+` operator to add 1 to the result. Finally, it uses the `*` operator to multiply the result by `z`. The `System.out.println()` method is used to print the result to the console.

Note that the Python code uses the `ttest_ind` function from the `scipy.stats` module, which is not available in Java. Therefore, the Java code does not use this function. Instead, it uses the `Scanner` class to read the input from the user, and then it performs the necessary calculations to produce the same output as the Python code.
