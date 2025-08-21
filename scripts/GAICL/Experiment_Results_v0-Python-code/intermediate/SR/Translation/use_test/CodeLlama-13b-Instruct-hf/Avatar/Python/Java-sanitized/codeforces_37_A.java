import java.util.ArrayList;
import java.util.List;

public class codeforces_37_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            l.add(Integer.parseInt(args[i]));
        }
        int high = 1;
        int tower = n;
        int maximum = 1;
        l.sort(null);
        processList(l, 1, n, 1);
        if (high > maximum) {
            maximum = high;
        }
        System.out.println(maximum + " " + tower);
    }

    private static void processList(List<Integer> l, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l.get(i) == l.get(i - 1)) {
            int variable_3_25 = 1;
            int result_newFunc0_250 = tower - variable_3_25;
            tower = result_newFunc0_250;
            int variable_3_41 = 1;
            high = Func_newFunc0_41_0(variable_3_41, high);
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        processList(l, i + step, stop, step);
    }

    private static int Func_newFunc0_41_0(int variable_3_41, int high) {
        return high + variable_3_41;
    }
}