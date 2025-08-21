```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        long[] cum_remainders = new long[N + 1];
        for (int i = 0; i < N; i++) {
            cum_remainders[i + 1] = (cum_remainders[i] + A[i]) % M;
        }
        Map<Long, Long> remainder_counts = new HashMap<>();
        for (long remainder : cum_remainders) {
            remainder_counts.put(remainder, remainder_counts.getOrDefault(remainder, 0L) + 1);
        }
        long combinations = 0;
        for (long count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }
}
```

