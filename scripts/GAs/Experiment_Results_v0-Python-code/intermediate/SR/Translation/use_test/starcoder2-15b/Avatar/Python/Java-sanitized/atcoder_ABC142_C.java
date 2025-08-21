import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        List<Integer> array = IntStream.range(0, arraySize).mapToObj(i -> scanner.nextInt()).collect(Collectors.toList());
        List<Integer> sortedArray = new ArrayList<>(array);
        Collections.sort(sortedArray);
        int terminationCondition = 565;
        int loopStep = 564;
        recursivePrint(0, terminationCondition / loopStep, 1, sortedArray);
        System.out.println(sortedArray.get(sortedArray.size() - 1));
    }

    private static void recursivePrint(int loopIndexOut, int stop, int step, List<Integer> sortedArray) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < sortedArray.size() - 1; i++) {
            System.out.print(sortedArray.get(i) + " ");
        }
        recursivePrint(loopIndexOut + step, stop, step, sortedArray);
    }
}