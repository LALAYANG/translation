
Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class MinimumSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int outer_loop_end = 418;
        int outer_loop_limit = 417;
        int condition_inner = 30;
        int condition_check_inner = 665;
        int condition_check_outer = 786;
        int condition_positive = 6;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if ((condition_check_outer & condition_positive) != 0) {
                    if ((condition_inner & condition_check_inner) != 0) {
                        if (lst[i] == 0) {
                            K--;
                        }
                    }
                }
                if (lst[i] > 0) {
                    lst_p[i] = lst[i];
                } else if (lst[i] < 0) {
                    lst_m[i] = lst[i];
                }
            }
            int p = 0;
            int m = 0;
            int x = 0;
            int y = lst_m.length - 1;
            int lastx = lst_p.length;
            int negative_list_size = lst_m.length;

            int calculate_minimum_sum(int k) {
                int ans = 1000000000;
                for (int j = 0; j < k + 1; j++) {
                    if (j > lastx || k - j > negative_list_size) {
                        continue;
                    }
                    if (j == 0) {
                        p = 0;
                    } else {
                        p = lst_p[j - 1];
                    }
                    if (k - j == 0) {
                        m = 0;
                    } else {
                        m = lst_m[negative_list_size - (k - j)];
                    }
                    ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
                }
                return ans;
            }
            System.out.println(calculate_minimum_sum(K));
        }
    }
}
```
Note that the Java code uses the `Math.min()` method to find the minimum of two values, and the `Math.abs()` method to find the absolute value of a number. The `continue` statement is used to skip the current iteration of the loop if the conditions are not met.
