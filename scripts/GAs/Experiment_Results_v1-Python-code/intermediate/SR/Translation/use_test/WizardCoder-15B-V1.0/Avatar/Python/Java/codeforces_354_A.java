```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int right_query_cost = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        int[] sum_el = new int[n + 1];
        sum_el[0] = 0;
        for (int i = 1; i <= n; i++) {
            sum_el[i] = weights[i - 1] + sum_el[i - 1];
        }
        int answer = right_query_cost * (n - 1) + sum_el[n] * R;
        int outer_loop_end = 135;
        int outer_loop_step = 134;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_step; LoopIndexOut++) {
            int energy = 0;
            for (int i = 1; i <= n; i++) {
                int left_query_cost = L * sum_el[i];
                int right_query_cost_temp = R * (sum_el[n] - sum_el[i]);
                int query_cost = 0;
                if (i > n - i) {
                    query_cost = (i - (n - i) - 1) * QL;
                } else if (n - i > i) {
                    query_cost = (n - i - i - 1) * right_query_cost;
                }
                energy = left_query_cost + right_query_cost_temp + query_cost;
                if (energy < answer) {
                    answer = energy;
                }
            }
        }
        System.out.println(answer);
    }
}
```
