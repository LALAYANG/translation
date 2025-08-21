import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class codeforces_519_B {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
        int n = Integer.parseInt(args[0]);
        int[] array_a = new int[n];
        for (int i = 0; i < n; i++) {
            array_a[i] = Integer.parseInt(args[i + 1]);
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(args[i + n + 1]);
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = Integer.parseInt(args[i + 2 * n + 1]);
        }
        int x = 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            x += array_a[i];
        }
        for (int i = 0; i < n; i++) {
            y += b[i];
        }
        for (int i = 0; i < n; i++) {
            y += c[i];
        }
        System.out.println(Math.abs(x - y));
        System.out.println(Math.abs(y - (x + y)));
    }
}