import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mod = (int) Math.pow(10, 9) + 7;
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        java.util.Arrays.sort(c);
        int b = (int) Math.pow(2, 2 * n - 2) % mod;
        int a = 2 * b % mod;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }
}