import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;

public class codeforces_56_B {
    public static void main(String[] args) {
        int newN_1 = Integer.parseInt(args[0]);
        int[] A = new int[newN_1];
        for (int i = 0; i < newN_1; i++) {
            A[i] = Integer.parseInt(args[i + 1]);
        }

        int mn = newN_1 + 1;
        int mx = -1;

        Func_loop_4_0_0(0, newN_1, 1);

        if (mx == -1) {
            System.out.println("0 0");
        } else {
            A = A[:mn] + A[mn:mx + 1][::-1] + A[mx + 1:];
            if (sorted(A) == A) {
                System.out.println(mn + 1, mx + 1);
            } else {
                System.out.println("0 0");
            }
        }
    }

    public static void Func_loop_4_0_0(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }

        if (i + 1 != A[i]) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }

        Func_loop_4_0_0(i + step, stop, step);
    }

    public static boolean sorted(int[] A) {
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {
                return false;
            }
        }
        return true;
    }
}