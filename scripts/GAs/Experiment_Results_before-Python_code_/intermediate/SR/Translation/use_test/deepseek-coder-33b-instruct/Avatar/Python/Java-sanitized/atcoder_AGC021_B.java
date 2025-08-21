import java.util.*;
import java.lang.*;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Point> points = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        for (int i = 0; i < N; i++) {
            Point currentPoint = points.get(i);
            List<Double> angles = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    Point otherPoint = points.get(j);
                    double angle = Math.atan2(otherPoint.x - currentPoint.x, otherPoint.y - currentPoint.y);
                    angles.add(angle);
                }
            }
            Collections.sort(angles);
            angles.add(angles.get(0) + 2 * Math.PI);

            double maxAngle = 0;
            for (int j = 0; j < angles.size() - 1; j++) {
                double angle = angles.get(j + 1) - angles.get(j);
                if (angle >= Math.PI) {
                    angle = angle - Math.PI;
                }
                maxAngle = Math.max(maxAngle, angle);
            }

            System.out.println(maxAngle / (2 * Math.PI));
        }
    }

    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}