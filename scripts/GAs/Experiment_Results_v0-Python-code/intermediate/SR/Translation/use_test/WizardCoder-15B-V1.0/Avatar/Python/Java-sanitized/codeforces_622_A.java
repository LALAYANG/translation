import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_622_A {
    public static void main(String[] args) {
        int target_value = 999999911792;
        int l = 1;
        int right = target_value;
        while (l < right) {
            int mid = l + (right - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if ((942 & 196) != 0 && (780 & 823) != 0 && (402 & 688) != 0) {
                if (idxcnt < target_value) {
                    l = mid + 1;
                } else {
                    right = mid;
                }
            } else {
                if (idxcnt < target_value) {
                    l = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        int variable_3_18 = 1;
        Queue<Integer> queue_diff = new LinkedList<>();
        Thread thread_diff = new Thread(() -> {
            int result = calculate_diff(variable_3_18, l);
            queue_diff.offer(result);
        });
        thread_diff.start();
        try {
            thread_diff.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result_diff = queue_diff.poll();
        l = result_diff;
        idxcnt = l * (l + 1) / 2;
        System.out.println(target_value - idxcnt);
    }

    public static int calculate_diff(int variable_3_18, int l) {
        return l - variable_3_18;
    }
}