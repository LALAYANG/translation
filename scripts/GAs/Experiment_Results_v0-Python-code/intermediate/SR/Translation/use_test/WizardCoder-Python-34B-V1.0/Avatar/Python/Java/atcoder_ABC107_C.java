```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        String[] lstStr = scanner.nextLine().split(" ");
        ArrayList<Integer> lst = new ArrayList<>();
        for (String s : lstStr) {
            lst.add(Integer.parseInt(s));
        }
        ArrayList<Integer> lst_p = new ArrayList<>();
        ArrayList<Integer> lst_m = new ArrayList<>();
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
                            if (lst.get(i) == 0) {
                                K--;
                            }
                        }
                    }
                    if (lst.get(i) > 0) {
                        lst_p.add(lst.get(i));
                    } else if (lst.get(i) < 0) {
                        lst_m.add(lst.get(i));
                    }
                }
            }
        }
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();

        int Func_check_0(int k) {
            int ans = Integer.MAX_VALUE;
            for (int j = 0; j <= k; j++) {
                if (j > lastx || k - j > lasty) {
                    continue;
                }
                if (j > 0) {
                    p = lst_p.get(j - 1);
                }
                if (k - j > 0) {
                    m = lst_m.get(lasty - (k - j));
                }
                ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m));
            }
            return ans;
        }
        System.out.println(Func_check_0(K));
    }
}
```

Test input:
99999 66666
-24998961 -24998137 -24997980 -24996839 -24996786 -24996493 -24996253 -24996188 -24994096 -24993639 -24993247 -24991922 -24990998 -24989477 -24989026 -24987613 -24986977 -24986871 -24986802 -24985843 -24985025 -24984178 -24983426 -24982640 -24982382 -24981993 -24981451 -24981010 -24980748 -24978420 -24977673 -24977479 -24977310 -24975209 -24974823 -24974246 -24973411 -2497383 -24971326 -24970456 -2496830 -24968818 -2496800 -24968756 -24968747 -24968051 -24967958 -24967173 -2496698
Expected output:
99530928 
