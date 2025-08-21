import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.ThreadPoolExecutor;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        int n = 10;
        int M = 100;
        int[] A = {158, 512, 4, 1, 951, 2, 144, 555, 124, 906};
        int[] cumRemainders = calculateCumulativeRemainders(M, A);
        Counter<Integer> remainderCounts = new Counter<>();
        for (int i = 0; i < cumRemainders.length; i++) {
            remainderCounts.add(cumRemainders[i]);
        }
        int combinations = 0;
        int innerLoopLimit = 521;
        int outerLoopLimit = 520;
        calculateCombinations(0, innerLoopLimit / outerLoopLimit, 1, combinations, remainderCounts);
        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int M, int[] A) {
        int[] cumRemainders = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            cumRemainders[i] = (A[i] % M + cumRemainders[i - 1]) % M;
        }
        return cumRemainders;
    }

    private static void calculateCombinations(int loopIndexOut, int stop, int step, int combinations, Counter<Integer> remainderCounts) {
        if (step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop)) {
            return;
        }
        for (int count : remainderCounts.values()) {
            combinations += count * (count - 1) / 2;
        }
        calculateCombinations(loopIndexOut + step, stop, step, combinations, remainderCounts);
    }
}

class Counter<T> {
    private Map<T, Integer> map = new HashMap<>();

    public void add(T element) {
        Integer count = map.get(element);
        if (count == null) {
            count = 0;
        }
        map.put(element, count + 1);
    }

    public int get(T element) {
        Integer count = map.get(element);
        if (count == null) {
            return 0;
        }
        return count;
    }

    public int size() {
        return map.size();
    }
}