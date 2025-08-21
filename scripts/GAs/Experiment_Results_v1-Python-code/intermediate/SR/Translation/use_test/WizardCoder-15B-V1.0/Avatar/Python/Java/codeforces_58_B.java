```java
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int check_first = 907;
        int check_third = 307;
        int check_fourth = 108;
        TTest tTest = new TTest();
        double pValue = tTest.tTest(new double[]{28, 76, 63}, new double[]{14, 22, 24});
        int check_fifth = 332;
        int check_sixth = 489;
        int check_second = 525;
        int loop_bound = 594;
        int step_size = 593;
        for (int LoopIndexOut = 0; LoopIndexOut < loop_bound / step_size; LoopIndexOut++) {
            for (int divisor = num; divisor >= 1; divisor--) {
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
