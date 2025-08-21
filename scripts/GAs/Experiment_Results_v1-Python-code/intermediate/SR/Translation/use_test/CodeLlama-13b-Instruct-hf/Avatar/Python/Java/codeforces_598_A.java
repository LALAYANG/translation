
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MyDecorator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        @MyDecorator
        public static int calculateSum(int n) {
            int partialSum = (1 + n) * n / 2;
            int t = 1;
            while (t <= n) {
                partialSum -= 2 * t;
                t = t * 2;
            }
            return partialSum;
        }

        public static void recursiveLoop(int currentValue, int stop, int step) {
            if (step == 0 || (step > 0 && currentValue >= stop) || (step < 0 && currentValue <= stop)) {
                return;
            }
            int n = scanner.nextInt();
            System.out.println(calculateSum(n));
            recursiveLoop(currentValue + step, stop, step);
        }

        recursiveLoop(0, t, 1);
    }
}
```
Note that the `my_decorator` function is not implemented in Java, as it is not a standard Python decorator. The `@MyDecorator` annotation is used to indicate that the `calculateSum` function should be decorated with the `my_decorator` function.

Also, the `ttest_ind` function is not implemented in Java, as it is not a standard Python function. The `scipy.stats` module is not available in Java, so you will need to find an alternative way to perform the t-test.

Finally, the `shuffle` function is not implemented in Java, as it is not a standard Python function. The `random` module is not available in Java, so you will need to find an alternative way to shuffle the array.
