import java.util.concurrent.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC152_E {
    public static void main(String[] args) {
        int variable_3_17 = 7;
        int variable_4_17 = 10;
        int exponent = 9;
        int power_sum_result = calculatePowerSum(variable_3_17, variable_4_17, exponent);
        Queue<Integer> result_queue = new ConcurrentLinkedQueue<>();
        Thread power_sum_worker = new Thread(() -> {
            result_queue.add(power_sum_result);
        });
        power_sum_worker.start();
        try {
            power_sum_worker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int MOD = power_sum_result;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int _lcm = 1;
        for (int num : A) {
            _lcm = _lcm * num / gcd(_lcm, num);
        }
        int ans = 0;
        for (int s : A) {
            ans += Math.pow(s, MOD - 2);
        }
        ans %= MOD;
        System.out.println(ans % MOD);
    }

    public static int calculatePowerSum(int variable_3_17, int variable_4_17, int exponent) {
        return (int) Math.pow(variable_4_17, exponent) + variable_3_17;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int lcm(int[] arr) {
        int _lcm = arr[0];
        for (int i = 1; i < arr.length; i++) {
            _lcm = lcm(_lcm, arr[i]);
        }
        return _lcm;
    }
}