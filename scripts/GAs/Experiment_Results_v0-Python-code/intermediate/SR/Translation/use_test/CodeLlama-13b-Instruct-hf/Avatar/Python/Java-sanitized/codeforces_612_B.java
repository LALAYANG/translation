import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_612_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = ThreadLocalRandom.current().nextInt(1, 101);
        }
        int[] variable_1_10 = new int[10];
        for (int i = 0; i < 10; i++) {
            variable_1_10[i] = i + 1;
        }
        int[] result_array = new int[n];
        for (int i = 0; i < n; i++) {
            result_array[i] = calculateProduct(variable_1_10, n);
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(result_array[i] - result_array[i - 1]);
        }
        System.out.println(res);
    }

    private static int calculateProduct(int[] variable_1_10, int n) {
        int result = 1;
        for (int i = 0; i < 10; i++) {
            result *= variable_1_10[i];
        }
        return result;
    }
}