import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        int newN_1 = Integer.parseInt(args[0]);
        List<Integer> A = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newA__1 = A.stream().sorted(Comparator.comparingInt(a -> a)).collect(Collectors.toList());
        List<Integer> newA___1 = newA__1.stream().map(a -> a[0]).collect(Collectors.toList());
        int newLoopChecker18_1 = 565;
        int LoopChecker28 = 564;

        loop_10_0(0, newLoopChecker18_1 // LoopChecker28, 1);
        System.out.println(newA___1.get(newA___1.size() - 1));
    }

    public static void loop_10_0(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        for (int i : newA___1.subList(0, newA___1.size() - 1)) {
            System.out.print(i + " ");
        }
        loop_10_0(LoopIndexOut + step, stop, step);
    }
}