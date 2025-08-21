import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<double[]> points = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            double[] point = new double[2];
            point[0] = scanner.nextDouble();
            point[1] = scanner.nextDouble();
            points.add(point);
        }

        for (int i = 0; i < N; i++) {
            List<Double> angles = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    double angle = Math.atan2(points.get(j)[1] - points.get(i)[1], points.get(j)[0] - points.get(i)[0]);
                    angles.add(angle);
                }
            }
            Collections.sort(angles);
            angles.add(angles.get(0) + 2 * Math.PI);

            double minDiff = Double.MAX_VALUE;
            for (int j = 0; j < angles.size() - 1; j++) {
                double diff = angles.get(j + 1) - angles.get(j);
                if (diff >= Math.PI) {
                    diff -= Math.PI;
                }
                minDiff = Math.min(minDiff, diff);
            }
            System.out.println(minDiff / (2 * Math.PI));
        }
    }
}