import java.util.Scanner;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int l = 2019;
        long[] m = new long[l + 1];
        m[0] = 1;
        long a = 0;
        long r = 0;
        for (int i = 0; i < s.length(); i++) {
            a = (a + (s.charAt(s.length() - i - 1) - '0') * powMod(10, i, l)) % l;
            r += m[(int) a];
            m[(int) a]++;
        }
        System.out.println(r);
    }

    private static long powMod(long a, int b, int m) {
        long result = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return result;
    }
}