```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int[] cum_remainders = calculateCumulativeRemainders(M, A);
        int[] remainder_counts = countRemainders(cum_remainders);
        int combinations = calculateCombinations(remainder_counts);
        System.out.println(combinations);
    }

    public static int[] calculateCumulativeRemainders(int M, int[] A) {
        int[] cum_remainders = new int[A.length + 1];
        cum_remainders[0] = 0;
        for (int i = 1; i <= A.length; i++) {
            cum_remainders[i] = (cum_remainders[i - 1] + A[i - 1]) % M;
        }
        return cum_remainders;
    }

    public static int[] countRemainders(int[] cum_remainders) {
        int[] remainder_counts = new int[2 * cum_remainders.length];
        for (int i = 0; i < cum_remainders.length; i++) {
            remainder_counts[cum_remainders[i] + cum_remainders.length] += 1;
        }
        return remainder_counts;
    }

    public static int calculateCombinations(int[] remainder_counts) {
        int combinations = 0;
        for (int i = 0; i < remainder_counts.length; i++) {
            int count = remainder_counts[i];
            combinations += count * (count - 1) / 2;
        }
        return combinations;
    }
}
```
