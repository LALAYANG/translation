import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        int variable_3_17 = 7;
        int variable_4_17 = 10;
        int exponent = 9;
        int result_queue = 0;

        Thread power_sum_worker = new Thread(new Runnable() {
            @Override
            public void run() {
                result_queue = calculatePowerSum(variable_3_17, variable_4_17, exponent);
            }
        });

        power_sum_worker.start();
        power_sum_worker.join();

        int MOD = result_queue;
        int N = Integer.parseInt(args[0]);
        int[] A = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        int _lcm = 1;
        for (int num : A) {
            _lcm = _lcm * num / gcd(_lcm, num);
        }
        int ans = _lcm * sum(A, MOD - 2, MOD);
        System.out.println(ans % MOD);
    }

    private static int calculatePowerSum(int variable_3_17, int variable_4_17, int exponent) {
        return variable_4_17 ** exponent + variable_3_17;
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int sum(int[] A, int MOD, int exponent) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += pow(A[i], exponent, MOD);
        }
        return sum;
    }

    private static int pow(int a, int b, int MOD) {
        if (b == 0) {
            return 1;
        }
        int result = a;
        for (int i = 1; i < b; i++) {
            result = (result * a) % MOD;
        }
        return result;
    }
}