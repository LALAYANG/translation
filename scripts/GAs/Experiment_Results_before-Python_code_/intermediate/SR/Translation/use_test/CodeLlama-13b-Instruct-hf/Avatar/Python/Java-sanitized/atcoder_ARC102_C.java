import java.util.Scanner;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int mod = 998244353;
        int __N = 8000;
        int[] g1 = new int[__N + 1];
        int[] g2 = new int[__N + 1];
        int[] inverse = new int[__N + 1];
        for (int i = 0; i <= __N; i++) {
            g1[i] = (i * (i + 1)) % mod;
            inverse[i] = (mod - i) % mod;
            g2[i] = (g1[i] * inverse[i]) % mod;
        }
        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            if (i <= K + 1) {
                int tmp = solve(i) % mod;
                ans[i] = tmp;
                System.out.println(tmp);
            } else {
                System.out.println(ans[2 * K - i]);
            }
        }
    }

    public static int solve(int n) {
        int K = n / 2;
        int N = K + 1;
        int mod = 998244353;
        int[] g1 = new int[__N + 1];
        int[] g2 = new int[__N + 1];
        int[] inverse = new int[__N + 1];
        for (int i = 0; i <= __N; i++) {
            g1[i] = (i * (i + 1)) % mod;
            inverse[i] = (mod - i) % mod;
            g2[i] = (g1[i] * inverse[i]) % mod;
        }
        int ans = 0;
        for (int p = 0; p <= K; p++) {
            if (p > N) {
                break;
            }
            ans += (int) Math.pow(2, p) * cmb(K, p, mod) * kumiawase(N - p, p + (K - K * 2 - (n % 2 == 0 ? 1 : 0)));
            if (n % 2 == 0 && N - p - 1 >= 0) {
                ans += (int) Math.pow(2, p) * cmb(K, p, mod) * kumiawase(N - p - 1, p + (K - K * 2 - (n % 2 == 0 ? 1 : 0)));
            }
        }
        return ans;
    }

    public static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return (int) (g1[n] * g2[r] * g2[n - r] % mod);
    }

    public static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }
}