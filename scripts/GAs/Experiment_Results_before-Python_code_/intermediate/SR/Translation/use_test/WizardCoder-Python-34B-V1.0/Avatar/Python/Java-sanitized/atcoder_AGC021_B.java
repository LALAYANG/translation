import java.util.Scanner;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] X = new int[N];
        int[] Y = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = scanner.nextInt();
            Y[i] = scanner.nextInt();
        }
        double[] angles = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    angles[i] += Math.atan2(X[i] - X[j], Y[i] - Y[j]);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            double angle = angles[i] / (2 * Math.PI);
            System.out.printf("%.16f\n", angle);
        }
    }
}