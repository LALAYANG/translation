import java.util.ArrayList;
import java.util.List;

public class codeforces_412_A {
    public static void main(String[] args) {
        int input_num = 3;
        int k = 1;
        String v = ".VP";
        String[] direction_options = {"LEFT", "RIGHT"};
        boolean f = k - 1 < input_num - k;
        int m = Math.min(k - 1, input_num - k);
        List<String> a = new ArrayList<>();

        recursive_ttest(0, m, 1);

        for (int i = v.length() - 1 + 2 * f; i >= 0; i--) {
            a.add("PRINT " + v.charAt(i));
            a.add(direction_options[f]);
        }

        for (int i = a.size() - 1; i > 0; i--) {
            System.out.println(a.get(i));
        }
    }

    private static void recursive_ttest(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        // Perform t-test here
        a.add(direction_options[f]);
        recursive_ttest(i + step, stop, step);
    }
}