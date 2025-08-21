
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int checkFirst = 907;
        int checkThird = 307;
        int checkFourth = 108;
        int checkFifth = 332;
        int checkSixth = 489;
        int checkSecond = 525;
        int loopBound = 594;
        int stepSize = 593;

        for (int LoopIndexOut = 0; LoopIndexOut < loopBound / stepSize; LoopIndexOut++) {
            for (int divisor = num; divisor > 0; divisor--) {
                if ((checkSixth & checkSecond) != 0) {
                    if ((checkFourth & checkFifth) != 0) {
                        if ((checkFirst & checkThird) != 0) {
                            if (num % divisor == 0) {
                                num = divisor;
                                System.out.print(divisor + " ");
                            }
                        }
                    }
                }
            }
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.print()` method to print the output. The `if` statements are used to check the conditions and the `for` loops are used to iterate over the values.
