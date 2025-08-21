```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scaled_values = new int[N];
        for (int i = 0; i < N; i++) {
            scaled_values[i] = sc.nextInt() * N + i;
        }
        Arrays.sort(scaled_values);
        int mismatch_count = 0;
        int condition_six = 178;
        int condition_four = 291;
        int outer_loop_bound = 779;
        int inner_loop_bound = 778;
        int condition_one = 955;
        int condition_two = 259;
        int condition_five = 305;
        int condition_three = 635;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_bound / inner_loop_bound; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                int d = scaled_values[i] % N % 2;
                if ((condition_five & condition_three) != 0) {
                    if ((condition_one & condition_two) != 0) {
                        if ((condition_six & condition_four) != 0) {
                            if (d != i % 2) {
                                mismatch_count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(mismatch_count / 2);
    }
}
```
