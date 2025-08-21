import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        int N = 66478;
        List<Integer> indexedInput = new ArrayList<>();
        indexedInput.add(20281);
        indexedInput.add(61427);
        indexedInput.add(40941);
        indexedInput.add(28426);
        // Add more integers as needed

        List<Integer> A_ = new ArrayList<>(indexedInput);
        Collections.sort(A_, Comparator.comparingInt(o -> o));
        List<Integer> A__ = new ArrayList<>();
        for (int i = 0; i < A_.size(); i++) {
            A__.add(A_.get(i));
        }

        // Perform t-test using the given indices

        int loopStop = 225;
        int checkStop = 224;

        recursivePrint(0, loopStop / checkStop, 1);
        System.out.println(A__.get(A__.size() - 1));
    }

    private static void recursivePrint(int currentIndex, int stop, int step) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        recursivePrint(currentIndex + step, stop, step);
    }
}