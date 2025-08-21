import java.util.*;
import java.math.*;
public class atcoder_ABC152_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        BigInteger lcm = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            lcm = lcm.multiply(BigInteger.valueOf(A[i])).divide(lcm.gcd(BigInteger.valueOf(A[i])));
        }
        BigInteger ans = lcm.multiply(BigInteger.valueOf(N));
        BigInteger MOD = BigInteger.valueOf(1000000007);
        for (int i = 0; i < N; i++) {
            ans = ans.multiply(BigInteger.valueOf(A[i]).modInverse(MOD));
        }
        System.out.println(ans.mod(MOD).intValue());
    }
}