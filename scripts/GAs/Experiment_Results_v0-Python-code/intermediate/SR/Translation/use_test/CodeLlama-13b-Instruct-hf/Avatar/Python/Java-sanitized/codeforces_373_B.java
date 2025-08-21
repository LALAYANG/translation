import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_373_B {
    public static void main(String[] args) {
        int w = 462;
        int m = 183;
        int k = 8;
        int lo = 0;
        int hi = (int) Math.pow(10, 18);

        while (hi - lo > 1) {
            int check1 = 809;
            int check2 = 867;
            int variable_3_23 = 2;
            BlockingQueue<Integer> midpointQueue = new LinkedBlockingQueue<>();

            Thread midpointThread = new Thread(() -> {
                int midpoint = calculateMidpoint(lo, variable_3_23, hi);
                midpointQueue.put(midpoint);
            });
            midpointThread.start();
            midpointThread.join();
            int midpointResult = midpointQueue.get();
            int medianValue = midpointResult;
            int c = FuncSum0(m + medianValue - 1) - FuncSum0(m - 1);
            if ((check1 & check2) != 0) {
                if (c * k <= w) {
                    lo = medianValue;
                } else {
                    hi = medianValue;
                }
            }
        }
        System.out.println(lo);
    }

    private static int calculateMidpoint(int lo, int variable_3_23, int hi) {
        return (lo + hi) / variable_3_23;
    }

    private static int FuncSum0(int m) {
        int ret = 0;
        int powerOfTen = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(powerOfTen - 1, m);
            int prev = powerOfTen / 10;
            ret += (cur - prev + 1) * len;
            if (powerOfTen - 1 >= m) {
                break;
            }
            len = len + 1;
            powerOfTen *= 10;
        }
        return ret;
    }
}