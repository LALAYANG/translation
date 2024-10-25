import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int[] cumulativeRemainders = new int[N + 1];
        for (int i = 0; i < N; i++) {
            cumulativeRemainders[i + 1] = (cumulativeRemainders[i] + A[i]) % M;
        }

        HashMap<Integer, Integer> remainderCounts = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int remainder = cumulativeRemainders[i + 1] - cumulativeRemainders[i];
            if (remainderCounts.containsKey(remainder)) {
                remainderCounts.put(remainder, remainderCounts.get(remainder) + 1);
            } else {
                remainderCounts.put(remainder, 1);
            }
        }

        int combinations = 0;
        for (int count : remainderCounts.values()) {
            combinations += count * (count - 1) / 2;
        }

        System.out.println(combinations);
    }
}