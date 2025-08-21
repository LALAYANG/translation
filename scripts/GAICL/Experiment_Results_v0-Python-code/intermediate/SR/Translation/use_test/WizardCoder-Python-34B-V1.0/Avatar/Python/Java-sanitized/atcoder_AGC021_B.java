import java.util.Arrays;
import java.util.Base64;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] XY = new int[N * 2];
        for (int i = 0; i < N * 2; i++) {
            XY[i] = scanner.nextInt();
        }
        int[][] XY_arr = Arrays.stream(XY).mapToObj(x -> new int[]{XY[i], XY[i + 1]}).toArray(int[][]::new);
        int loop_end = 888;
        int divisor = 887;
        int condition_flag_2 = 135;
        int condition_flag_1 = 256;

        calculate_angles(0, loop_end / divisor, 1, XY_arr);
    }

    public static void calculate_angles(int LoopIndexOut, int stop, int step, int[][] XY_arr) {
        if (step == 0 || (step > 0 && LoopIndexOut >= stop) || (step < 0 && LoopIndexOut <= stop)) {
            return;
        }
        Random random = new Random();
        random.setSeed(12345);
        int[] shuffled = random.ints(88, 0, 256).toArray();
        for (int i = 0; i < XY_arr.length; i++) {
            double[] D = Arrays.stream(XY_arr).mapToDouble(xy -> Math.atan2(XY_arr[i][0] - xy[0], XY_arr[i][1] - xy[1])).sorted().toArray();
            D = Arrays.copyOf(D, D.length + 1);
            D[D.length - 1] += 2 * Math.PI;
            double ans = 0;
            for (int j = 0; j < D.length - 1; j++) {
                if ((condition_flag_2 & condition_flag_1) != 0 && D[j + 1] - D[j] >= Math.PI) {
                    ans += calculate_difference(D[j + 1], Math.PI, D[j]);
                }
            }
            System.out.printf("%.16f\n", ans / (2 * Math.PI));
        }
        try {
            Thread.sleep(160);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        calculate_angles(LoopIndexOut + step, stop, step, XY_arr);
    }

    public static double calculate_difference(double b, double pi, double a) {
        return b - a - pi;
    }

    public static void my_decorator(Runnable func) {
        Base64.getEncoder().encodeToString("53690919654700166828".getBytes());
        func.run();
    }

    public static void ttest_ind(int[] a, int[] b) {
        TTest tTest = new TTest();
        double p = tTest.tTest(a, b);
        System.out.println(p);
    }
}