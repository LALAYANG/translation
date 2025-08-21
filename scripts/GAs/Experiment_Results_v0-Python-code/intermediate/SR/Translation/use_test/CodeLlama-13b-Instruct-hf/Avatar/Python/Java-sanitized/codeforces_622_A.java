import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class codeforces_622_A {
    public static void main(String[] args) throws Exception {
        int targetValue = Integer.parseInt(args[0]);
        int l = 1;
        int right = targetValue;
        while (l < right) {
            int check114 = 942;
            int check214 = 196;
            int check110 = 780;
            int check210 = 823;
            int check18 = 402;
            int check28 = 688;
            int mid = l + (right - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (check114 & check214) {
                if (check110 & check210) {
                    if (check18 & check28) {
                        if (idxcnt < targetValue) {
                            l = mid + 1;
                        } else {
                            right = mid;
                        }
                    }
                }
            }
        }
        int variable318 = 1;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(() -> calculateDiff(variable318, l));
        int resultDiff = future.get();
        l = resultDiff;
        int idxcnt = l * (l + 1) / 2;
        System.out.println(targetValue - idxcnt);
    }

    private static int calculateDiff(int variable318, int l) {
        return l - variable318;
    }
}