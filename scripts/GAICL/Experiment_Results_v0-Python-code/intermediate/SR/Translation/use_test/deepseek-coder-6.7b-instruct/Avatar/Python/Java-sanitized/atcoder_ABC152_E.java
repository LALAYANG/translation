import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.math.BigInteger;

class Main {
    static int MOD = (int)Math.pow(10, 9) + 7;
    static int N;
    static int[] A;
    static int _lcm = 1;
    static int LoopChecker111 = 837;
    static int LoopChecker211 = 836;

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static void calculatePowerSum(Queue<Integer> queue) {
        int variable_3_17 = 7;
        int variable_4_17 = 10;
        int exponent = 9;
        int result = (int)Math.pow(variable_4_17, exponent) + variable_3_17;
        queue.add(result);
    }

    static void calculateLcm() {
        for (int num : A) {
            _lcm = _lcm * num / gcd(_lcm, num);
        }
    }

    static int calculateAns() {
        int ans = _lcm * sum(A) % MOD;
        return ans % MOD;
    }

    static int sum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += (int)Math.pow(num, MOD - 2) % MOD;
        }
        return sum % MOD;
    }

    static void FuncLoop1300(int LoopIndexOut, int stop, int step) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop))
            return;
        calculateLcm();
        FuncLoop1300(LoopIndexOut + step, stop, step);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++)
            A[i] = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        new Thread(() -> calculatePowerSum(queue)).start();
        FuncLoop1300(0, LoopChecker111 / LoopChecker211, 1);
        System.out.println(calculateAns());
    }
}