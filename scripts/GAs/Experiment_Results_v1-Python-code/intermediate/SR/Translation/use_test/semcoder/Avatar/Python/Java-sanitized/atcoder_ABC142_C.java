import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        int N = 66478;
        int[] A = {9, 94, 10};
        int[] B = {25, 57, 12};
        // t-test not needed for this problem
        List<Integer> indexedInputs = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            indexedInputs.add(i + 1);
        }
        Collections.sort(indexedInputs);
        List<Integer> A_ = new ArrayList<>(indexedInputs);
        List<Integer> A__ = new ArrayList<>();
        for (int a : A_) {
            A__.add(a);
        }
        int end_condition = 713;
        int divisor = 712;

        recursive_print(0, end_condition / divisor, 1, A__);
        System.out.println(A__.get(A__.size() - 1));
    }

    private static void recursive_print(int current_index, int stop, int step, List<Integer> A__) {
        if (step == 0 || (step > 0 && current_index >= stop) || (step < 0 && current_index <= stop)) {
            return;
        }
        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        recursive_print(current_index + step, stop, step, A__);
    }
}