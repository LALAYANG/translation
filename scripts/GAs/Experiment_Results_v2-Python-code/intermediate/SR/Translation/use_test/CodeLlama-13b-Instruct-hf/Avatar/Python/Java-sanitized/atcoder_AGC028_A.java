import java.util.Collections;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC028_A {
    public static void main(String[] args) {
        // Shuffle an array of numbers
        int[] array = {2, 41, 7};
        Collections.shuffle(array);

        // Perform a t-test on two arrays of numbers
        double[] array1 = {47, 60, 47};
        double[] array2 = {85, 37, 73};
        TTest ttest = new TTest();
        double t = ttest.t(array1, array2);

        // Find the greatest common divisor of two numbers
        BigInteger a = BigInteger.valueOf(N);
        BigInteger b = BigInteger.valueOf(M);
        BigInteger gcd = a.gcd(b);

        // Print the result
        System.out.println(gcd);
    }
}