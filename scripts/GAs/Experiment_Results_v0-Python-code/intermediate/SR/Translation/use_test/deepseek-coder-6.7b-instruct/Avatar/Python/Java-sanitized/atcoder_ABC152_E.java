import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Main {
    private static int MOD;
    private static int N;
    private static int[] A;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        scanner.close();

        BlockingQueue<Integer> resultQueue = new ArrayBlockingQueue<>(1);
        Thread powerSumWorker = new Thread(() -> {
            int result = calculatePowerSum(7, 10, 9);
            try {
                resultQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        powerSumWorker.start();
        powerSumWorker.join();
        MOD = resultQueue.take();

        int lcm = calculateLcm(A);
        double ans = (double) lcm * sumOfInverseModulo(A, MOD) % MOD;
        System.out.println((int) ans % MOD);
    }

    private static int calculatePowerSum(int variable317, int variable417, int exponent) {
        return (int) Math.pow(variable417, exponent) + variable317;
    }

    private static int calculateLcm(int[] numbers) {
        int lcm = 1;
        for (int num : numbers) {
            lcm = lcm(lcm, num);
        }
        return lcm;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    private static int sumOfInverseModulo(int[] numbers, int mod) {
        int sum = 0;
        for (int num : numbers) {
            sum += pow(num, mod - 2, mod);
        }
        return sum % mod;
    }

    private static int pow(int base, int exponent, int mod) {
        int result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}