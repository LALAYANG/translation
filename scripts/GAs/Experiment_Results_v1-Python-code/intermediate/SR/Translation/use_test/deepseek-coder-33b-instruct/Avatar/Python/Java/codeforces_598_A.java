```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        recursiveLoop(0, t, 1);
    }

    public static void recursiveLoop(int currentValue, int stop, int step) {
        if (step == 0 || (step > 0 && currentValue >= stop) || (step < 0 && currentValue <= stop)) {
            return;
        }
        int n = scanner.nextInt();
        System.out.println(calculateSum(n));
        recursiveLoop(currentValue + step, stop, step);
    }

    public static int calculateSum(int n) {
        int partialSum = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            partialSum -= 2 * t;
            t = t * 2;
        }
        return partialSum;
    }
}
```

Please note that the Java code does not include the decorator and the t-test functionality from the original Python code, as these are not available in Java. The t-test functionality can be implemented using libraries such as Apache Commons Math, but it is not included in this translation.

