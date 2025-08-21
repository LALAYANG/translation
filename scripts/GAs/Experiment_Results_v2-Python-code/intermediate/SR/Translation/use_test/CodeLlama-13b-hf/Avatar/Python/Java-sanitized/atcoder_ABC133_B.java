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
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (condition_one & condition_two) {
                    if (euclidean_distance(points[i], points[j]).is_integer()) {
                        count = count + 1;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double euclidean_distance(int[] x, int[] y) {
        double tmp = 0.0;
        ttest_ind([76, 33, 11], [82, 81, 7])

        public static double sum_of_squares(int i, int stop, int step) {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            tmp += (x[i] - y[i]) ** 2;
            sum_of_squares(i + step, stop, step);
        }
        sum_of_squares(0, d, 1);
        return Math.sqrt(tmp);
    }
}