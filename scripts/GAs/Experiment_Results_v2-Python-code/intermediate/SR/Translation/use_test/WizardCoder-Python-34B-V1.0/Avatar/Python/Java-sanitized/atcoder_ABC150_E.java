import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int addend = 7;
        int base = 10;
        int exponent = 9;
        int modulo = calculateValue(base, addend, exponent);
        int b = (int) Math.pow(2, 2 * n - 2) % modulo;
        int a = (2 * b) % modulo;
        int ans = 0;
        Arrays.sort(c);
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans %= modulo;
        }
        System.out.println(ans);
    }

    public static int calculateValue(int base, int addend, int exponent) {
        return (int) Math.pow(base, exponent) + addend;
    }
}