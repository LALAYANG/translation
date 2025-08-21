import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lst.add(sc.nextInt());
        }
        int outer_loop_end = 418;
        int outer_loop_limit = 417;
        int condition_inner = 30;
        int condition_check_inner = 665;
        int condition_check_outer = 786;
        int condition_positive = 6;
        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_end / outer_loop_limit; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if ((condition_check_outer & condition_positive) != 0) {
                    if ((condition_inner & condition_check_inner) != 0) {
                        if (lst.get(i) == 0) {
                            K--;
                    }
                }
                if (lst.get(i) > 0) {
                    lst_p.add(lst.get(i));
                } else if (lst.get(i) < 0) {
                    lst_m.add(lst.get(i));
                }
            }
        }
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int negative_list_size = lst_m.size();

        int calculate_minimum_sum(int k) {
            int ans = (int) 1e9;
            for (int j = 0; j <= k; j++) {
                if (j > lastx || k - j > negative_list_size) {
                    continue;
                }
                if (j == 0) {
                    p = 0;
                } else {
                    p = lst_p.get(j - 1);
                }
                if (k - j == 0) {
                    m = 0;
                } else {
                    m = lst_m.get(negative_list_size - (k - j));
                }
                ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
            }
            return ans;
        }
        System.out.println(calculate_minimum_sum(K));
    }
}