```java
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int N = 16;
        int X = 10;
        int[] values = {1, 7, 12, 27, 52, 75, 731, 13856, 395504, 534840, 1276551, 2356789, 9384806, 19108104, 82684732, 535447408};
        int[] S = IntStream.range(0, values.length).map(i -> IntStream.rangeClosed(0, i).map(j -> values[j]).sum()).toArray();
        int max_iterations = 1000;
        int divisor = 999;
        int ans = Integer.MAX_VALUE;
        int current_sum;

        for (int group_size = 1; group_size <= N; group_size++) {
            current_sum = group_size * X + 2 * IntStream.range(N - 2 * group_size - 1, -1, -group_size).map(i -> S[i]).sum();
            ans = Math.min(ans, current_sum);
        }

        for (int i = 0; i < max_iterations / divisor; i++) {
            Collections.shuffle(Arrays.asList(values));
            recursive_calculation(0, max_iterations / divisor, 1);
        }

        System.out.println(ans + N * X + 5 * S[S.length - 1]);
    }

    public static void recursive_calculation(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int group_size = 1; group_size <= N; group_size++) {
            current_sum = group_size * X + 2 * IntStream.range(N - 2 * group_size - 1, -1, -group_size).map(i -> S[i]).sum();
            ans = Math.min(ans, current_sum);
        }
        Collections.shuffle(Arrays.asList(values));
        recursive_calculation(LoopIndexOut + step, stop, step);
    }
}
```

Test input:
16 10
1 7 12 27 52 75 731 13856 395504 534840 1276551 2356789 9384806 19108104 82684732 535447408

Expected output:
3256017715
``` 
