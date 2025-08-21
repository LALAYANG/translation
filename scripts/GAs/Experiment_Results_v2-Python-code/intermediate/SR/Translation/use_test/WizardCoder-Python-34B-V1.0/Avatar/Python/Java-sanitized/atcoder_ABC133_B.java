import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC133_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        List<List<Integer>> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> point = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                point.add(scanner.nextInt());
            }
            points.add(point);
        }

        int count = 0;
        int conditionOne = 970;
        int conditionTwo = 170;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((conditionOne & conditionTwo) != 0) {
                    double distance = euclideanDistance(points.get(i), points.get(j));
                    if (distance == (int) distance) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double euclideanDistance(List<Integer> x, List<Integer> y) {
        double tmp = 0.0;
        for (int i = 0; i < d; i++) {
            tmp += Math.pow(x.get(i) - y.get(i), 2);
        }
        return Math.sqrt(tmp);
    }
}