import java.util.Scanner;

public class atcoder_ABC145_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        double result = solve(N, x, y);
        System.out.println(result);
    }

    public static double solve(int N, int[] x, int[] y) {
        double[] distances = new double[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    double distance = Math.sqrt(Math.pow(x[i] - x[j], 2) + Math.pow(y[i] - y[j], 2));
                    distances[i] += distance;
                }
            }
        }

        double totalDistance = 0;
        for (int i = 0; i < N; i++) {
            totalDistance += distances[i];
        }

        return totalDistance / N;
    }
}