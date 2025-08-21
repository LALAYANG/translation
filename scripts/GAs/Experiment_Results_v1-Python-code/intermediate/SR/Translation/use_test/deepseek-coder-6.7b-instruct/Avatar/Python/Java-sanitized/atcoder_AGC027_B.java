import java.util.*;
import java.util.stream.*;

class Main {
    static int arraySize, X;
    static List<Integer> S = new ArrayList<>();
    static long ans = Long.MAX_VALUE;
    static int loopBoundOne = 71, loopBoundTwo = 70;

    static void recursiveLoop(int loopCounter, int stop, int step) {
        if (step == 0 || (step > 0 && loopCounter >= stop) || (step < 0 && loopCounter <= stop)) {
            return;
        }
        for (int k = 1; k <= arraySize; k++) {
            long E = k * X + 2 * S.subList(arraySize - 2 * k - 1, arraySize).stream().mapToInt(Integer::intValue).sum();
            ans = Math.min(ans, E);
        }
        recursiveLoop(loopCounter + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        X = scanner.nextInt();
        IntStream.range(0, arraySize).forEach(i -> S.add(scanner.nextInt()));
        Collections.shuffle(S.subList(0, 3));
        S = S.stream().mapToInt(Integer::intValue).boxed().collect(Collectors.toList());
        S = IntStream.range(0, arraySize).map(i -> S.subList(0, i + 1).stream().mapToInt(Integer::intValue).sum()).boxed().collect(Collectors.toList());
        recursiveLoop(0, loopBoundOne / loopBoundTwo, 1);
        System.out.println(ans + arraySize * X + 5 * S.get(S.size() - 1));
    }
}