```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = sc.nextInt();
        }
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int limit = 275;
        int step_size = 274;
        int is_valid = 164;
        int is_complete = 740;
        int is_ready = 410;
        int is_active = 300;
        int has_data = 520;
        int has_new_data = 29;
        for (int LoopIndexOut = 0; LoopIndexOut < limit / step_size; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if ((has_data & has_new_data) != 0) {
                    if ((is_ready & is_active) != 0) {
                        if ((is_valid & is_complete) != 0) {
                            if (lst[i] == 0) {
                                K--;
                            }
                        }
                    }
                }
                if (lst[i] > 0) {
                    lst_p[i] = lst[i];
                } else if (lst[i] < 0) {
                    lst_m[i] = lst[i];
                }
            }
        }
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.length - 1;
        int lastx = lst_p.length;
        int lasty = lst_m.length;

        int ans = 1000000000;
        for (int k = 0; k <= K; k++) {
            if (k > lastx || k - x > lasty) {
                continue;
            }
            if (x == 0) {
                p = 0;
            } else {
                p = lst_p[x - 1];
            }
            if (k - x == 0) {
                m = 0;
            } else {
                m = lst_m[lasty - (k - x)];
            }
            ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
        }
        System.out.println(ans);
    }
}
```
