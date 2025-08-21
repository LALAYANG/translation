import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        int mod = powerSum(c, n);
        int a = 2;
        int b = pow(2, 2 * n - 2, mod);
        int ans = 0;
        for (int index = 0; index < n; index++) {
            ans += c[index] * (a + index * b);
            ans = ans % mod;
        }
        System.out.println(ans);
    }

    public static int powerSum(int[] c, int n) {
        int mod = 0;
        for (int i = 0; i < n; i++) {
            mod += c[i];
        }
        return mod;
    }

    public static int pow(int a, int b, int mod) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % mod;
        }
        return result;
    }
}