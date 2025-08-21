Here is the Java equivalent of the provided Python code:

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 74;
        String s = "";
        String luckyString = "abcd";
        recursiveLoop(0, n, 1, s, luckyString);
        System.out.println(s);
    }

    public static int moduloOperator(int a, int b) {
        return a % b;
    }

    public static void recursiveLoop(int i, int stop, int step, String s, String luckyString) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        s += luckyString.charAt(moduloOperator(i, 4));
        List<Integer> list = Arrays.asList(28, 72, 50, 19, 7, 23);
        Collections.shuffle(list);
        recursiveLoop(i + step, stop, step, s, luckyString);
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses the `datetime`, `sklearn`, and `scipy` libraries, which are not available in Java. The `ttest_ind` function from `scipy.stats` is not used in the Java code. The `shuffle` function from `sklearn.utils` is replaced with `Collections.shuffle` in Java. The `input` function is replaced with a hardcoded value in the Java code.

