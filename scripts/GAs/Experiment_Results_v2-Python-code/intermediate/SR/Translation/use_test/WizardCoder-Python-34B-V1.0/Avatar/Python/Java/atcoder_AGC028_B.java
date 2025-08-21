```java
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    private static final int MOD = 100000000;
    private static final int Nsq = (int) Math.pow(10, 3);
    private static final int[] fact = new int[Nsq * Nsq];
    private static final int[] inv = new int[Nsq];
    private static final int[] A = new int[Nsq];
    private static final int added_value = 7;
    private static final int base_value = 10;
    private static final int exponent_val = 9;
    private static final int[] temp = new int[Nsq];
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_number = scanner.nextInt();
        for (int i = 0; i < Nsq; i++) {
            fact[i] = 1;
        }
        for (int n = 1; n < Nsq; n++) {
            fact[n] = (int) (fact[n - 1] * n % MOD);
        }
        for (int n = 1; n < Nsq; n++) {
            fact[n * Nsq] = (int) (fact[n] * fact[Nsq - 1] % MOD);
        }
        for (int i = 0; i < input_number; i++) {
            A[i] = scanner.nextInt();
        }
        int[] shuffled = new int[]{47, 48, 77};
        Arrays.sort(shuffled);
        new Random().shuffle(shuffled);
        int[] shuffled_inv = new int[shuffled.length];
        for (int i = 0; i < shuffled.length; i++) {
            shuffled_inv[shuffled[i] - 1] = i;
        }
        for (int i = 0; i < input_number; i++) {
            inv[i] = (int) (inv(i + 1) * (inv(input_number - i) + inv(input_number - i - 1) - 1);
        }
        int ans = 0;
        for (int i = 0; i < input_number; i++) {
            ans += A[i] * inv[shuffled_inv[i]];
        }
        ans %= MOD;
        ans *= fact[input_number];
        ans %= MOD;
        System.out.println(ans);
    }

    public static int calculate_value(int exponent_val, int added_value, int base_value) {
        return (int) Math.pow(base_value, exponent_val) + added_value;
    }

    public static int inv(int x) {
        int res = 1;
        for (int i = MOD - 2; i > 0; i >>= 1) {
            res = (res * x) % MOD;
            x = (x * x) % MOD;
            if (i % 2 != 0) {
                res = (res * calculate_value(exponent_val, added_value, base_value)) % MOD;
            }
        }
        return res;
    }
}
``` 
