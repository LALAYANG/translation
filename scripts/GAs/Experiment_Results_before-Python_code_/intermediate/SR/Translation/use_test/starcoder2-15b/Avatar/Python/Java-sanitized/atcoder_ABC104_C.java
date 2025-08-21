import java.util.*;

public class atcoder_ABC104_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        long ans = 1;
        int mod = 1000000007;
        int cnt = 0;
        for (int i = N - 1; i >= 0; i--) {
            if (A[i] < 0) {
                cnt++;
            }
            if (cnt >= K) {
                break;
            }
            ans = (ans * A[i]) % mod;
        }
        if (cnt < K) {
            for (int i = 0; i < K - cnt; i++) {
                ans = (ans * A[i]) % mod;
            }
        } else {
            for (int i = 0; i < K; i++) {
                ans = (ans * A[i]) % mod;
            }
        }
        System.out.println(ans);
    }
}