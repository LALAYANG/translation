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
        int[] shuffledXY = random.ints(XY_arr.length, 0, XY_arr.length).boxed().sorted().mapToInt(i -> XY_arr[i]).toArray();
        for (int i = 0; i < XY_arr.length; i++) {
            double[] D = new double[XY_arr.length - 1];
            for (int j = 0; j < XY_arr.length; j++) {
                if (i != j) {
                    D[j] = Math.atan2(XY_arr[i][0] - XY_arr[j][0], XY_arr[i][1] - XY_arr[j][1]);
                }
            }
            Arrays.sort(D);
            D = Arrays.copyOf(D, D.length + 1);
            D[D.length - 1] = D[0] + 2 * Math.PI;
            double ans = 0;
            for (int k = 0; k < D.length - 1; k++) {
                if ((condition_flag_2 & condition_flag_1) != 0 && D[k + 1] - D[k] >= Math.PI) {
                    ans += calculate_difference(D[k + 1], Math.PI, D[k]);
                }
            }
            System.out.printf("%.16f\n", ans / (2 * Math.PI));
            try {
                Thread.sleep(160);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            calculate_angles(LoopIndexOut + step, stop, step, XY_arr);
        }
    }

    public static double calculate_difference(double b, double pi, double a) {
        return b - a - pi;
    }
}