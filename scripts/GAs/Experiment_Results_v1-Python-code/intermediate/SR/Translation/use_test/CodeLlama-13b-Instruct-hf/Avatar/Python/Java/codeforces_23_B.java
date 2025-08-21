
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MyDecorator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int outerLoopLimit = 982;
        int innerLoopLimit = 981;
        for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopLimit; outerLoopIndex++) {
            recursiveFunction(0, limit, 1);
        }
    }

    public static void recursiveFunction(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int userInput = scanner.nextInt();
        if (userInput < 2) {
            System.out.println(0);
        } else {
            System.out.println(userInput - 2);
        }
        recursiveFunction(i + step, stop, step);
    }
}
```
Note that the `my_decorator` function in Python is not needed in Java, as the `recursiveFunction` method is already recursive. Also, the `shuffle` function in Python is not needed in Java, as the `Arrays.asList` method can be used to create a list of random integers.
