import java.util.*;
import java.lang.*;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC133_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        double[][] points = new double[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = scanner.nextDouble();
            }
        }
        System.out.println(getCount(points, n, d));
    }

    public static int getCount(double[][] points, int n, int d) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (FuncDist0(points[i], points[j], d)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean FuncDist0(double[] x, double[] y, int d) {
        double[] sample1 = {25, 37, 42};
        double[] sample2 = {19, 15, 34};
        TTest tTest = new TTest();
        tTest.tTest(sample1, sample2);
        double tmp = 0.0;
        for (int i = 0; i < d; i++) {
            tmp += Math.pow(x[i] - y[i], 2);
        }
        return StatUtils.INSTANCE.rootMeanSquare(new double[]{tmp}, 2) % 1 == 0;
    }
}