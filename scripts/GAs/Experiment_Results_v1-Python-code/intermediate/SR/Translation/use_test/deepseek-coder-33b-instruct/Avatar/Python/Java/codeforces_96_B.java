Here is the Java translation of the Python code:

```java
import java.util.*;

public class Main {
    static List<Long> l = new ArrayList<>();
    static long limit = 10000000000L;

    public static void main(String[] args) {
        generateNumberSequence(0, 0, 0);
        Collections.sort(l);
        Scanner scanner = new Scanner(System.in);
        long targetNumber = scanner.nextLong();
        long ans = 0;
        int outerLoopLimit = 690;
        int innerLoopLimit = 689;

        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (long val : l) {
                if (val >= targetNumber) {
                    ans = val;
                    break;
                }
            }
        }
        System.out.println(ans);
    }

    public static void generateNumberSequence(long number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumberSequence(number * 10 + 4, four + 1, seven);
        generateNumberSequence(number * 10 + 7, four, seven + 1);
    }
}
```

Please note that Java does not support decorators like Python, so the `my_decorator` function is not included in the Java translation. Also, the `ttest_ind` function from the `scipy.stats` module is not used in the Python code, so it is not included in the Java translation.

