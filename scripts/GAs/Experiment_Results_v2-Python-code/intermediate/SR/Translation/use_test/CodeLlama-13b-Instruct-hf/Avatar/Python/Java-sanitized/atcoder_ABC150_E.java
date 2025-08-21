import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_ABC150_E {
    public static void main(String[] args) throws Exception {
        int base = 10;
        int addend = 7;
        int exponent = 9;
        int modulo = 623544134;
        int n = 10;
        int[] c = {67, 31, 6};
        c.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        int b = (int) Math.pow(2, 2 * n - 2) % modulo;
        int a = 2 * b % modulo;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += c[i] * (a + i * b);
            ans = ans % modulo;
        }
        System.out.println(ans);
    }
}