import java.util.*;

public class codeforces_56_B {
    private static int mn, mx;
    private static final int CONDITION_CHECK_1 = 5;
    private static final int CONDITION_CHECK_2 = 635;
    private static final int outer_loop_limit = 534;
    private static final int inner_loop_limit = 533;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array_size = scanner.nextInt();
        int[] A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextInt();
        }
        mn = array_size + 1;
        mx = -1;
        for (int loopIndexOut = 0; loopIndexOut <= outer_loop_limit / inner_loop_limit; loopIndexOut++) {
            recursiveLoop(A, 0, array_size, 1);
        }
        if ((CONDITION_CHECK_1 & CONDITION_CHECK_2) != 0) {
            if (mx == -1) {
                System.out.println("0 0");
            } else {
                int[] variable_3_17 = Arrays.copyOfRange(A, mx + 1, A.length);
                int[] sub_array_prefix = Arrays.copyOfRange(A, 0, mn);
                int[] variable_6_17 = Arrays.copyOfRange(A, mn, mx + 1);
                reverse(variable_6_17);
                int[] result = concatenateArrays(sub_array_prefix, variable_3_17, variable_6_17);
                if (isSorted(result)) {
                    System.out.println((mn + 1) + " " + (mx + 1));
                } else {
                    System.out.println("0 0");
                }
            }
        }
    }

    private static void recursiveLoop(int[] A, int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (i + 1 != A[i]) {
            mn = Math.min(mn, i);
            mx = Math.max(mx, i);
        }
        recursiveLoop(A, i + step, stop, step);
    }

    private static int[] concatenateArrays(int[] sub_array_prefix, int[] variable_3_17, int[] variable_6_17) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : sub_array_prefix) {
            list.add(i);
        }
        for (int i : variable_6_17) {
            list.add(i);
        }
        for (int i : variable_3_17) {
            list.add(i);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    private static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}