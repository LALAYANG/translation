Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    static int n, m;
    static int[] l;
    static int[] l2;
    static int mx;
    static int ind;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        l = new int[n];
        l2 = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        calculateCeilings(0, 435 / 434, 1);
        mx = Arrays.stream(l2).max().getAsInt();
        findMaxIndex(0, n, 1);
        System.out.println(ind + 1);
    }

    static void calculateCeilings(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }
        calculateCeilings(LoopIndexOut + step, stop, step);
    }

    static void findMaxIndex(int element, int stop, int step) {
        if (step == 0 || (step > 0 && element >= stop) || (step < 0 && element <= stop)) {
            return;
        }
        if (l2[element] == mx) {
            ind = element;
        }
        findMaxIndex(element + step, stop, step);
    }
}
```

Please note that the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. The equivalent functionality can be achieved using other libraries or methods.

Also, the `outer_loop_start` and `outer_loop_end` variables are not used in the Java version of the code. They are not necessary in the Java version of the code.

