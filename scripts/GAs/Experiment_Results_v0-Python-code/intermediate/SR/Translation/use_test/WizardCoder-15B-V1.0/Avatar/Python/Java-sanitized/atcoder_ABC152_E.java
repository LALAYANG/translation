import java.util.*;
import java.math.*;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int MOD = 1000000007;
        int _lcm = 1;
        for (int num : A) {
            _lcm = (int) ((long) _lcm * num / Math.gcd(_lcm, num));
        }
        int ans = _lcm * sum(A, MOD - 2, MOD) % MOD;
        System.out.println(ans);
    }

    public static int sum(int[] A, int p, int MOD) {
        int ans = 0;
        for (int num : A) {
            ans = (ans + pow(num, p, MOD)) % MOD;
        }
        return ans;
    }

    public static int pow(int a, int b, int MOD) {
        int ans = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ans = (ans * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return ans;
    }
}