```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int c = 0;
        int condition_a = 259;
        int condition_b = 477;
        int condition_c = 611;
        int condition_d = 635;
        int outer_loop_limit = 332;
        int inner_loop_limit = 331;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            for (int element : w) {
                if ((condition_c & condition_d) != 0) {
                    if ((condition_a & condition_b) != 0) {
                        if (element == 0) {
                            c += w[element] * (w[element] - 1);
                        } else if (-element < w.length && -element >= 0) {
                            c += w[element] * w[-element];
                        }
                    }
                }
            }
        }
        System.out.println(c / 2);
    }
}
```
