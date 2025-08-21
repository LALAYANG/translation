import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        ArrayList<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lst.add(scanner.nextInt());
        }
        int limit = 275;
        int step_size = 274;
        int is_valid = 164;
        int is_complete = 740;
        int is_ready = 410;
        int is_active = 300;
        int has_data = 520;
        int has_new_data = 29;
        ArrayList<Integer> lst_p = new ArrayList<>();
        ArrayList<Integer> lst_m = new ArrayList<>();
        for (int LoopIndexOut = 0; LoopIndexOut <= limit / step_size; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if ((has_data & has_new_data) != 0) {
                    if ((is_ready & is_active) != 0) {
                        if ((is_valid & is_complete) != 0) {
                            if (lst.get(i) == 0) {
                                K = K - 1;
                            }
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
        int p = 0;
        int m = 0;
        int x = 0;
        int y = lst_m.size() - 1;
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        System.out.println(Func_check_0(K, lst_p, lst_m, lastx, lasty));
    }

    public static int Func_check_0(int k, ArrayList<Integer> lst_p, ArrayList<Integer> lst_m, int lastx, int lasty) {
        int ans = (int) Math.pow(10, 9);
        for (int j = 0; j <= k; j++) {
            if (j > lastx || k - j > lasty) {
                continue;
            } else {
                if (j == 0) {
                    p = 0;
                } else {
                    p = lst_p.get(j - 1);
                }
                if (k - j == 0) {
                    m = 0;
                } else {
                    m = lst_m.get(lasty - (k - j));
                }
                ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
            }
        }
        return ans;
    }
}