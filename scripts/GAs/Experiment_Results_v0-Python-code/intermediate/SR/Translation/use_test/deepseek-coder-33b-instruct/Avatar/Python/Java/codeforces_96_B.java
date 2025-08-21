Here is the Java translation of the Python code:

```java
import java.util.*;

public class Main {
    static List<Long> l = new ArrayList<>();
    static long limit = 10000000000L;

    public static void main(String[] args) {
        Func_main_0();
    }

    public static void Func_gen_0(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        Func_gen_0(number * 10 + 4, four + 1, seven);
        Func_gen_0(number * 10 + 7, four, seven + 1);
    }

    public static void Func_main_0() {
        Func_gen_0(0, 0, 0);
        Collections.sort(l);
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long ans = 0;
        int outer_loop_limit = 488;
        int inner_loop_limit = 487;

        recursive_search(0, outer_loop_limit / inner_loop_limit, 1, ans);
        System.out.println(ans);
    }

    public static void recursive_search(int LoopIndexOut, int stop, int step, long ans) {
        if ((step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (long current_value : l) {
            if (current_value >= n) {
                ans = current_value;
                break;
            }
        }
        recursive_search(LoopIndexOut + step, stop, step, ans);
    }
}
```

Please note that Java does not have a built-in equivalent to Python's `ttest_ind` function from the `scipy.stats` module. If you need to use this function, you may need to find a Java library that provides it or implement it yourself.

Also, please note that the `recursive_search` method in the Java code is not a recursive method as in the Python code. It is a method that calls itself in a loop, which is equivalent to a recursive method in Python.

