import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c);
        int mod = (int) Math.pow(2, 32);
        int b = (int) Math.pow(2, 2 * n - 2) % mod;
        int variable_4_12 = 2;
        int a = (variable_4_12 * b) % mod;
        int ans = 0;
        for (int index = 0; index < n; index++) {
            ans += c[index] * (a + index * b) % mod;
            ans = ans % mod;
        }
        System.out.println(ans);
    }
}