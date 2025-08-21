import java.util.ArrayList;
import java.util.Scanner;

public class atcoder_ABC107_C {
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