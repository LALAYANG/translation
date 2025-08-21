```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int initial_value = sc.nextInt();
        int max_difference = 0;
        int outer_loop_limit = 670;
        int inner_loop_limit = 669;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int current_value = sc.nextInt();
                int t = sc.nextInt();
                int result_diff = calculate_diff(initial_value, t, current_value);
                if (result_diff > max_difference) {
                    max_difference = result_diff;
                }
            }
        }
        System.out.println(initial_value + max_difference);
    }

    public static int calculate_diff(int initial_value, int t, int current_value) {
        return t - (initial_value - current_value);
    }
}
```
