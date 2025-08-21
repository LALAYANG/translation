import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        int N = 10;
        int M = 100;
        int[] A = new int[] {158, 512, 4, 1, 951, 2, 144, 555, 124, 906};
        int[] cumulativeRemainders = calculateCumulativeRemainders(A, M);
        int[] remainderCounts = countRemainders(cumulativeRemainders);
        int combinations = calculateCombinations(remainderCounts);
        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int[] A, int M) {
        int[] cumulativeRemainders = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            cumulativeRemainders[i] = (A[i] % M + cumulativeRemainders[i - 1]) % M;
        }
        return cumulativeRemainders;
    }

    private static int[] countRemainders(int[] cumulativeRemainders) {
        int[] remainderCounts = new int[cumulativeRemainders.length];
        for (int i = 0; i < cumulativeRemainders.length; i++) {
            remainderCounts[i] = (cumulativeRemainders[i] + 1) % 2;
        }
        return remainderCounts;
    }

    private static int calculateCombinations(int[] remainderCounts) {
        int combinations = 0;
        for (int i = 0; i < remainderCounts.length; i++) {
            combinations += remainderCounts[i] * (remainderCounts[i] - 1) / 2;
        }
        return combinations;
    }
}