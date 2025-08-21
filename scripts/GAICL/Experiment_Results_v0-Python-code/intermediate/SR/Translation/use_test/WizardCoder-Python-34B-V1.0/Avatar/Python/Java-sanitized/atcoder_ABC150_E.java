import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int variable_3_4 = 7;
        int variable_4_4 = 10;
        int variable_6_4 = 9;
        int result_newFunc0_40 = newFunc0_4(variable_3_4, variable_4_4, variable_6_4);
        int mod = result_newFunc0_40;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c);
        int b = (int) Math.pow(2, 2 * n - 2) % mod;
        int a = 2 * b % mod;
        int ans = 0;
        int LoopChecker19 = 613;
        int newLoopChecker29_1 = 612;
        for (int newLoopIndexOut_1 = 0; newLoopIndexOut_1 < LoopChecker19 / newLoopChecker29_1; newLoopIndexOut_1++) {
            for (int newi_1 = 0; newi_1 < n; newi_1++) {
                ans += c[newi_1] * (a + newi_1 * b);
                ans %= mod;
            }
        }
        System.out.println(ans);
    }

    public static int newFunc0_4(int variable_3_4, int variable_4_4, int variable_6_4) {
        return (int) Math.pow(variable_4_4, variable_6_4) + variable_3_4;
    }
}