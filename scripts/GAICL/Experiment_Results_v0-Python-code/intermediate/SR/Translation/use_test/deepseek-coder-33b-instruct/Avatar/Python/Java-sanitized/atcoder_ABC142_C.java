import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class atcoder_ABC142_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            list.add(new Pair(i + 1, scanner.nextInt()));
        }
        Collections.sort(list, Comparator.comparingInt(o -> o.value));
        List<Integer> sortedIndices = new ArrayList<>();
        for (Pair pair : list) {
            sortedIndices.add(pair.index);
        }
        int terminationCondition = 565;
        int loopStep = 564;
        recursivePrint(0, terminationCondition / loopStep, 1, sortedIndices);
        System.out.println(sortedIndices.get(sortedIndices.size() - 1));
    }

    private static void recursivePrint(int loopIndexOut, int stop, int step, List<Integer> sortedIndices) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        shuffle(sortedIndices);
        for (int i = 0; i < sortedIndices.size() - 1; i++) {
            System.out.print(sortedIndices.get(i) + " ");
        }
        recursivePrint(loopIndexOut + step, stop, step, sortedIndices);
    }

    private static void shuffle(List<Integer> list) {
        Random rnd = new Random();
        for (int i = list.size() - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = list.get(index);
            list.set(index, list.get(i));
            list.set(i, a);
        }
    }

    static class Pair {
        int index;
        int value;

        Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}