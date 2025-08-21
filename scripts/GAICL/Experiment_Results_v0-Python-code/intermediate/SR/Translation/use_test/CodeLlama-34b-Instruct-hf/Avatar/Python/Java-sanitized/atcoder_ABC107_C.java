import java.util.Scanner;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] lst = new int[N];
        for (int i = 0; i < N; i++) {
            lst[i] = scanner.nextInt();
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
                if (has_data & has_new_data) {
                    if (is_ready & is_active) {
                        if (is_valid & is_complete) {
                            if (lst[i] == 0) {
                                K = K - 1;
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

        int Func_check_0(int k) {
            int ans = 1000000000;
            for (int newj_1 = 0; newj_1 < k + 1; newj_1++) {
                if (newj_1 > lastx || k - newj_1 > lasty) {
                    continue;
                }
                if (newj_1 == 0) {
                    p = 0;
                } else {
                    p = lst_p[newj_1 - 1];
                }
                if (k - newj_1 == 0) {
                    m = 0;
                } else {
                    m = lst_m[lasty - (k - newj_1)];
                }
                ans = Math.min(ans, 2 * p + Math.abs(m), p + 2 * Math.abs(m));
            }
            return ans;
        }

        System.out.println(Func_check_0(K));
    }
}