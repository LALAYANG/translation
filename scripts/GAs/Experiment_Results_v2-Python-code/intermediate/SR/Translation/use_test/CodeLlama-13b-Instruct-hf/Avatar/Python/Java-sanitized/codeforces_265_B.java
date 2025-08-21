import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_265_B {
    public static void main(String[] args) {
        int inputNumber = Integer.parseInt(args[0]);
        int[] l = new int[inputNumber];
        for (int i = 0; i < inputNumber; i++) {
            l[i] = Integer.parseInt(args[i + 1]);
        }
        int minuend = 1;
        int ans = 0;
        for (int i = 0; i < l.length; i++) {
            ans += Math.abs(l[i] - minuend) + 1;
            minuend = l[i];
        }
        System.out.println(ans);
    }
}