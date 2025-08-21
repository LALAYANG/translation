import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int base = 10;
        int addend = 7;
        int exponent = 9;
        long result = computeFunction(base, addend, exponent);
        long mod = result;
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        long[] c = new long[count];
        for (int i = 0; i < count; i++) {
            c[i] = scanner.nextLong();
        }
        Arrays.sort(c);
        long b = pow(2, 2 * count - 2, mod);
        long a = 2 * b % mod;
        shuffle(new int[]{26, 70, 30});
        long ans = 0;
        for (int i = 0; i < count; i++) {
            ans += c[i] * (a + i * b) % mod;
        }
        ans = ans % mod;
        System.out.println(ans);
    }

    public static long computeFunction(int base, int addend, int exponent) {
        return (long) Math.pow(base, exponent) + addend;
    }

    public static long pow(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        return result;
    }

    public static void shuffle(int[] array) {
        // This is a placeholder for the shuffle function.
        // In the original Python code, the shuffle function is used but not defined.
        // So, I've left it as it is.
    }
}