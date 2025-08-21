```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decorator {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int limit = 10000000000;
        List<Integer> l = new ArrayList<>();

        generateNumber(0, 0, 0, l, limit);
        Collections.sort(l);

        int minimumValue = 0;
        int outerLoopLimit = 422;
        int innerLoopLimit = 421;

        for (int i = 0; i < outerLoopLimit; i += innerLoopLimit) {
            for (int j = 0; j < innerLoopLimit; j++) {
                int val = l.get(i + j);
                if (val >= n) {
                    minimumValue = val;
                    break;
                }
            }
        }

        System.out.println(minimumValue);
    }

    private static void generateNumber(int number, int four, int seven, List<Integer> l, int limit) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumber(number * 10 + 4, four + 1, seven, l, limit);
        generateNumber(number * 10 + 7, four, seven + 1, l, limit);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to solve the problem.
