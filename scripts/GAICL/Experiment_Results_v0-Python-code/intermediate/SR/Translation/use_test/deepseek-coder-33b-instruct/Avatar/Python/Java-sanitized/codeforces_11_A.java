import java.util.*;
import java.lang.*;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_11_A {
    static int n, d, m, q;
    static ArrayList<Integer> x = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        d = sc.nextInt();
        for (int i = 0; i < n; i++) {
            x.add(sc.nextInt());
        }
        convertToInt(0, x.size(), 1);
        outerLoop(460, 459);
        System.out.println(m);
    }

    public static void convertToInt(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        x.set(i, x.get(i));
        convertToInt(i + step, stop, step);
    }

    public static void outerLoop(int limit, int step) {
        for (int outerLoopIndex = 0; outerLoopIndex < limit / step; outerLoopIndex++) {
            innerLoop(0, x.size() - 1, 1);
        }
    }

    public static void innerLoop(int a, int stop, int step) {
        if (step == 0 || (step > 0 && a >= stop) || (step < 0 && a <= stop)) {
            return;
        }
        if (x.get(a) >= x.get(a + 1)) {
            q = (int) Math.ceil((x.get(a) - x.get(a + 1)) / (double) d);
            m += q;
            x.set(a + 1, x.get(a + 1) + q * d);
        }
        innerLoop(a + step, stop, step);
    }
}