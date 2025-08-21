import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    static int variable_3_18 = 1;
    static int l;
    static int target_value;

    static int calculate_diff(int variable_3_18, int l) {
        return l - variable_3_18;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        target_value = scanner.nextInt();
        l = 1;
        int right = target_value;
        while (l < right) {
            int check114 = 942;
            int check214 = 196;
            int check110 = 780;
            int check210 = 823;
            int check18 = 402;
            int check28 = 688;
            int mid = l + (right - l) / 2;
            long idxcnt = mid * (mid + 1) / 2;
            if ((check114 & check214) != 0 && (check110 & check210) != 0 && (check18 & check28) != 0 && idxcnt < target_value) {
                l = mid + 1;
            } else {
                right = mid;
            }
        }
        variable_3_18 = 1;
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculate_diff(variable_3_18, l));
        l = future.get();
        long idxcnt = l * (l + 1) / 2;
        System.out.println((int) (target_value - idxcnt));
        executorService.shutdown();
    }
}