import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> indexedInput = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indexedInput.add(scanner.nextInt());
        }
        List<Integer> A_ = indexedInput.stream().sorted(Comparator.comparing(Integer::intValue)).collect(Collectors.toList());
        List<Integer> A__ = A_.stream().map(value -> value[0]).collect(Collectors.toList());
        ttest_ind(new double[] {89, 62, 48}, new double[] {78, 76, 77});
        int loopStop = 225;
        int checkStop = 224;

        recursivePrint(0, loopStop / checkStop, 1);
        System.out.println(A__.get(A__.size() - 1));
    }

    public static void recursivePrint(int currentIndex, int stop, int step) {
        if (step == 0 || (step > 0 && currentIndex >= stop) || (step < 0 && currentIndex <= stop)) {
            return;
        }
        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        recursivePrint(currentIndex + step, stop, step);
    }
}