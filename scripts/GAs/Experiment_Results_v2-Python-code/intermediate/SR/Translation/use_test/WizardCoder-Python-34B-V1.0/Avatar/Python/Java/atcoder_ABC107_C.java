```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = Integer.parseInt(scanner.next());
        }
        int[] lst_p = new int[N];
        int[] lst_m = new int[N];
        int outer_loop_end = 418;
        int outer_loop_limit = 417;
        int condition_inner = 30;
        int condition_check_inner = 665;
        int condition_check_outer = 786;
        int condition_positive = 6;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if (condition_check_outer & condition_positive != 0 && condition_inner & condition_check_inner != 0 && lst[i] == 0) {
                    K--;
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
        int negative_list_size = lst_m.length;

        int calculate_minimum_sum(int k) {
            int ans = Integer.MAX_VALUE;
            for (int j = 0; j <= k; j++) {
                if (j > lastx || k - j > negative_list_size) {
                    continue;
                }
                if (j > 0) {
                    p = lst_p[j - 1];
                }
                if (k - j > 0) {
                    m = lst_m[negative_list_size - (k - j)];
                }
                ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m));
            }
            return ans;
        }
        System.out.println(calculate_minimum_sum(K));
    }
}
```

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -24996188 -24994096 -24993639 -24993247 -24991922 -24990998 -24989477 -24989026 -24987613 -24986977 -24986871 -24986802 -24985843 -24985025 -24984178 -24983426 -24982640 -24982382 -24981993 -24981451 -24981010 -24980748 -24978420 -24977673 -24977479 -24977310 -24975209 -24974823 -24974246 -24973411 -2497383 -24971326 -2496830 -24968818 -24968800 -24968756 -24968747 -24968051 -24967958 -24967173 -2496698
Expected output:
99530928
``` 
