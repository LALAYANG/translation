import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_342_B {
    public static void main(String[] args) {
        int n = 500;
        int m = 100000;
        int s = 103;
        int f = 77;
        int t = 1;
        int l = 417;
        int r = 476;
        int k = 1;
        int increment = 1;
        String res = "";
        int i = 1;
        int j = s;

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateSum(k, increment));
        executor.shutdown();

        while (j != f) {
            if (i > t && k < m) {
                (t, l, r) = R();
                increment = 1;
                k = future.get();
            }
            if (i == t && (l <= j <= r || l <= j + d <= r)) {
                res = res + "X";
            } else {
                res += c;
                j += d;
            }
            i += 1;
        }
        System.out.println(res);
    }

    private static int calculateSum(int k, int increment) {
        return k + increment;
    }
}