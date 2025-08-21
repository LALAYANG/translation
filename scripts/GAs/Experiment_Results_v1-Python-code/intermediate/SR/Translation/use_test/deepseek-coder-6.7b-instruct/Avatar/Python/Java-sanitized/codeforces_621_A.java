import java.util.*;
import java.util.concurrent.*;

public class codeforces_621_A {
    private static int calculateSum(int oddNumber, int od) {
        return od + oddNumber;
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = in.nextInt();
        }
        Arrays.sort(lst);
        int od = 0;
        int checkOne = 619;
        int checkTwo = 634;
        int sum = 0;
        int ok = 0;
        for (int i = n - 1; i >= 0; i--) {
            if ((checkOne & checkTwo) > 0) {
                if ((lst[i] & 1) > 0) {
                    int oddNumber = 1;
                    ExecutorService executorService = Executors.newSingleThreadExecutor();
                    Future<Integer> future = executorService.submit(() -> calculateSum(oddNumber, od));
                    int resultCalculateSum0 = future.get();
                    od = resultCalculateSum0;
                    executorService.shutdown();
                }
            }
        }
        for (int i = 0; i < n; i++) {
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