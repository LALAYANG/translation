import java.util.*;
import java.util.stream.IntStream;

public class codeforces_56_B {
    static int mn, mx;
    static int[] A;
    static int array_size;
    static final int CONDITION_CHECK_1 = 5;
    static final int CONDITION_CHECK_2 = 635;
    static final int outer_loop_limit = 534;
    static final int inner_loop_limit = 533;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextInt();
        }
        mn = array_size + 1;
        mx = -1;

        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            recursive_loop(0, array_size, 1);
        }

        if ((CONDITION_CHECK_1 & CONDITION_CHECK_2) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                int[] variable_3_17 = Arrays.copyOfRange(A, mx + 1, A.length);
                int[] sub_array_prefix = Arrays.copyOfRange(A, 0, mn);
                int[] variable_6_17 = Arrays.copyOfRange(A, mn, mx + 1);
                for (int i = 0; i < variable_6_17.length / 2; i++) {
                    int temp = variable_6_17[i];
                    variable_6_17[i] = variable_6_17[variable_6_17.length - i - 1];
                    variable_6_17[variable_6_17.length - i - 1] = temp;
                }
                int[] result_concatenate_arrays0 = concatenate_arrays(sub_array_prefix, variable_3_17, variable_6_17);
                A = result_concatenate_arrays0;
                if (IntStream.range(0, A.length - 1).allMatch(i -> A[i] <= A[i + 1])) {
                    System.out.println((mn + 1) + " " + (mx + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    public static void recursive_loop(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + 1 != A[i]) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }
        recursive_loop(i + step, stop, step);
    }

    public static int[] concatenate_arrays(int[] sub_array_prefix, int[] variable_3_17, int[] variable_6_17) {
        int[] result = new int[sub_array_prefix.length + variable_3_17.length + variable_6_17.length];
        System.arraycopy(sub_array_prefix, 0, result, 0, sub_array_prefix.length);
        System.arraycopy(variable_6_17, 0, result, sub_array_prefix.length, variable_6_17.length);
        System.arraycopy(variable_3_17, 0, result, sub_array_prefix.length + variable_6_17.length, variable_3_17.length);
        return result;
    }
}