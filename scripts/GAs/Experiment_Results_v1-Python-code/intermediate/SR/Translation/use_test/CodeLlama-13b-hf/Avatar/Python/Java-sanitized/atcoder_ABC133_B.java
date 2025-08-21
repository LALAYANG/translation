import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC133_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                points[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        int checker_one = 320;
        int checker_two = 70;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (checker_one & checker_two) {
                    if (Math.sqrt(squared_distance_sum(points[i], points[j], d, 1)) % 1 == 0) {
                        count = count + 1;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double squared_distance_sum(int[] x, int[] y, int d, int step) {
        double tmp = 0.0;
        if (step == 0 || (step > 0 && x.length - 1 < step) || (step < 0 && x.length - 1 > step)) {
            return tmp;
        }
        tmp += (x[step] - y[step]) * (x[step] - y[step]);
        return tmp + squared_distance_sum(x, y, d, step + 1);
    }
}