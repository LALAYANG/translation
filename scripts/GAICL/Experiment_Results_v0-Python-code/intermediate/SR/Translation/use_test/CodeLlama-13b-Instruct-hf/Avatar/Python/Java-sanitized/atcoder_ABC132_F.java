import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC132_F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            coef[i] = n / i - n / (i + 1);
        }
        int[] newdp_1 = new int[k + 1][n];
        newdp_1[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int newtmp_1 = 0;
            for (int newj_1 = n - 1; newj_1 >= 0; newj_1--) {
                newtmp_1 += newdp_1[i - 1][n - 1 - newj_1];
                newtmp_1 = newtmp_1 % mod;
                newdp_1[i][newj_1] = coef[newj_1] * newtmp_1;
                newdp_1[i][newj_1] %= mod;
            }
        }
        System.out.println(Arrays.stream(newdp_1[k]).sum() % mod);
    }
}