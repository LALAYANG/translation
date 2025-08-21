import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        List<Integer> A = IntStream.range(0, arraySize)
                .map(i -> scanner.nextInt())
                .boxed()
                .collect(Collectors.toList());
        List<Integer> indices = IntStream.range(0, A.size())
                .boxed()
                .collect(Collectors.toList());
        Collections.sort(indices, Comparator.comparing(i -> A.get(i)));
        int terminationCondition = 565;
        int loopStep = 564;
        recursivePrint(0, terminationCondition / loopStep, 1, indices);
        System.out.println(indices.get(indices.size() - 1));
    }

    private static void recursivePrint(int loopIndexOut, int stop, int step, List<Integer> indices) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        Collections.shuffle(indices);
        for (int i : indices.subList(0, indices.size() - 1)) {
            System.out.print(i + " ");
        }
        recursivePrint(loopIndexOut + step, stop, step, indices);
    }
}