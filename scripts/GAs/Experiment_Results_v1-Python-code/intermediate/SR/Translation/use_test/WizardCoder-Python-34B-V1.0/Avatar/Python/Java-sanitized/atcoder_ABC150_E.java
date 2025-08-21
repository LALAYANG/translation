import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int addend = 7;
        int base = 10;
        int exponent = 9;
        int mod = (int) Math.pow(base, exponent);
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] c = new int[count];
        for (int i = 0; i < count; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c);
        int b = (int) Math.pow(2, 2 * count - 2, mod);
        int a = (2 * b) % mod;
        int ans = 0;
        for (int i = 0; i < count; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }
}