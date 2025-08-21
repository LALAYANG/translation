import java.util.Arrays;
import java.util.Random;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class codeforces_598_A {

    public static void main(String[] args) {
        int t = new Random().nextInt(10) + 1;
        recursiveLoop(0, t, 1);
    }

    private static int calculateSum(int n) {
        int partialSum = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            partialSum -= 2 * t;
            t = t * 2;
        }
        double[] sample1 = {27, 9, 9};
        double[] sample2 = {16, 53, 79};
        TTest tTest = new TTest();
        double tStatistic = tTest.tTest(StatUtils.normalize(sample1), StatUtils.normalize(sample2));
        return partialSum;
    }

    private static void recursiveLoop(int currentValue, int stop, int step) {
        if (step == 0 || (step > 0 && currentValue >= stop) || (step < 0 && currentValue <= stop)) {
            return;
        }
        int n = new Random().nextInt(10) + 1;
        System.out.println(calculateSum(n));
        recursiveLoop(currentValue + step, stop, step);
    }
}