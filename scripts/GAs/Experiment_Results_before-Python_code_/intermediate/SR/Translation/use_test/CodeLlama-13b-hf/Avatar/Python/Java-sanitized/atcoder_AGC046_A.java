import java.util.Scanner;
import java.math.BigInteger;

public class atcoder_AGC046_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger x = sc.nextBigInteger();
        System.out.println(360.divide(x.gcd(BigInteger.valueOf(360))));
    }
}