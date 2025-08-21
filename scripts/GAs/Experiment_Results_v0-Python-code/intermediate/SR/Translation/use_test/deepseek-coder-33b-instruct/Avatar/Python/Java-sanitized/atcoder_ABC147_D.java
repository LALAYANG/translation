import java.util.*;
import java.math.BigInteger;

public class atcoder_ABC147_D {
    static BigInteger xor_sum = BigInteger.ZERO;
    static int array_size;
    static int[] A;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        array_size = scanner.nextInt();
        A = new int[array_size];
        for (int i = 0; i < array_size; i++) {
            A[i] = scanner.nextInt();
        }
        calculateXorSum(0, 60, 1);
        System.out.println(xor_sum);
    }

    public static void calculateXorSum(int b, int stop, int step) {
        if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
            return;
        }
        int bitCount = 0;
        for (int i = 0; i < array_size; i++) {
            bitCount += (A[i] >> b) & 1;
        }
        xor_sum = xor_sum.add(BigInteger.valueOf(bitCount * (array_size - bitCount) * (1 << b)))
                .mod(BigInteger.valueOf(1000000007));
        calculateXorSum(b + step, stop, step);
    }
}