```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long[] cum_remainders = new long[N + 1];
        HashMap<Long, Integer> remainder_counts = new HashMap<>();
        long combinations = 0;

        for (int i = 1; i <= N; i++) {
            cum_remainders[i] = (cum_remainders[i - 1] + A[i - 1]) % M;
            long remainder = cum_remainders[i];
            int count = remainder_counts.getOrDefault(remainder, 0);
            combinations += count * (count - 1) / 2;
            remainder_counts.put(remainder, count + 1);
        }

        System.out.println(combinations);
    }
}
```
