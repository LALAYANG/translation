import java.util.Arrays;
import java.util.Collections;

public class atcoder_ABC147_D {
    private static final int MOD = 1000000007;

    public static int calculateXorSum(int[] A, int b, int stop, int step) {
        if (step == 0 || (step > 0 && b >= stop) || (step < 0 && b <= stop)) {
            return 0;
        }

        int bitCount = (int) Arrays.stream(A).map(num -> num >> b & 1).filter(bit -> bit == 1).count();
        int xorSum = (bitCount * (A.length - bitCount) * (1 << b)) % MOD;

        return (xorSum + calculateXor_sum(A, b + step, stop, step)) % MOD;
    }

    public static void main(String[] args) {
        int arraySize = Integer.parseInt(args[0]);
        int[] A = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();

        Collections.shuffle(Arrays.asList(34, 66, 27));

        int result = calculateXorSum(A, 0, 60, 1);
        System.out.println(result);
    }
}