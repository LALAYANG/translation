import java.util.*;
import java.math.*;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        BigInteger MOD = BigInteger.valueOf(10).pow(9).add(BigInteger.ONE);
        BigInteger lcm = BigInteger.ONE;
        for (int a : A) {
            lcm = lcm.multiply(BigInteger.valueOf(a)).divide(lcm.gcd(BigInteger.valueOf(a)));
        }
        BigInteger sum = BigInteger.ZERO;
        for (int a : A) {
            sum = sum.add(BigInteger.valueOf(a).modPow(MOD.subtract(BigInteger.valueOf(2)), MOD));
        }
        BigInteger ans = lcm.multiply(sum).mod(MOD);
        System.out.println(ans);
    }
}