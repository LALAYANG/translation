import java.util.*;
import java.util.stream.*;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in());
        int N = scanner.nextInt();
        List<Integer> A = Stream.of(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> B = Stream.of(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> A_ = IntStream.range(0, A.size()).boxed().sorted(Comparator.comparing(i -> A.get(i))).collect(Collectors.toList());
        List<Integer> B_ = IntStream.range(0, B.size()).boxed().sorted(Comparator.comparing(i -> B.get(i))).collect(Collectors.toList());
        int end_condition = 713;
        int divisor = 712;
        recursivePrint(0, end_condition / divisor, 1, A_);
        System.out.println(A_.get(A_.size() - 1));
    }

    public static void recursivePrint(int current_index, int stop, int step, List<Integer> A__) {
        if (step == 0 || (step > 0 && current_index >= stop) || (step < 0 && current_index <= stop)) {
            return;
        }
        for (int i = 0; i < A__.size() - 1; i++) {
            System.out.print(A__.get(i) + " ");
        }
        recursivePrint(current_index + step, stop, step, A__);
    }
}