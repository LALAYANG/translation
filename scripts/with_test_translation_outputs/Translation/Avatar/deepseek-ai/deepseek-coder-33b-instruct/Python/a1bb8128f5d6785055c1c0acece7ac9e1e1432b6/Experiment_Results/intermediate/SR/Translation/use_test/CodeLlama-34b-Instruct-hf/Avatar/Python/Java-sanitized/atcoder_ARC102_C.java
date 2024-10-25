import java.util.Scanner;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int mod = 998244353;
        int[] g1 = new int[K + 1];
        int[] g2 = new int[K + 1];
        int[] inverse = new int[K + 1];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= K; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i - 1]) % mod;
        }
        int[] ans = new int[2 * K + 1];
        for (int i = 2; i <= 2 * K; i++) {
            int p = (i - 1) / 2;
            int q = (i - 1) % 2;
            int tmp = cmb(p, q, mod) * kumiawase(N - p, p + (K - p * 2 - (i % 2 == 0 ? 1 : 0))) % mod;
            if (i % 2 == 0 && N - p - 1 >= 0) {
                tmp += cmb(p, q, mod) * kumiawase(N - p - 1, p + (K - p * 2 - (i % 2 == 0 ? 1 : 0))) % mod;
            }
            ans[i] = tmp;
            System.out.println(tmp);
        }
    }

    public static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, mod);
    }
}