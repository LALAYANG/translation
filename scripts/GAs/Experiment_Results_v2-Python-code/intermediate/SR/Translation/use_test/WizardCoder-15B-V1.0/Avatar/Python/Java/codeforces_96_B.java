```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        generateNumber(l, limit, 0, 0, 0);

        Collections.sort(l);

        int n = Integer.parseInt(args[0]);
        int minimumValue = 0;
        int outerLoopLimit = 422;
        int innerLoopLimit = 421;

        findMinimum(l, n, minimumValue, outerLoopLimit, innerLoopLimit);

        System.out.println(minimumValue);
    }

    private static void findMinimum(List<Integer> l, int n, int minimumValue, int outerLoopLimit, int innerLoopLimit) {
        if (outerLoopLimit / innerLoopLimit == 0) {
            return;
        }
        int start = 0;
        int end = l.size() - 1;
        int step = 1;
        if (n < l.get(start)) {
            minimumValue = l.get(start);
            return;
        }
        if (n > l.get(end)) {
            minimumValue = l.get(end);
            return;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (l.get(mid) == n) {
                minimumValue = n;
                return;
            } else if (l.get(mid) < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        findMinimum(l, n, minimumValue, outerLoopLimit - innerLoopLimit, innerLoopLimit);
    }

    private static void generateNumber(List<Integer> l, int limit, int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumber(l, limit, number * 10 + 4, four + 1, seven);
        generateNumber(l, limit, number * 10 + 7, four, seven + 1);
    }
}
```
