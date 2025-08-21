import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int variable_3_2 = 7;
        int variable_4_2 = 10;
        int variable_6_2 = 9;
        int mod = (int) Math.pow(2, 2 * variable_4_2 - 2);
        int variable_4_12 = 2;
        int b = (int) Math.pow(2, 2 * variable_4_2 - 2) % mod;
        int a = variable_4_12 * b % mod;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c, Collections.reverseOrder());
        int ans = 0;
        for (int index = 0; index < n; index++) {
            ans += c[index] * (a + index * b);
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}