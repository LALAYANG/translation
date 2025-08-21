import java.util.*;
import java.math.*;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        int[] cum_remainders = calculateCumulativeRemainders(M, A);
        Map<Integer, Integer> remainderCounts = getRemainderCounts(cum_remainders);
        int combinations = calculateCombinations(remainderCounts);
        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int M, int[] A) {
        int[] cum_remainders = new int[A.length + 1];
        for (int i = 1; i <= A.length; i++) {
            cum_remainders[i] = (cum_remainders[i - 1] + A[i - 1]) % M;
        }
        return cum_remainders;
    }

    private static Map<Integer, Integer> getRemainderCounts(int[] cum_remainders) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int remainder : cum_remainders) {
            counts.put(remainder, counts.getOrDefault(remainder, 0) + 1);
        }
        return counts;
    }

    private static int calculateCombinations(Map<Integer, Integer> counts) {
        int combinations = 0;
        for (int count : counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        return combinations;
    }
}