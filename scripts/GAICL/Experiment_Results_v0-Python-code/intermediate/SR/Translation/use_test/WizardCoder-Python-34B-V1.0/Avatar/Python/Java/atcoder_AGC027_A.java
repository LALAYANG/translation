```java
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        int n, x;
        int[] a;
        int ans = 0;
        Lock lock = new ReentrantLock();

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        x = scanner.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);

        if (a[0] > x) {
            System.out.println(0);
            return;
        }

        int max_outer_iterations = 848;
        int inner_loop_step = 847;
        for (int LoopIndexOut = 0; LoopIndexOut < max_outer_iterations / inner_loop_step; LoopIndexOut++) {
            for (int current_value : a) {
                if (current_value > x) {
                    x = 0;
                    break;
                }
                ans++;
                x -= current_value;
            }
        }

        if (x != 0) {
            ans--;
        }
        System.out.println(ans);
    }
}
```

Test input:
100 18132779
412682070 141309189 659925274 104765981 381531051 241880367 836885153 420034290 754052121 178522842 209531577 75672253 28480496 411621561 69147266 929947988 130046275 908122596 52634146 115025712 314230633 64760919 180806978 581197296 830657404 270167410 539684751 822137046 664454365 250513018 777952570 523871048 310831022 324743959 385204089 524225360 619387222 416796116 556443908 256763933 649106689 752519331 778017432 41001536 967395870 963633494 451228535 659878768 116999903 47
Expected output:
0

Note: The original Python code uses threads, which is not necessary in Java as it is not needed for this problem. The Java code above is a direct translation of the given Python code without using threads. 
