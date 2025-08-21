import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.BiFunction;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int M = Integer.parseInt(args[1]);
        int[] A = Arrays.stream(args[2].split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] cumulativeRemainders = calculateCumulativeRemainders(M, A);
        Map<Integer, Integer> remainderCounts = countRemainders(cumulativeRemainders);

        int combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += count * (count - 1) / 2;
        }

        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int M, int[] A) {
        int[] cumulativeRemainders = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            cumulativeRemainders[i] = (A[i] % M + cumulativeRemainders[i - 1]) % M;
        }
        return cumulativeRemainders;
    }

    private static Map<Integer, Integer> countRemainders(int[] cumulativeRemainders) {
        Map<Integer, Integer> remainderCounts = new HashMap<>();
        for (int remainder : cumulativeRemainders) {
            remainderCounts.put(remainder, remainderCounts.getOrDefault(remainder, 0) + 1);
        }
        return remainderCounts;
    }
}