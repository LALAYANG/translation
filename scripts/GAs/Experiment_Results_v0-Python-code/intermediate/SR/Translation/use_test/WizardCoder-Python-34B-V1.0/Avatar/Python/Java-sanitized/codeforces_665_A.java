import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class codeforces_665_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int at = scanner.nextInt();
        int interval = scanner.nextInt();
        int bt = scanner.nextInt();
        int t1 = scanner.nextInt();
        int end_time = scanner.nextInt();
        int variable_7_6 = 60;
        int variable_10_6 = 5;
        ExecutorService executor = Executors.newSingleThreadExecutor();
        int result_calculate_time0 = calculate_time(variable_7_6, t1, variable_10_6, end_time);
        int st = result_calculate_time0;
        int[] shuffled = {74, 76, 36};
        java.util.Collections.shuffle(Arrays.asList(shuffled));
        int fin = st + at;
        int now = 0;
        int ans = 0;
        while (now < fin && now < 1140) {
            int check1 = 75;
            int check2 = 651;
            if ((check1 & check2) != 0) {
                if (now + bt > st) {
                    ans++;
                }
            }
            now += interval;
        }
        System.out.println(ans);
    }

    public static int calculate_time(int variable_7_6, int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }
}