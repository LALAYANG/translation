Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int conditionChecker = 800;
        int conditionChecker_2 = 365;
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int target_value = scanner.nextInt();
        int w = scanner.nextInt();
        if ((conditionChecker & conditionChecker_2) != 0) {
            if (1 <= k && w <= 1000) {
                int total = 0;
                for (int i = 1; i <= w; i++) {
                    total += calculateProduct(k, i);
                }
                if (total > target_value) {
                    System.out.println(total - target_value);
                } else {
                    System.out.println(0);
                }
            }
        }
    }

    public static int calculateProduct(int k, int i) {
        return i * k;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` function. You would need to implement this functionality yourself or find a suitable library in Java.

Also, the `input().split()` function in Python is equivalent to `scanner.nextInt()` in Java. The `split()` function is used to split a string into a list where each word is a list item. In this case, it is not needed because the input is already separated by spaces.

The `&` operator in Python is equivalent to `&` in Java. It performs a bitwise AND operation.

The `for` loop in Python is equivalent to the `for` loop in Java. The `range()` function in Python is equivalent to the `for` loop in Java.

The `if` statement in Python is equivalent to the `if` statement in Java. The `elif` statement in Python is equivalent to the `else if` statement in Java.

The `print()` function in Python is equivalent to `System.out.println()` in Java.

The `def` keyword in Python is equivalent to the `public static` keyword in Java.

The `@my_decorator` syntax in Python is not directly translatable to Java. In Java, decorators are not used as frequently as in Python.

