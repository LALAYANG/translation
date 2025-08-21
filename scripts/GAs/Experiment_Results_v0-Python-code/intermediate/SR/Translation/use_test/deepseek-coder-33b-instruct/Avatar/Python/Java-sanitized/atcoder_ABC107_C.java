import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
        }
        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();
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
                    lst_p.add(lst[i]);
                } else if (lst[i] < 0) {
                    lst_m.add(lst[i]);
                }
            }
        }
        Collections.sort(lst_p);
        Collections.sort(lst_m, Collections.reverseOrder());
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        int ans = Integer.MAX_VALUE;
        for (int k = 0; k <= K; k++) {
            if (k > lastx || k - y > lasty) {
                continue;
            } else {
                if (k == 0) {
                    p = 0;
                } else {
                    p = lst_p.get(k - 1);
                }
                if (k - y == 0) {
                    m = 0;
                } else {
                    m = lst_m.get(lasty - (k - y));
                }
                ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m)));
            }
        }
        System.out.println(ans);
    }
}