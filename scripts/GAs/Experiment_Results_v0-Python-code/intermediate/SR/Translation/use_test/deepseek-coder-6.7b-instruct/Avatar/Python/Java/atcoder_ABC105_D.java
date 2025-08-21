```java
import java.util.*;
import java.math.*;

class Main {
    static int M;
    static BigInteger[] A;
    static BigInteger[] variable_12_8;
    static BigInteger[] cum_remainders;
    static int[] remainder_counts;
    static int combinations;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        M = scanner.nextInt();
        int n = scanner.nextInt();
        A = new BigInteger[n];
        variable_12_8 = new BigInteger[n+1];
        cum_remainders = new BigInteger[n+1];
        remainder_counts = new int[M];
        for (int i = 0; i < n; i++) {
            A[i] = new BigInteger(scanner.next());
        }
        variable_12_8[0] = BigInteger.valueOf(0);
        variable_12_8[1] = A[0];
        cum_remainders[0] = BigInteger.valueOf(0);
        cum_remainders[1] = A[0].mod(BigInteger.valueOf(M));
        for (int i = 2; i <= n; i++) {
            variable_12_8[i] = A[i-1];
            cum_remainders[i] = variable_12_8[i].mod(BigInteger.valueOf(M));
        }
        for (int i = 0; i < n+1; i++) {
            remainder_counts[cum_remainders[i].mod(BigInteger.valueOf(M)).intValue()]++;
        }
        calculate_combinations(0, 520, 1);
        System.out.println(combinations);
    }

    static void calculate_combinations(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int count : remainder_counts) {
            combinations += count * (count - 1) / 2;
        }
        calculate_combinations(LoopIndexOut + step, stop, step);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the cumulative remainders, counts the occurrences of each remainder, and then calculates the combinations based on the counts. The main difference is that Java uses BigInteger for large numbers and arrays instead of lists, and it uses a for-each loop to iterate over the array of counts.

