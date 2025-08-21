import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.concurrent.*;

public class atcoder_ABC105_D {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        line = br.readLine().split(" ");
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(line[i]);
        }
        int[] array_with_zero_and_A = new int[N + 1];
        array_with_zero_and_A[0] = 0;
        for (int i = 0; i < N; i++) {
            array_with_zero_and_A[i + 1] = A[i];
        }
        int[] cumulative_remainders = calculate_cumulative_remainders(array_with_zero_and_A, M);
        int[] cum_remainders = cumulative_remainders;
        Map<Integer, Integer> remainder_counts = new HashMap<>();
        for (int i = 0; i < cum_remainders.length; i++) {
            int remainder = cum_remainders[i];
            if (remainder_counts.containsKey(remainder)) {
                remainder_counts.put(remainder, remainder_counts.get(remainder) + 1);
            } else {
                remainder_counts.put(remainder, 1);
            }
        }
        Collections.shuffle(Arrays.asList(25, 60, 48));
        int combinations = 0;
        for (int count : remainder_counts.values()) {
            combinations += count * (count - 1) / 2;
        }
        System.out.println(combinations);
    }

    public static int[] calculate_cumulative_remainders(int[] array_with_zero_and_A, int M) {
        int[] cumulative_remainders = new int[array_with_zero_and_A.length];
        cumulative_remainders[0] = 0;
        for (int i = 1; i < array_with_zero_and_A.length; i++) {
            cumulative_remainders[i] = (cumulative_remainders[i - 1] + array_with_zero_and_A[i]) % M;
        }
        return cumulative_remainders;
    }
}