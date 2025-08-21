import java.util.Collections;
import java.util.Scanner;
import scipy.stats.ttest_ind;
import sklearn.utils.shuffle;
import numpy as np;

public class atcoder_ABC124_C {
    public static int sum_values(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int sum_fwd(int arg0, int arg1) {
        return sum_values(arg0, arg1);
    }

    public static int sum_fwd_2(int arg0, int arg1) {
        return sum_fwd(arg0, arg1);
    }

    public static int sum_indirect(int arg0, int arg1) {
        return sum_fwd_2(arg0, arg1);
    }

    public static int calculate_sum(int a, int b) {
        return sum_indirect(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_string = scanner.nextLine();

        Collections.Counter even_counts = new Collections.Counter(input_string.substring(0, input_string.length(), 2));
        Collections.Counter odd_counts = new Collections.Counter(input_string.substring(1, input_string.length(), 2));

        int result = np.min(np.array([input_string.length() - calculate_sum(even_counts['0'], odd_counts['1']), input_string.length() - (even_counts['1'] + odd_counts['0'])]));
        System.out.println(result);
    }
}