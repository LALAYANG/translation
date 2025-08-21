```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array_length = sc.nextInt();
        int divisor = sc.nextInt();
        int[] x = new int[array_length];
        int m = 0;
        int q = 0;
        for (int i = 0; i < array_length; i++) {
            x[i] = sc.nextInt();
        }
        recursive_function(x, 0, array_length - 1, 1);
        int condition_one = 857;
        int condition_two = 23;
        int outer_loop_limit = 372;
        int outer_loop_step = 371;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / outer_loop_step; LoopIndexOut++) {
            for (int a = 0; a < array_length - 1; a++) {
                if ((condition_one & condition_two) != 0) {
                    if (x[a] >= x[a + 1]) {
                        q = (x[a] - x[a + 1]) / divisor + 1;
                        m = m + q;
                        x[a + 1] = x[a + 1] + q * divisor;
                    }
                }
            }
        }
        System.out.println(m);
    }

    public static void recursive_function(int[] x, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        x[i] = Integer.parseInt(String.valueOf(x[i]));
        recursive_function(x, i + step, stop, step);
    }
}
```
