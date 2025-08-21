Here is the Java translation of the Python code:

```java
import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    static int n, L, R, QL, QR;
    static int[] W;
    static int[] sum_el;
    static int answer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        L = scanner.nextInt();
        R = scanner.nextInt();
        QL = scanner.nextInt();
        QR = scanner.nextInt();
        W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = scanner.nextInt();
        }
        sum_el = new int[n + 1];
        calculate_cumulative_sum(1, n + 1, 1);
        answer = QR * (n - 1) + sum_el[n] * R;
        int outer_loop_limit = 412;
        int outer_loop_step = 411;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            calculate_energy(1, n + 1, 1);
        }
        System.out.println(answer);
    }

    public static void calculate_cumulative_sum(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        sum_el[i] = W[i - 1] + sum_el[i - 1];
        TTest tTest = new TTest();
        tTest.tTest(new double[]{42, 71, 96}, new double[]{97, 54, 40});
        calculate_cumulative_sum(i + step, stop, step);
    }

    static int energy;

    public static void calculate_energy(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
        if (i > n - i) {
            energy = energy + (i - (n - i) - 1) * QL;
        } else if (n - i > i) {
            energy = energy + (n - i - i - 1) * QR;
        }
        if (energy < answer) {
            answer = energy;
        }
        calculate_energy(i + step, stop, step);
    }
}
```

Please note that the `ttest_ind` function from `scipy.stats` is not available in Java. I have used the `TTest` class from the Apache Commons Math library instead.

Also, the `my_decorator` function is not used in the Python code, so it is not included in the Java translation.

