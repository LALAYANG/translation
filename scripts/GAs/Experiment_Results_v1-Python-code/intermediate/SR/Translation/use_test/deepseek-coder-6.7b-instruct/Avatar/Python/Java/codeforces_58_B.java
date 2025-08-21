Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
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

        for (int i = 0; i < loopBound / stepSize; i++) {
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

Please note that the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

