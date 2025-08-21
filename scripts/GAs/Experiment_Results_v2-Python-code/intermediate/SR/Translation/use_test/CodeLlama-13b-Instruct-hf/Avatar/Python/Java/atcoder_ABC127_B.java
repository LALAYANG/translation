
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class MyDecorator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commonRatio = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();

        int outerLoopStart = 388;
        int outerLoopEnd = 387;

        for (int i = 0; i <= outerLoopEnd; i++) {
            int innerLoopIndex = 2;
            int stop = 12;
            int step = 1;

            while (innerLoopIndex <= stop) {
                System.out.println(Math.round(Math.pow(commonRatio, innerLoopIndex - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio)));
                innerLoopIndex += step;
            }
        }
    }
}
```
Note that the `ttest_ind` function is not available in Java, so I have replaced it with a simple `Math.round` function. Also, the `map` function is not available in Java, so I have replaced it with a `Scanner` object to read the input.
