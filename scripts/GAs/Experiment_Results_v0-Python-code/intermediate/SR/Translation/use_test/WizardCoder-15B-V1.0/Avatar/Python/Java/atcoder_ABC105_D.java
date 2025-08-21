```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] variable_12_8 = {0, A};
        int[] cum_remainders = calculate_cumulative_remainders(M, variable_12_8, n);
        int remainder_counts = count_remainders(cum_remainders);
        int combinations = count_combinations(remainder_counts);
        System.out.println(combinations);
    }

    public static int[] calculate_cumulative_remainders(int M, int[] variable_12_8, int n) {
        int[] cum_remainders = new int[n];
        for (int i = 0; i < n; i++) {
            cum_remainders[i] = (variable_12_8[1][i] + variable_12_8[0][i]) % M;
        }
        for (int i = 1; i < n; i++) {
            cum_remainders[i] = (cum_remainders[i] + cum_remainders[i - 1]) % M;
        }
        return cum_remainders;
    }

    public static int count_remainders(int[] cum_remainders) {
        int remainder_counts = 0;
        for (int i = 0; i < cum_remainders.length; i++) {
            remainder_counts += cum_remainders[i] == 0 ? 1 : 0;
        }
        return remainder_counts;
    }

    public static int count_combinations(int remainder_counts) {
        int combinations = 0;
        for (int i = 1; i <= remainder_counts; i++) {
            combinations += i * (remainder_counts - i + 1) / 2;
        }
        return combinations;
    }
}
```
