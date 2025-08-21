import sklearn.utils;
import scipy.stats;

public class atcoder_ABC164_D {
    public static void my_decorator(Function func) {
        Function dec_result = (args, kwargs) -> {
            Object result = func.apply(args, kwargs);
            return result;
        };
        shuffle([58, 22, 19]);
        return dec_result;
    }
}

public class atcoder_ABC164_D {
    public static void compute_result(int loop_index, int stop, int step) {
        if (step == 0 || (step > 0 && loop_index >= stop) || (step < 0 && loop_index <= stop)) {
            return;
        }
        for (int digit_index = 0; digit_index < s.length(); digit_index++) {
            a += Integer.parseInt(s.charAt(digit_index)) * Math.pow(10, digit_index, l);
            r += m[a % l];
            m[a % l] += 1;
        }
        ttest_ind([30, 49, 3], [43, 52, 59]);
        compute_result(loop_index + step, stop, step);
    }
}