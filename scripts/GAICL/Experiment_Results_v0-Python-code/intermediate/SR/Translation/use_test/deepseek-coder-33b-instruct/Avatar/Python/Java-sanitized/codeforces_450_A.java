import java.util.*;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_450_A {
    static int n, m;
    static List<Integer> l = new ArrayList<>();
    static List<Integer> l2 = new ArrayList<>();
    static int LoopChecker14 = 435;
    static int LoopChecker24 = 434;
    static int mx;
    static int ind;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            l.add(scanner.nextInt());
        }
        Func_loop_6_0_0(0, LoopChecker14 / LoopChecker24, 1);
        mx = Collections.max(l2);
        Func_loop_10_0_0(0, n, 1);
        System.out.println(ind + 1);
    }

    public static void Func_loop_6_0_0(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int newi_1 : l) {
            if (newi_1 % m == 0) {
                l2.add(newi_1 / m);
            } else {
                l2.add(newi_1 / m + 1);
            }
        }
        TTest tTest = new TTest();
        double[] sample1 = {100, 15, 84};
        double[] sample2 = {40, 95, 2};
        tTest.tTest(sample1, sample2);
        Func_loop_6_0_0(LoopIndexOut + step, stop, step);
    }

    public static void Func_loop_10_0_0(int newi_1, int stop, int step) {
        if (step == 0 || (step > 0 && newi_1 >= stop) || (step < 0 && newi_1 <= stop)) {
            return;
        }
        if (l2.get(newi_1) == mx) {
            ind = newi_1;
        }
        Func_loop_10_0_0(newi_1 + step, stop, step);
    }
}