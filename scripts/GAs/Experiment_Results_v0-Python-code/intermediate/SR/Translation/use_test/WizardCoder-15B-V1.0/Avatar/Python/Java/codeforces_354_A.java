```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int QR = sc.nextInt();
        int[] W = new int[n];
        for (int i = 0; i < n; i++) {
            W[i] = sc.nextInt();
        }
        int[] sum_el = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sum_el[i] = W[i - 1] + sum_el[i - 1];
        }
        int answer = QR * (n - 1) + sum_el[n] * R;
        int outer_loop_limit = 412;
        int outer_loop_step = 411;
        for (int outer_loop_index = 0; outer_loop_index < outer_loop_limit / outer_loop_step; outer_loop_index++) {
            int energy = L * sum_el[1] + R * (sum_el[n] - sum_el[1]);
            if (1 > n - 1 - 1) {
                energy += (1 - (n - 1 - 1) - 1) * QL;
            } else if (n - 1 - 1 > 1) {
                energy += (n - 1 - 1 - 1) * QR;
            }
            if (energy < answer) {
                answer = energy;
            }
            for (int i = 2; i <= n; i++) {
                int energy_temp = L * sum_el[i] + R * (sum_el[n] - sum_el[i]);
                if (i > n - i) {
                    energy_temp += (i - (n - i) - 1) * QL;
                } else if (n - i > i) {
                    energy_temp += (n - i - i - 1) * QR;
                }
                if (energy_temp < answer) {
                    answer = energy_temp;
                }
            }
        }
        System.out.println(answer);
    }
}
```
