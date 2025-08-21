import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_622_A {
    public static void main(String[] args) {
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
        BlockingQueue<Integer> queueDiff = new LinkedBlockingQueue<>();

        Thread threadDiff = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = calculateDiff(variable318, l);
                queueDiff.put(result);
            }
        });
        threadDiff.start();
        threadDiff.join();
        int resultDiff = queueDiff.take();
        l = resultDiff;
        idxcnt = l * (l + 1) / 2;
        System.out.println(targetValue - idxcnt);
    }

    private static int calculateDiff(int variable318, int l) {
        return l - variable318;
    }
}