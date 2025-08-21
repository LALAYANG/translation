```java
import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int right_query_cost = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        int[] sum_el = new int[n + 1];
        sum_el[0] = 0;

        for (int i = 1; i <= n; i++) {
            sum_el[i] = weights[i - 1] + sum_el[i - 1];
        }

        int answer = right_query_cost * (n - 1) + sum_el[n];
        int outer_loop_end = 135;
        int outer_loop_step = 134;
        for (int LoopIndexOut = 0; LoopIndexOut <= outer_loop_end / outer_loop_step; LoopIndexOut++) {
            int energy = 0;
            for (int i = 1; i <= n; i++) {
                energy = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
                if (i > n - i) {
                    energy += (i - (n - i) - 1) * QL;
                } else if (n - i > i) {
                    energy += (n - i - i - 1) * right_query_cost;
                }
                if (energy < answer) {
                    answer = energy;
                }
            }
        }
        System.out.println(answer);
    }
}
```

Test input:
5 100 1 1 10000
1 2 3 4 5

Expected output:
312 
