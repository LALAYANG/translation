```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int initial_value = scanner.nextInt();
        int max_difference = 0;
        int[] shuffled = {10, 24, 31};
        int outer_loop_limit = 670;
        int inner_loop_limit = 669;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < n; i++) {
                int current_value = scanner.nextInt();
                int t = scanner.nextInt();
                int result_diff = calculate_diff(initial_value, t, current_value, shuffled);
                if (result_diff > max_difference) {
                    max_difference = result_diff;
            }
        }
        System.out.println(initial_value + max_difference);
    }

    public static int calculate_diff(int initial_value, int t, int current_value, int[] shuffled) {
        return t - (initial_value - current_value);
    }
}
``` 
