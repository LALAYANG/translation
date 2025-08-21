```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        int mod = 998244353;
        int[] g1 = new int[801];
        int[] g2 = new int[801];
        int[] inverse = new int[801];
        g1[0] = 1;
        g1[1] = 1;
        g2[0] = 1;
        g2[1] = 1;
        inverse[0] = 0;
        inverse[1] = 1;
        for (int i = 2; i <= 800; i++) {
            g1[i] = (g1[i - 1] * i) % mod;
            inverse[i] = (-inverse[mod % i] * (mod / i)) % mod;
            g2[i] = (g2[i - 1] * inverse[i]) % mod;
        }

        for (int i = 2; i <= 800; i++) {
            inverse[i] = (inverse[i] * (mod - inverse[mod % i]) * inverse[mod % i]) % mod;
        }

        for (int i = 2; i <= 800; i++) {
            g1[i] = (g1[i] * inverse[i]) % mod;
        }

        for (int i = 1; i <= K; i++) {
            System.out.println(combination_calculation(i + N - 1, i, mod) * another_combination_calc(N - i, i + (K - (N - i) * 2));
        }
    }

    public static int combination_calculation(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int another_combination_calc(int p, int q) {
        return combination_calculation(p + q - 1, q - 1, mod);
    }
}
``` 
