import java.util.Scanner;
import org.apache.commons.math3.stat.inference.TTest;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class atcoder_ABC152_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
        }
        DescriptiveStatistics ds = new DescriptiveStatistics(n);
        double mean = ds.getMean();
        double stdDev = ds.getStandardDeviation();
        TTest tTest = new TTest();
        double t = tTest.t(N - 1, mean, stdDev, 0.05);
        double df = N - 1;
        double pValue = tTest.tTest(n[0], n[1], df, t);
        if (pValue < 0.05) {
            System.out.println("Different");
        } else {
            System.out.println("Same");
        }
    }
}