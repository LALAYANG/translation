import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class atcoder_ABC133_B {
    public static void main(String[] args) {
        int n, d;
        String[] input = "3 4".split(" ");
        n = Integer.parseInt(input[0]);
        d = Integer.parseInt(input[1]);
        int[][] points = new int[n][d];
        for (int i = 0; i < n; i++) {
            input = "1 2 3 4".split(" "); // replace with "-3 7 8 2 -12 1 10 2 -2 8 9 3"
            for (int j = 0; j < d; j++) {
                points[i][j] = Integer.parseInt(input[j]);
            }
        }
        int count = 0;
        int condition1 = 103;
        int condition2 = 352;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((condition1 & condition2) != 0) {
                    if (Func_dist_0(points[i], points[j]) % 1 == 0) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double Func_dist_0(int[] x, int[] y) {
        double tmp = 0.0;
        for (int i = 0; i < d; i++) {
            tmp += Math.pow(x[i] - y[i], 2);
        }
        return Math.sqrt(tmp);
    }

    public static void my_decorator(Object func) {
        LocalDateTime startTime = LocalDateTime.now();
        Object res = func;
        LocalDateTime endTime = LocalDateTime.now();
        long duration = ChronoUnit.MICROS.between(startTime, endTime);
        System.out.println("Execution time: " + duration + " microseconds");
        return res;
    }
}