```java
import java.util.*;

class Main {
    static List<Integer> l = new ArrayList<>();
    static int limit = 1000000000;

    static void Func_gen_0(int number, int four, int seven) {
        if (number > limit)
            return;
        if (number > 0 && four == seven)
            l.add(number);
        Func_gen_0(number * 10 + 4, four + 1, seven);
        Func_gen_0(number * 10 + 7, four, seven + 1);
    }

    static void Func_main_0() {
        Func_gen_0(0, 0, 0);
        Collections.sort(l);
        int n = new Scanner(System.in).nextInt();
        int ans = 0;
        int outer_loop_limit = 488;
        int inner_loop_limit = 487;

        for (int LoopIndexOut = 0, stop = outer_loop_limit / inner_loop_limit, step = 1;
             step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop);
             LoopIndexOut += step) {
            for (int current_value : l) {
                if (current_value >= n) {
                    ans = current_value;
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Func_main_0();
    }
}
```

Please note that the Python code uses the `scipy.stats.ttest_ind` function for a two-sample t-test, which is not available in Java. If you need to perform a similar operation, you would need to implement the t-test algorithm yourself or use a library that provides this functionality.

