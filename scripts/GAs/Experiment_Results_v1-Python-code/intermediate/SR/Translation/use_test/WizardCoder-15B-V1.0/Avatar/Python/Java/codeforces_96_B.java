```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        int limit = 10000000000;

        generateNumberSequence(l, limit, 0, 0, 0);
        Collections.sort(l);
        int targetNumber = Integer.parseInt(args[0]);
        int ans = 0;
        int outerLoopLimit = 690;
        int innerLoopLimit = 689;

        searchLoop(l, targetNumber, ans, outerLoopLimit, innerLoopLimit, 0, 1);
        System.out.println(ans);
    }

    public static void generateNumberSequence(List<Integer> l, int limit, int number, int four, int seven) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        generateNumberSequence(l, limit, number * 10 + 4, four + 1, seven);
        generateNumberSequence(l, limit, number * 10 + 7, four, seven + 1);
    }

    public static void searchLoop(List<Integer> l, int targetNumber, int ans, int outerLoopLimit, int innerLoopLimit, int loopIndexOut, int step) {
        if (step == 0 || (step > 0 && loopIndexOut >= outerLoopLimit) || (step < 0 && loopIndexOut <= outerLoopLimit)) {
            return;
        }
        for (int val : l) {
            if (val >= targetNumber) {
                ans = val;
                break;
            }
        }
        searchLoop(l, targetNumber, ans, outerLoopLimit, innerLoopLimit, loopIndexOut + step, step);
    }
}
```
