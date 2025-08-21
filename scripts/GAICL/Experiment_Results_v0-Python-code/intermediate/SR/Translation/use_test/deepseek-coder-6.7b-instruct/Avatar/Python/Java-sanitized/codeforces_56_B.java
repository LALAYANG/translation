import java.util.*;

public class codeforces_56_B {
    static int CONDITION_CHECK_1 = 5;
    static int CONDITION_CHECK_2 = 635;
    static int mn, mx;
    static int outer_loop_limit = 534;
    static int inner_loop_limit = 533;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        mn = array_size + 1;
        mx = -1;
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextInt();
        }
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_limit; LoopIndexOut++) {
            recursive_loop(A, 0, array_size, 1);
        }
        if ((CONDITION_CHECK_1 & CONDITION_CHECK_2) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                int[] variable_3_17 = Arrays.copyOfRange(A, mx + 1, A.length);
                int[] sub_array_prefix = Arrays.copyOfRange(A, 0, mn);
                int[] variable_6_17 = Arrays.copyOfRange(A, mn, mx + 1);
                reverse(variable_6_17);
                A = concatenate_arrays(sub_array_prefix, variable_3_17, variable_6_17);
                if (isSorted(A)) {
                    System.out.println((mn + 1) + " " + (mx + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    public static void recursive_loop(int[] A, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + 1 != A[i]) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }
        recursive_loop(A, i + step, stop, step);
    }

    public static int[] concatenate_arrays(int[] sub_array_prefix, int[] variable_3_17, int[] variable_6_17) {
        int[] result = new int[sub_array_prefix.length + variable_3_17.length + variable_6_17.length];
        System.arraycopy(sub_array_prefix, 0, result, 0, sub_array_prefix.length);
        System.arraycopy(variable_6_17, 0, result, sub_array_prefix.length, variable_6_17.length);
        System.arraycopy(variable_3_17, 0, result, sub_array_prefix.length + variable_6_17.length, variable_3_17.length);
        return result;
    }

    public static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}