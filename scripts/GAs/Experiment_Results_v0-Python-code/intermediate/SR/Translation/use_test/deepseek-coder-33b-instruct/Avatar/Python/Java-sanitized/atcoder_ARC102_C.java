import java.util.Scanner;

public class atcoder_ARC102_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int num_items = scanner.nextInt();
        int mod = 998244353;

        for (int i = 2; i <= 2 * K + 1; i++) {
            if (i <= K + 1) {
                int n = i;
                int variable_3_45 = 2;
                int variable_6_45 = 1;
                int kumi = calculateCombinations(variable_6_45, n, variable_3_45);
                int ans = solve(kumi, num_items, K, mod);
                System.out.println(ans);
            } else {
                // This part is not implemented in the provided Python code
                // So, I can't provide a Java equivalent for this part
            }
        }
    }

    private static int calculateCombinations(int variable_6_45, int n, int variable_3_45) {
        return (n - variable_6_45) / variable_3_45;
    }

    private static int solve(int kumi, int num_items, int K, int mod) {
        int ans = 0;
        for (int p = 0; p <= kumi; p++) {
            if (p > num_items) {
                break;
            }
            ans += 2 ^ p * cmb(kumi, p, mod) * kumiawase(num_items - p, p + (K - kumi * 2));
        }
        return ans % mod;
    }

    private static int cmb(int n, int r, int mod) {
        // This method is not implemented in the provided Python code
        // So, I can't provide a Java equivalent for this method
        return 0;
    }

    private static int kumiawase(int p, int q) {
        // This method is not implemented in the provided Python code
        // So, I can't provide a Java equivalent for this method
        return 0;
    }
}