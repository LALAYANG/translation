```java
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        int[] cum_remainders = calculate_cumulative_remainders(M, A);
        Map<Integer, Integer> remainder_counts = countRemainders(cum_remainders);
        int combinations = 0;
        int inner_loop_limit = 521;
        int outer_loop_limit = 520;
        calculate_combinations(combinations, inner_loop_limit, outer_loop_limit, remainder_counts);
        System.out.println(combinations);
    }

    public static int[] calculate_cumulative_remainders(int M, int[] A) {
        int[] cum_remainders = new int[A.length + 1];
        cum_remainders[0] = 0;
        for (int i = 1; i <= A.length; i++) {
            cum_remainders[i] = (cum_remainders[i - 1] + A[i - 1]) % M;
        }
        return cum_remainders;
    }

    public static Map<Integer, Integer> countRemainders(int[] cum_remainders) {
        return Arrays.stream(cum_remainders).boxed().collect(Collectors.toMap(x -> x, x -> 1, Integer::sum);
    }

    public static void calculate_combinations(int combinations, int inner_loop_limit, int outer_loop_limit, Map<Integer, Integer> remainder_counts) {
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
    }
}
```

The equivalent Java program is given above. The `calculate_cumulative_remainders` function has been modified to take an array `A` as input and return an array `cum_remainders`. The `countRemainders` function is used to count the number of occurrences of each remainder in the `cum_remainders` array. The `calculate_combinations` function has been modified to take the `remainder_counts` map as an input and update the `combinations` variable directly. The `my_decorator` function is not required in Java, as it does not affect the functionality of the program. The `shuffle` function from `sklearn.utils` is not available in Java, so it has been removed. The `ttest_ind` function from `scipy.stats` is not used in the given code, so it has been removed as well. 
