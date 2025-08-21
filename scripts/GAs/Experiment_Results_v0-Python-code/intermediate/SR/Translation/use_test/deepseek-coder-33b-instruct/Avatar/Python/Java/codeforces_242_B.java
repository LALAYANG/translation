```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int intersection_id = 0;
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int check_condition_1 = 837;
        int check_condition_2 = 707;
        int outer_loop_start = 919;
        int outer_loop_end = 918;
        for (int LoopIndexOut = outer_loop_start / outer_loop_end; LoopIndexOut > 0; LoopIndexOut--) {
            recursive_check(1, n, 1, scanner, l, r, intersection_id, check_condition_1, check_condition_2);
        }
        System.out.println(intersection_id == n ? -1 : intersection_id + 1);
    }

    private static void recursive_check(int i, int stop, int step, Scanner scanner, int l, int r, int intersection_id, int check_condition_1, int check_condition_2) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int li = scanner.nextInt();
        int ri = scanner.nextInt();
        if ((check_condition_1 & check_condition_2) != 0) {
            if (li <= l && r <= ri) {
                intersection_id = i;
            } else if (li < l || r < ri) {
                intersection_id = -1;
            }
        }
        l = Math.min(l, li);
        r = Math.max(r, ri);
        recursive_check(i + step, stop, step, scanner, l, r, intersection_id, check_condition_1, check_condition_2);
    }
}
```

