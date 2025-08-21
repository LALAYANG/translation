import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int variable_3_2 = 7;
        int variable_4_2 = 10;
        int variable_6_2 = 9;
        BlockingQueue<Integer> queue_power_sum = new LinkedBlockingQueue<>();

        Thread thread_power_sum0 = new Thread(() -> {
            int intermediate_result = power_sum(variable_6_2, variable_3_2, variable_4_2);
            queue_power_sum.put(intermediate_result);
        });
        thread_power_sum0.start();
        thread_power_sum0.join();
        int result_power_sum0 = queue_power_sum.get();
        int mod = result_power_sum0;
        int n = Integer.parseInt(args[0]);
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(args[i + 1]);
        }
        Arrays.sort(c, (a, b) -> b - a);
        int b = (int) Math.pow(2, 2 * n - 2, mod);
        int variable_4_12 = 2;
        BlockingQueue<Integer> queue_multiply_modulo0 = new LinkedBlockingQueue<>();

        Thread thread_multiply_modulo = new Thread(() -> {
            int intermediate_result = multiply_modulo(variable_4_12, mod, b);
            queue_multiply_modulo0.put(intermediate_result);
        });
        thread_multiply_modulo.start();
        thread_multiply_modulo.join();
        int result_multiply_modulo0 = queue_multiply_modulo0.get();
        int a = result_multiply_modulo0;
        int ans = 0;
        for (int index = 0; index < n; index++) {
            ans += c[index] * (a + index * b);
            ans = ans % mod;
        }
        System.out.println(ans);
    }

    public static int power_sum(int variable_6_2, int variable_3_2, int variable_4_2) {
        return (int) Math.pow(variable_4_2, variable_6_2) + variable_3_2;
    }

    public static int multiply_modulo(int variable_4_12, int mod, int b) {
        return (int) (variable_4_12 * b % mod);
    }
}