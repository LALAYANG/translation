```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }
        int[] S = new int[N];
        S[0] = values[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + values[i];
        }
        int ans = Integer.MAX_VALUE;
        int current_sum = 0;
        for (int group_size = 1; group_size <= N / 2; group_size++) {
            current_sum = group_size * X + 2 * sum((S[index] for index in range(N - 2 * group_size - 1, -1, -group_size)));
            ans = Math.min(ans, current_sum);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }
}
```
