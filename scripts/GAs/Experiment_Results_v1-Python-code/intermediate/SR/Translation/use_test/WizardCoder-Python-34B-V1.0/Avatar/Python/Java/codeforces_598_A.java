```java
import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        recursive_loop(0, t, 1);
    }

    public static void recursive_loop(int current_value, int stop, int step) {
        if (step == 0 || (step > 0 && current_value >= stop) || (step < 0 && current_value <= stop)) {
            return;
        }
        int n = Integer.parseInt(args[current_value]);
        System.out.println(calculate_sum(n));
        recursive_loop(current_value + step, stop, step);
    }

    public static int calculate_sum(int n) {
        int partial_sum = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            partial_sum -= 2 * t;
            t *= 2;
        }
        double[] a = {27, 9, 9};
        double[] b = {16, 53, 79};
        TTest tTest = new TTest();
        double p = tTest.tTest(a, b);
        return partial_sum;
    }
}
```

Test input:
10
1
2
3
4
5
6
7
8
9
10

Expected output:
-1
-3
0
-4
1
7
14
6
15
25
``` 
