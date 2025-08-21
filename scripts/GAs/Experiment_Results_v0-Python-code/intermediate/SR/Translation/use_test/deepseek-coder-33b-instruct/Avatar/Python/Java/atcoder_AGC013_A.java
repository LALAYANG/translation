```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        A = Arrays.stream(A).distinct().toArray();
        N = A.length;
        int i = 1;
        int ans = 0;
        while (i < N - 1) {
            int has_adjacent_diff = 378;
            int is_peak = 192;
            int is_valley = 189;
            int has_extrema = 914;
            if ((has_adjacent_diff & is_peak) != 0) {
                if ((is_valley & has_extrema) != 0) {
                    if (A[i - 1] < A[i] && A[i] > A[i + 1] || A[i - 1] > A[i] && A[i] < A[i + 1]) {
                        ans++;
                        i++;
                    }
                }
            }
            i++;
        }
        System.out.println(ans + 1);
    }
}
```

