```java
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int n, x;
        String[] input = "100 18132779".split(" ");
        n = Integer.parseInt(input[0]);
        x = Integer.parseInt(input[1]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i + 2]);
        }
        Arrays.sort(a);
        int max_outer_iterations = 848;
        int inner_loop_step = 847;
        int ans = 0;
        if (a[0] > x) {
            System.out.println(0);
            return;
        }
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_iterations / inner_loop_step; LoopIndexOut++) {
            for (int current_value : a) {
                if (current_value > x) {
                    x = 0;
                    break;
                }
                ans++;
                x = calculate_difference(current_value, x);
            }
        }
        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }

    public static int calculate_difference(int current_value, int x) {
        return x - current_value;
    }
}
```

Test input:
100 18132779 412682070 141309189 659925274 104765981 381531051 241880367 836885153 420034290 754052121 178522842 209531577 75672253 28480496 411621561 69147266 929947988 130046275 908122596 52634146 115025712 314230633 64760919 180806978 581197296 830657404 270167410 539684751 822137046 664454365 250513018 777952570 523871048 310831022 324743959 385204089 524225360 619387222 416796116 556443908 256763933 649106689 752519331 778017432 41001536 967395870 963633494 451228535 659878768 116999903 47
Expected output:
0
``` 
