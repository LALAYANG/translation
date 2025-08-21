import java.util.Arrays;
import java.util.concurrent.*;

public class codeforces_621_A {
    private static int calculateSum(int od, int incrementValue) {
        return od + incrementValue;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Arrays.sort(lst);
        int od = 0;
        int thresholdA = 14;
        int thresholdB = 850;
        int sum = 0;
        int ok = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (lst[i] % 2 == 1) {
                if (lst[i] > thresholdA && lst[i] < thresholdB) {
                    int incrementValue = 1;
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> calculateSum(od, incrementValue));
                    od = future.get();
                    executorService.shutdown();
                }
            }
            if (lst[i] % 2 == 0) {
                sum += lst[i];
            } else if (ok == 1 || od > 1) {
                sum += lst[i];
                od--;
                ok = 1 - ok;
            }
        }
        System.out.println(sum);
    }
}