import java.util.concurrent.Thread;
import java.util.concurrent.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int[] A = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int MOD = calculatePowerSum(7, 10, 9);
        int _lcm = 1;
        for (int num : A) {
            _lcm = _lcm * num / gcd(_lcm, num);
        }
        int ans = _lcm * sum(A, MOD - 2) % MOD;
        System.out.println(ans % MOD);
    }

    public static int calculatePowerSum(int variable_3_17, int variable_4_17, int exponent) {
        return variable_4_17 ** exponent + variable_3_17;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int sum(int[] A, int MOD) {
        return IntStream.range(0, A.length).map(i -> pow(A[i], MOD - 2, MOD)).sum();
    }

    public static int pow(int a, int b, int MOD) {
        if (b == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 0; i < b; i++) {
            result = (result * a) % MOD;
        }
        return result;
    }
}