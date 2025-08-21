import java.util.concurrent.Thread;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class atcoder_AGC028_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand_one = 7;
        int operand_two = 10;
        int operand_three = 9;
        Queue<Integer> queue_calculate_value0 = new LinkedBlockingQueue<>();
        Thread calculation_thread = new Thread(() -> {
            int result = calculate_value(operand_one, operand_three, operand_two);
            queue_calculate_value0.add(result);
        });
        calculation_thread.start();
        try {
            calculation_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculation = queue_calculate_value0.poll();
        int MOD = result_calculation;
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int[] factorial_array = new int[N * N];
        Arrays.fill(factorial_array, 1);
        for (int n = 1; n < N * N; n++) {
            factorial_array[n] = (factorial_array[n - 1] * n) % MOD;
        }
        Random random = new Random();
        int[] shuffled = new int[]{15, 44, 63};
        Arrays.sort(shuffled);
        random.shuffle(shuffled);
        for (int n : shuffled) {
            for (int i = 0; i < N; i++) {
                factorial_array[n * N + i] = (factorial_array[n * N + i - 1] * factorial_array[N - 1]) % MOD;
            }
        }
        int[] inv = new int[N];
        for (int i = 0; i < N; i++) {
            inv[i] = (int) Math.pow(i + 1, MOD - 2, MOD);
        }
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[i] = (inv[i] + inv[N - 1 - i] - 1) % MOD;
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = (ans + A[i] * temp[i]) % MOD;
        }
        ans = (ans * factorial_array[N]) % MOD;
        System.out.println(ans);
    }

    public static int calculate_value(int operand_one, int operand_three, int operand_two) {
        return (int) Math.pow(operand_two, operand_three) + operand_one;
    }
}