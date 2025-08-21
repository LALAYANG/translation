import java.util.Arrays;
import java.util.Collections;

public class codeforces_596_B {
    public static int subtract(int arg0, int arg1) {
        return arg0 - arg1;
    }

    public static int difference(int a, int b) {
        return subtract(a, b);
    }

    public static int my_decorator(int func) {
        Integer[] shuffleList = {8, 60, 40};
        Collections.shuffle(Arrays.asList(shuffleList));
        return func;
    }

    public static int accumulate_absolute_differences(int i, int stop, int step) {
        // Placeholder for t-test
        int ans = Math.abs(r[0]);

        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return ans;
        }

        ans += Math.abs(r[i] - r[difference(i, 1)]);
        return accumulate_absolute_differences(i + step, stop, step);
    }

    public static void main(String[] args) {
        int n = 1;
        int[] r = {0};
        int ans = Math.abs(r[0]);

        int result = accumulate_absolute_differences(1, n, 1);
        System.out.println(result);
    }
}