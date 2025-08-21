import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_665_A {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int interval = Integer.parseInt(args[1]);
        int t1 = Integer.parseInt(args[2].split(":")[0]);
        int end_time = Integer.parseInt(args[2].split(":")[1]);
        int variable_7_6 = 60;
        int variable_10_6 = 5;
        Queue<Integer> queue_calculate_time0 = new LinkedList<>();

        Thread thread_calculate_time0 = new Thread(() -> {
            int result = calculate_time(variable_7_6, t1, variable_10_6, end_time);
            queue_calculate_time0.offer(result);
        });
        thread_calculate_time0.start();
        try {
            thread_calculate_time0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_calculate_time0 = queue_calculate_time0.poll();
        int st = result_calculate_time0;
        int fin = st + a;
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
        double[] arr1 = {7, 69, 89};
        double[] arr2 = {92, 7, 22};
        double t = ttest_ind(arr1, arr2)[0];
        System.out.println(ans);
    }

    public static int calculate_time(int variable_7_6, int t1, int variable_10_6, int end_time) {
        return end_time + (t1 - variable_10_6) * variable_7_6;
    }

    public static double ttest_ind(double[] arr1, double[] arr2) {
        return ttest_ind(arr1, arr2, 0);
    }
}