```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] cum_remainders = new int[N + 1];
        cum_remainders[0] = 0;
        for (int i = 0; i < N; i++) {
            cum_remainders[i + 1] = (cum_remainders[i] + A[i]) % M;
        }
        Map<Integer, Integer> remainder_counts = new HashMap<>();
        for (int r : cum_remainders) {
            remainder_counts.put(r, remainder_counts.getOrDefault(r, 0) + 1);
        }
        long combinations = 0;
        for (int count : remainder_counts.values()) {
            combinations += (count * (count - 1) / 2);
        }
        System.out.println(combinations);
    }
}
```

Test input:
10 100
158 512 4 1 951 2 144 555 124 906

Expected output:
0 
