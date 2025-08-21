import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_ABC164_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int l = 2019;
        BigInteger[] m = new BigInteger[l + 1];
        int a = 0;
        int r = 0;
        for (int i = 0; i < l; i++) {
            m[i] = BigInteger.ZERO;
        }
        m[0] = BigInteger.ONE;
        for (int i = input.length() - 1; i >= 0; i--) {
            a += Integer.parseInt(input.substring(i, i + 1)) * BigInteger.valueOf(Math.pow(10, i)).modPow(l, l);
            r += m[a.mod(l).intValue()].intValue();
            m[a.mod(l).intValue()] = m[a.mod(l).intValue()].add(BigInteger.ONE);
        }
        System.out.println(r);
    }
}