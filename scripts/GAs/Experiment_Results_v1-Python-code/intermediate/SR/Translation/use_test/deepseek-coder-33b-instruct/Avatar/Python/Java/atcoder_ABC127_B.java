Here is the Java translation of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int common_ratio = scanner.nextInt();
        int principal = scanner.nextInt();
        int x = scanner.nextInt();
        int outer_loop_limit = 223;
        int divisor = 222;

        outer_loop(0, outer_loop_limit / divisor, 1, common_ratio, principal, x);
    }

    public static void outer_loop(int LoopIndexOut, int stop, int step, int common_ratio, int principal, int x) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }

        inner_loop(2, 12, 1, common_ratio, principal, x);
        outer_loop(LoopIndexOut + step, stop, step, common_ratio, principal, x);
    }

    public static void inner_loop(int i, int stop, int step, int common_ratio, int principal, int x) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        System.out.println((int) (Math.pow(common_ratio, i - 1) * (x + principal / (1 - common_ratio)) - principal / (1 - common_ratio)));
        inner_loop(i + step, stop, step, common_ratio, principal, x);
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a t-test on two independent samples. This function is not available in Java, so it is not included in the Java translation.

