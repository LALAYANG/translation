import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int addend = 7;
        int base = 10;
        int exponent = 9;
        int modulo = (int) Math.pow(base, exponent) + addend;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] c = new Integer[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        Arrays.sort(c, Collections.reverseOrder());
        int b = (int) Math.pow(2, 2 * n - 2) % modulo;
        int a = 2 * b % modulo;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % modulo;
        }
        System.out.println(ans);
    }
}