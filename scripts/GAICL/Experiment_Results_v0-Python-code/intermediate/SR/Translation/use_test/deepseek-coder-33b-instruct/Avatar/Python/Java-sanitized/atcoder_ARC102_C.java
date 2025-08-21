import java.util.Scanner;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int num_items = scanner.nextInt();

        for (int i = 2; i <= 2 * K + 1; i++) {
            if (i <= K + 1) {
                System.out.println(solve(i, K, num_items));
            } else {
                System.out.println(i);
            }
        }
    }

    public static int solve(int n, int K, int num_items) {
        int ans = 0;
        int variable_3_45 = 2;
        int variable_6_45 = 1;
        int kumi = calculateCombinations(variable_6_45, n, variable_3_45);
        for (int p = 0; p <= kumi; p++) {
            if (p > num_items) {
                break;
            }
            ans += 2 ^ p * cmb(kumi, p, 998244353) * kumiawase(num_items - p, p + (K - kumi * 2 - (n % 2 == 0 ? 0 : 1)));
            if (n % 2 == 0 && num_items - p - 1 >= 0) {
                ans += 2 ^ p * cmb(kumi, p, 998244353) * kumiawase(num_items - p - 1, p + (K - kumi * 2 - (n % 2 == 0 ? 0 : 1)));
            }
        }
        return ans;
    }

    public static int calculateCombinations(int variable_6_45, int n, int variable_3_45) {
        return (n - variable_6_45) / variable_3_45;
    }

    public static int cmb(int n, int r, int mod) {
        if (r < 0 || r > n) {
            return 0;
        }
        r = Math.min(r, n - r);
        return g1[n] * g2[r] * g2[n - r] % mod;
    }

    public static int kumiawase(int p, int q) {
        return cmb(p + q - 1, q - 1, 998244353);
    }

    static int[] g1 = new int[8000];
    static int[] g2 = new int[8000];
}