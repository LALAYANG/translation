import java.util.*;
import java.math.*;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int lcm = 1;
        for (int i = 0; i < n; i++) {
            lcm = lcm(lcm, a[i]);
        }
        int ans = lcm;
        for (int i = 0; i < n; i++) {
            ans = (ans * pow(a[i], MOD - 2, MOD)) % MOD;
        }
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int pow(int a, int b, int mod) {
        int res = 1;
        a %= mod;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}