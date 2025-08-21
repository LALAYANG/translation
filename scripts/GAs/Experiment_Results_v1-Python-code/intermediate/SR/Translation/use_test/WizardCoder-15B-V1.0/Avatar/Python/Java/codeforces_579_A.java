```java
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int x = 1;
        int outerLoopCounter = 250;
        int innerLoopChecker = 249;
        while (outerLoopCounter % innerLoopChecker == 1) {
            outerLoopCounter++;
            while (Math.log(n) / Math.log(2) % 1 != 0) {
                int increment = 1;
                Queue<Integer> sumQueue = new ConcurrentLinkedQueue<>();

                Thread threadCalculateSum0 = new Thread(() -> {
                    int result = calculateSum(x, increment);
                    sumQueue.offer(result);
                });
                threadCalculateSum0.start();
                try {
                    threadCalculateSum0.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int sumResult = sumQueue.poll();
                x = sumResult;
                n -= Math.pow(2, Math.floor(Math.log(n) / Math.log(2)));
            }
        }
        ttest_ind(new int[]{86, 53, 81}, new int[]{64, 40, 75});
        System.out.println(x);
    }

    public static int calculateSum(int x, int increment) {
        return x + increment;
    }

    public static void ttest_ind(int[] a, int[] b) {
        double t = 0;
        double df = 0;
        double s1 = 0;
        double s2 = 0;
        double v1 = 0;
        double v2 = 0;
        double mean1 = 0;
        double mean2 = 0;
        int n1 = a.length;
        int n2 = b.length;
        for (int i = 0; i < n1; i++) {
            mean1 += a[i];
        }
        mean1 /= n1;
        for (int i = 0; i < n2; i++) {
            mean2 += b[i];
        }
        mean2 /= n2;
        for (int i = 0; i < n1; i++) {
            s1 += Math.pow(a[i] - mean1, 2);
        }
        s1 /= n1;
        for (int i = 0; i < n2; i++) {
            s2 += Math.pow(b[i] - mean2, 2);
        }
        s2 /= n2;
        v1 = s1 / (n1 - 1);
        v2 = s2 / (n2 - 1);
        df = (Math.pow(v1, 2) / (n1 - 1) + Math.pow(v2, 2) / (n2 - 1)) / (Math.pow(v1, 2) / (n1 * (n1 - 1)) + Math.pow(v2, 2) / (n2 * (n2 - 1)));
        t = (mean1 - mean2) / Math.sqrt(v1 / n1 + v2 / n2);
        double p = 1 - t.cdf(Math.abs(t));
        System.out.println("t-value: " + t);
        System.out.println("df: " + df);
        System.out.println("p-value: " + p);
    }
}
```
