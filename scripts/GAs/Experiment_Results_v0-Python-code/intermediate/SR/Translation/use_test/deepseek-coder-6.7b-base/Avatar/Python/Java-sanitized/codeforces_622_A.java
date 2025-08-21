import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_622_A {
    public static void main(String[] args) {
        int targetValue = Integer.parseInt(System.console().readLine());
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
            if ((check114 & check214) != 0) {
                if ((check110 & check210) != 0) {
                    if ((check18 & check28) != 0) {
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
        Queue<Integer> queueDiff = new ConcurrentLinkedQueue<>();
        new Thread(() -> {
            int result = calculateDiff(variable318, l);
            queueDiff.add(result);
        }).start();
        int resultDiff = queueDiff.poll();
        l = resultDiff;
        int idxcnt = l * (l + 1) / 2;
        System.out.println(targetValue - idxcnt);
    }

    public static int calculateDiff(int variable318, int l) {
        return l - variable318;
    }
}