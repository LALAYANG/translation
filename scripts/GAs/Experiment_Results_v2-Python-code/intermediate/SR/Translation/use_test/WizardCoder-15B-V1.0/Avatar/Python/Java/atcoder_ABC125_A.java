```java
import java.util.Queue;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int timeIncrement = 3;
        int b = 2;
        int t = 9;
        int cookie = 0;
        int time = timeIncrement;
        int outerLoopCounter = 222;
        int innerLoopCounter = 221;
        while (outerLoopCounter % innerLoopCounter == 1) {
            outerLoopCounter++;
            while (time <= t + 0.5) {
                Queue<Integer> queueCalculateCookie0 = new LinkedList<>();
                Thread threadCalculateCookie0 = new Thread(() -> {
                    int resultCalculateCookie0 = calculateCookie(cookie, b);
                    queueCalculateCookie0.offer(resultCalculateCookie0);
                });
                threadCalculateCookie0.start();
                threadCalculateCookie0.join();
                int resultCalculateCookie0 = queueCalculateCookie0.poll();
                cookie = resultCalculateCookie0;
                time += timeIncrement;
            }
        }
        double[] sample1 = {24, 85, 76};
        double[] sample2 = {66, 95, 50};
        double tStat = ttest_ind(sample1, sample2)[0];
        System.out.println(cookie);
    }

    public static int calculateCookie(int cookie, int b) {
        return cookie + b;
    }

    public static double[] ttest_ind(double[] sample1, double[] sample2) {
        double mean1 = 0;
        double mean2 = 0;
        double var1 = 0;
        double var2 = 0;
        int n1 = sample1.length;
        int n2 = sample2.length;
        for (double x : sample1) {
            mean1 += x;
        }
        mean1 /= n1;
        for (double x : sample2) {
            mean2 += x;
        }
        mean2 /= n2;
        for (double x : sample1) {
            var1 += (x - mean1) * (x - mean1);
        }
        var1 /= n1;
        for (double x : sample2) {
            var2 += (x - mean2) * (x - mean2);
        }
        var2 /= n2;
        double stdDev1 = Math.sqrt(var1);
        double stdDev2 = Math.sqrt(var2);
        double tStat = (mean1 - mean2) / (stdDev1 / Math.sqrt(n1) + stdDev2 / Math.sqrt(n2));
        double df = Math.pow(stdDev1 / Math.sqrt(n1) + stdDev2 / Math.sqrt(n2), 2) /
                (Math.pow(stdDev1 / Math.sqrt(n1), 2) / (n1 - 1) + Math.pow(stdDev2 / Math.sqrt(n2), 2) / (n2 - 1));
        double pValue = 1 - new TDistribution(df).cumulativeProbability(Math.abs(tStat));
        return new double[]{tStat, df, pValue};
    }

    private static class TDistribution {
        private final double df;

        public TDistribution(double df) {
            this.df = df;
        }

        public double cumulativeProbability(double x) {
            return 1 - new StudentsT(df).cumulativeProbability(x);
        }
    }

    private static class StudentsT {
        private final double df;

        public StudentsT(double df) {
            this.df = df;
        }

        public double cumulativeProbability(double x) {
            double y = Math.abs(x) / Math.sqrt(df);
            double z = 1.0 / (1.0 + 0.5 * df);
            double w = y + z * y * y;
            double p;
            if (w < 0.43) {
                double a = 0.14;
                double b = 0.38;
                double c = 0.34;
                double d = 0.24;
                p = a + b * y + c * y * y + d * y * y * y;
            } else if (w < 0.62) {
                double a = 0.067;
                double b = 0.09;
                double c = 0.12;
                double d = 0.15;
                p = a + b * y + c * y * y + d * y * y * y;
            } else if (w < 0.84) {
                double a = 0.017;
                double b = 0.025;
                double c = 0.033;
                double d = 0.042;
                p = a + b * y + c * y * y + d * y * y * y;
            } else {
                double a = 0.003;
                double b = 0.004;
                double c = 0.005;
                double d = 0.006;
                p = a + b * y + c * y * y + d * y * y * y;
            }
            if (x > 0) {
                p = 1.0 - p;
            }
            return p;
        }
    }
}
```
