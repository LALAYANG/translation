Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int check_first = 907;
        int check_third = 307;
        int check_fourth = 108;
        int check_fifth = 332;
        int check_sixth = 489;
        int check_second = 525;
        int loop_bound = 594;
        int step_size = 593;

        for (int LoopIndexOut = loop_bound / step_size; LoopIndexOut >= 0; LoopIndexOut--) {
            for (int divisor = num; divisor > 0; divisor--) {
                if ((check_sixth & check_second) != 0) {
                    if ((check_fourth & check_fifth) != 0) {
                        if ((check_first & check_third) != 0) {
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

Please note that the Java version of the code does not include the t-test function from the scipy.stats module, as there is no direct equivalent in Java. If you need to perform a t-test in Java, you may need to use a library such as Apache Commons Math or a statistical software package.

