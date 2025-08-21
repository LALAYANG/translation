import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_665_A {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new LinkedBlockingQueue<>();
        int a = Integer.parseInt(args[0]);
        int at = Integer.parseInt(args[1]);
        int interval = Integer.parseInt(args[2]);
        int bt = Integer.parseInt(args[3]);
        int t1 = Integer.parseInt(args[4]);
        int end_time = Integer.parseInt(args[5]);
        int variable_7_6 = 60;
        int variable_10_6 = 5;
        Thread thread = new Thread(() -> {
            int result = calculateTime(variable_7_6, t1, variable_10_6, end_time);
            queue.add(result);
        });
        thread.start();
        thread.join();
        int st = queue.poll();
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

    public static int calculateTime(int variable_7_6, int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }
}