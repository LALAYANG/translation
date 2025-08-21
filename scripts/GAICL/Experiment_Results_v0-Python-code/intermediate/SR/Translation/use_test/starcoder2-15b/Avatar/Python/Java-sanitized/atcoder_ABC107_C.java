import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC107_C {
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
        int LoopChecker16 = 275;
        int LoopChecker26 = 274;
        int ConditionChecker110 = 164;
        int newConditionChecker210_1 = 740;
        int ConditionChecker112 = 410;
        int ConditionChecker212 = 300;
        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker16 / LoopChecker26; LoopIndexOut++) {
            for (int i = 0; i < N; i++) {
                if (ConditionChecker112 & ConditionChecker212) {
                    if (ConditionChecker110 & newConditionChecker210_1) {
                        if (lst[i] == 0) {
                            K = K - 1;
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
                } else {
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
            }
            return ans;
        }
        System.out.println(Func_check_0(K));
    }
}