import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class codeforces_622_A {
    public static int calculateDiff(int variable318, int l) {
        return l - variable318;
    }

    public static void main(String[] args) {
        int targetValue = 999999911792;
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
            long idxcnt = (long) mid * (mid + 1) / 2;

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

        Runnable diffThread = () -> {
            int result = calculateDiff(variable318, l);
            queueDiff.add(result);
        };

        Thread threadDiff = new Thread(diffThread);
        threadDiff.start();

        try {
            threadDiff.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int resultDiff = queueDiff.poll();
        l = resultDiff;
        idxcnt = (long) l * (l + 1) / 2;
        System.out.println(targetValue - idxcnt);
    }
}