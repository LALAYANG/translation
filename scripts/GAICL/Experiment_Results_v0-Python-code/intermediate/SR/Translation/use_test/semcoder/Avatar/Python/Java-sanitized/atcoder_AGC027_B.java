import java.util.Scanner;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }

        int[] S = new int[N];
        S[0] = values[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + values[i];
        }

        int ans = Integer.MAX_VALUE;
        for (int groupSize = 1; groupSize <= N; groupSize++) {
            int currentSum = groupSize * X + 2 * sumExtraCost(N, groupSize, S);
            ans = Math.min(ans, currentSum);
        }

        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    private static int sumExtraCost(int N, int groupSize, int[] S) {
        int sum = 0;
        for (int i = N - 2 * groupSize - 1; i >= 0; i -= groupSize) {
            sum += S[i];
        }
        return sum;
    }
}