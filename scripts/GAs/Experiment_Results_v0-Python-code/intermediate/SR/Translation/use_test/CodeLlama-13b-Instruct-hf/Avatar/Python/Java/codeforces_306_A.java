
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class PythonToJava {

    public static void main(String[] args) {
        // Declare variables
        int n = 81;
        int m = 27;
        int q = 0;
        int remainder = 0;
        int loopIterations = 0;
        int maximumLoopCounter = 0;
        List<Integer> a = Lists.newArrayList();

        // Perform integer division
        q = integerDivision(m, n);
        remainder = n % m;

        // Initialize array
        for (int i = 0; i < m; i++) {
            a.add(q);
        }

        // Perform recursive step
        recursiveStep(0, remainder, 1);

        // Print array
        for (int i = 0; i < m; i++) {
            System.out.print(a.get(i) + " ");
        }
    }

    public static int integerDivision(int m, int n) {
        return n / m;
    }

    public static void recursiveStep(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a.set(i, a.get(i) + 1);
        recursiveStep(i + step, stop, step);
    }
}
```
Note that this code assumes that the input values for `n` and `m` are provided as command-line arguments. If you want to use a different input method, you will need to modify the `main` method accordingly.
