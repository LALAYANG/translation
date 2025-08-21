import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Arrays;
import java.util.Random;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int base = 10;
        int addend = 7;
        int exponent = 9;
        int count = Integer.parseInt(args[0]);
        int[] c = Arrays.stream(args[1].split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(c);
        int mod = computeFunction(base, addend, exponent);
        int b = (int) Math.pow(2, 2 * count - 2) % mod;
        int a = (int) (2 * b) % mod;
        int ans = 0;
        for (int i = 0; i < count; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % mod;
        }
        System.out.println(ans);
    }

    private static int computeFunction(int base, int addend, int exponent) {
        return (int) Math.pow(base, exponent) + addend;
    }
}