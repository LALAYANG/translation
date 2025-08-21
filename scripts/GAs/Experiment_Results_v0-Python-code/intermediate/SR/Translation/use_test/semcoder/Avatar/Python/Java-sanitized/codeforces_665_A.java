import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_665_A {
    public static void main(String[] args) {
        int variable_7_6 = 60;
        int variable_10_6 = 5;
        Queue<Integer> queue_calculate_time0 = new LinkedBlockingQueue<>();

        int a = 15;
        int b = 24;
        int interval = 23;
        int bt = 6;
        int t1 = 21;
        int end_time = 15;

        int result = calculate_time(variable_7_6, t1, variable_10_6, end_time);
        queue_calculate_time0.add(result);

        int st = result;
        int fin = st + a;
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