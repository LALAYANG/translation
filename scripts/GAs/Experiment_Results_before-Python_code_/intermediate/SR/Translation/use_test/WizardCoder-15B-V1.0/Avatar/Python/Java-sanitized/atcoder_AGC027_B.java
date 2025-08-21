import java.util.*;

public class atcoder_AGC027_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int[] S = new int[N];
        S[0] = A[0];
        for (int i = 1; i < N; i++) {
            S[i] = S[i - 1] + A[i];
        }
        int ans = Integer.MAX_VALUE;
        for (int k = 1; k <= N / 2; k++) {
            int E = k * X + 2 * sum(S, N - 2 * k - 1, -1, -k);
            ans = Math.min(ans, E);
        }
        System.out.println(ans + N * X + 5 * S[N - 1]);
    }

    public static int sum(int[] arr, int end, int step, int k) {
        int sum = 0;
        for (int i = end; i >= 0; i -= step) {
            sum += arr[i];
        }
        return sum * k;
    }
}