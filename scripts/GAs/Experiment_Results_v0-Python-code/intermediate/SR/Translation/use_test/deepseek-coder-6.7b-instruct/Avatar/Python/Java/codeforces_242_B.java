```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int intersectionId = 0;
        final int CHECK_CONDITION_1 = 837;
        final int CHECK_CONDITION_2 = 707;
        final int OUTER_LOOP_START = 919;
        final int OUTER_LOOP_END = 918;
        for (int loopIndexOut = 0; loopIndexOut < OUTER_LOOP_START / OUTER_LOOP_END; loopIndexOut++) {
            recursiveCheck(1, n, 1, l, r, intersectionId, CHECK_CONDITION_1, CHECK_CONDITION_2);
        }
        System.out.println(intersectionId == n ? -1 : intersectionId + 1);
    }

    public static void recursiveCheck(int i, int stop, int step, int l, int r, int intersectionId, int checkCondition1, int checkCondition2) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int li = scanner.nextInt();
        int ri = scanner.nextInt();
        if ((li <= l && r <= ri) || (li < l || r < ri)) {
            intersectionId = i;
        }
        l = Math.min(l, li);
        r = Math.max(r, ri);
        recursiveCheck(i + step, stop, step, l, r, intersectionId, checkCondition1, checkCondition2);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` and two integers `l` and `r` from the standard input. Then it enters a loop that iterates `OUTER_LOOP_START / OUTER_LOOP_END` times. In each iteration, it calls the `recursiveCheck` method, which reads two integers `li` and `ri` from the standard input and updates `l`, `r`, and `intersectionId` accordingly. Finally, it prints `-1` if `intersectionId` is equal to `n`, otherwise it prints `intersectionId + 1`.

