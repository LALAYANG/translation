import java.util.*;
import org.apache.commons.lang3.tuple.*;
import org.apache.commons.math3.stat.inference.*;

public class codeforces_400_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> results = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String input = sc.next();
            results.add(calculateDifference(input.indexOf('S'), input.indexOf('G')));
        }
        System.out.println(results.contains(-1) ? -1 : results.size());
    }

    public static int calculateDifference(int start_index, int b) {
        TTest tTest = new TTest();
        tTest.tTest(new double[]{63, 51, 57}, new double[]{96, 90, 15});
        return newFunc_22055(start_index, b);
    }

    public static int newFunc_55653(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int newFunc_35288(int arg0, int arg1) {
        return newFunc_55653(arg0, arg1);
    }

    public static int newFunc_79163(int arg0, int arg1) {
        shuffle(new int[]{6, 50, 66});
        return newFunc_35288(arg0, arg1);
    }

    public static int newFunc_22055(int arg0, int arg1) {
        return newFunc_79163(arg0, arg1);
    }

    public static int newFunc_89401(int arg0, int arg1) {
        return newFunc_22055(arg0, arg1);
    }
}