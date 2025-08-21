import java.util.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int X = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        long[] S = new long[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        long ans = Long.MAX_VALUE;
        for (int k = 1; k <= N; k++) {
            long E = k * X + 2 * sum(S, N - 2 * k - 1, -k);
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    private static long sum(long[] S, int end, int step) {
        long sum = 0;
        for (int i = end; i >= 0; i += step) {
            sum += S[i];
        }
        return sum;
    }
}