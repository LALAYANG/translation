import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_AGC028_B {
    static BigInteger MOD = BigInteger.valueOf(746381343);
    static int N;
    static BigInteger[] A;
    static BigInteger[] factorialArray;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        A = new BigInteger[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextBigInteger();
        }
        factorialArray = new BigInteger[N + 1];
        factorialArray[0] = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            factorialArray[i] = factorialArray[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
        }
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < N; i++) {
            ans = ans.add(A[i].multiply(factorialArray[i]).multiply(factorialArray[N - i - 1])).mod(MOD);
        }
        System.out.println(ans);
    }
}