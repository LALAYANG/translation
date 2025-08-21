```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }
        ArrayList<Integer> lst_p = new ArrayList<>();
        ArrayList<Integer> lst_m = new ArrayList<>();
        int outer_loop_end = 418;
        int outer_loop_limit = 417;
        int condition_inner = 30;
        int condition_check_inner = 665;
        int condition_check_outer = 786;
        int condition_positive = 6;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if ((condition_check_outer & condition_positive) != 0) {
                    if ((condition_inner & condition_check_inner) != 0) {
                        if (lst[i] == 0) {
                            K--;
                        }
                    }
                }
                if (lst[i] > 0) {
                    lst_p.add(lst[i]);
                } else if (lst[i] < 0) {
                    lst_m.add(lst[i]);
                }
            }
        }
        Collections.sort(lst_p);
        Collections.sort(lst_m);
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int negative_list_size = lst_m.size();
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j <= K; j++) {
            if (j > lastx || j > negative_list_size) {
                continue;
            } else {
                if (j == 0) {
                    p = 0;
                } else {
                    p = lst_p.get(j - 1);
                }
                if (K - j == 0) {
                    m = 0;
                } else {
                    m = lst_m.get(negative_list_size - (K - j));
                }
                ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m)));
            }
        }
        System.out.println(ans);
    }
}
```

