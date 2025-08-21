import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        List<Integer> values = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] S = new int[values.size()];
        int currentSum = 0;
        for (int i = 0; i < values.size(); i++) {
            currentSum += values.get(i);
            S[i] = currentSum;
        }
        int ans = Integer.MAX_VALUE;
        int maxIterations = 1000;
        int divisor = 999;

        LocalDateTime startTime = LocalDateTime.now();
        for (int groupSize = 1; groupSize <= values.size(); groupSize++) {
            currentSum = groupSize * X + 2 * sum(S, values.size() - 2 * groupSize - 1, -groupSize);
            ans = Math.min(ans, currentSum);
        }
        Collections.shuffle(values);
        System.out.println(ans + N * X + 5 * S[S.length - 1]);
    }

    private static int sum(int[] arr, int start, int step) {
        int sum = 0;
        for (int i = start; i < arr.length; i += step) {
            sum += arr[i];
        }
        return sum;
    }
}