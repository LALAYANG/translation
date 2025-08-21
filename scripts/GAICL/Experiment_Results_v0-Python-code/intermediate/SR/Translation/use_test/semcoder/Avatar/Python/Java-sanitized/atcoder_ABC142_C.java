import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        List<Integer> inputArray = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            inputArray.add(scanner.nextInt());
        }

        List<Integer> sortedIndices = new ArrayList<>();
        for (int i = 0; i < inputArray.size(); i++) {
            sortedIndices.add(i + 1);
        }
        Collections.sort(sortedIndices, (a, b) -> inputArray.get(a - 1).compareTo(inputArray.get(b - 1)));

        int terminationCondition = 565;
        int loopStep = 564;

        recursivePrint(0, terminationCondition / loopStep, 1, sortedIndices);
        System.out.println(sortedIndices.get(sortedIndices.size() - 1));
    }

    private static void recursivePrint(int loopIndexOut, int stop, int step, List<Integer> sortedIndices) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int i = 0; i < sortedIndices.size() - 1; i++) {
            System.out.print(sortedIndices.get(i) + " ");
        }
        recursivePrint(loopIndexOut + step, stop, step, sortedIndices);
    }
}