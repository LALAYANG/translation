import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC164_D {
    static int[] m;
    static int a;
    static int r;
    static String s;
    static int l = 2019;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        m = new int[l + 1];
        Arrays.fill(m, 0);
        m[0] = 1;
        a = 0;
        r = 0;
        int loopBound = 562;
        int loopFactor = 561;
        computeResult(0, loopBound / loopFactor, 1);
        System.out.println(r);
    }

    public static void computeResult(int loopIndex, int stop, int step) {
        if (step == 0 || (step > 0 && loopIndex >= stop) || (step < 0 && loopIndex <= stop)) {
            return;
        }
        for (int digitIndex = 0; digitIndex < s.length(); digitIndex++) {
            char e = s.charAt(s.length() - 1 - digitIndex);
            a += Integer.parseInt(String.valueOf(e)) * Math.floorMod(Math.pow(10, digitIndex), l);
            r += m[Math.floorMod(a, l)];
            m[Math.floorMod(a, l)] += 1;
        }
        computeResult(loopIndex + step, stop, step);
    }
}