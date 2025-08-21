import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_621_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = Integer.parseInt(args[i + 1]);
        }

        int sum = 0;
        int od = 0;
        boolean ok = false;

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> future = executor.submit(() -> {
            for (int i = 0; i < n; i++) {
                if (lst[i] % 2 == 0) {
                    sum += lst[i];
                } else if (ok || od > 1) {
                    sum += lst[i];
                    od = od - 1;
                    ok = !ok;
                }
            }
            return sum;
        });

        try {
            sum = future.get(1, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(sum);
        executor.shutdown();
    }
}