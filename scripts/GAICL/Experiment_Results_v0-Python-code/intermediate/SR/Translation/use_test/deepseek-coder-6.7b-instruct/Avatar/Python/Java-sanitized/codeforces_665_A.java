import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_665_A {
    private static int variable_7_6 = 60;
    private static int variable_10_6 = 5;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int interval = scanner.nextInt();
        int t1 = scanner.nextInt();
        int end_time = scanner.nextInt();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(() -> calculateTime(variable_7_6, t1, variable_10_6, end_time));
        int result_calculate_time0 = future.get();
        int st = result_calculate_time0;
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) != 0) {
                if (now + interval > st) {
                    ans++;
                }
            }
            now += interval;
        }
        executorService.shutdown();
        System.out.println(ans);
    }

    private static int calculateTime(int variable_7_6, int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }
}