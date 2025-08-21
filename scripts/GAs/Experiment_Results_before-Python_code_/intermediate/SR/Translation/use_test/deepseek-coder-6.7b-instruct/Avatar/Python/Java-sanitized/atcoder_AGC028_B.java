import java.util.*;
import java.math.*;

public class atcoder_AGC028_B {
    static final BigInteger MOD = BigInteger.valueOf((long)Math.pow(10, 9) + 7);
    static final int N = (int)Math.pow(10, 6);
    static BigInteger[] fact = new BigInteger[N];
    static int Nsq = (int)Math.sqrt(N);

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger[] A = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            A[i] = in.nextBigInteger();
        }
        initFact();
        BigInteger ans = BigInteger.ZERO;
        BigInteger[] inv = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            inv[i] = BigInteger.ONE.subtract(BigInteger.valueOf(i + 1).modInverse(MOD));
        }
        for (int i = 1; i < n; i++) {
            inv[i] = inv[i].add(inv[i - 1]);
            inv[i] = inv[i].mod(MOD);
        }
        for (int i = 0; i < n; i++) {
            BigInteger temp = inv[i].add(inv[n - 1 - i]);
            temp = temp.subtract(BigInteger.ONE);
            ans = ans.add(A[i].multiply(temp));
            ans = ans.mod(MOD);
        }
        ans = ans.multiply(fact[n]);
        ans = ans.mod(MOD);
        System.out.println(ans);
    }

    static void initFact() {
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < N; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
            fact[i] = fact[i].mod(MOD);
        }
    }
}