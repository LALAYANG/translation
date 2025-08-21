import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC150_E {
    public static void main(String[] args) {
        int n = 10;
        int[] c = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int mod = 1000000007;
        int b = 1000000000;
        int a = 2000000000;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans %= mod;
        }
        System.out.println(ans);
    }
}