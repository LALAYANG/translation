import java.util.*;
import java.math.*;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        int MOD = (int) Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        BigInteger lcm = BigInteger.ONE;
        for (int num : A) {
            lcm = lcm.multiply(BigInteger.valueOf(num)).divide(lcm.gcd(BigInteger.valueOf(num)));
        }
        BigInteger ans = BigInteger.ZERO;
        for (int s : A) {
            ans = ans.add(BigInteger.valueOf(s).modPow(BigInteger.valueOf(MOD - 2), BigInteger.valueOf(MOD)));
        }
        ans = ans.multiply(lcm).mod(BigInteger.valueOf(MOD));
        System.out.println(ans);
    }
}