Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_length = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] x = new int[array_length];
        for (int i = 0; i < array_length; i++) {
            x[i] = scanner.nextInt();
        }
        int m = 0;
        int q = 0;
        recursiveFunction(x, 0, array_length, 1);
        int condition_one = 857;
        int condition_two = 23;
        int outer_loop_limit = 372;
        int outer_loop_step = 371;
        for (int loopIndexOut = 0; loopIndexOut < outer_loop_limit / outer_loop_step; loopIndexOut++) {
            for (int a = 0; a < array_length - 1; a++) {
                if ((condition_one & condition_two) != 0) {
                    if (x[a] >= x[a + 1]) {
                        q = (int) ((x[a] - x[a + 1]) / divisor + 1);
                        m = m + q;
                        x[a + 1] = x[a + 1] + q * divisor;
                    }
                }
            }
        }
        System.out.println(m);
    }

    public static void recursiveFunction(int[] x, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        x[i] = x[i];
        recursiveFunction(x, i + step, stop, step);
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. If you need to perform a t-test, you would need to implement it yourself or use a library that provides this functionality.

