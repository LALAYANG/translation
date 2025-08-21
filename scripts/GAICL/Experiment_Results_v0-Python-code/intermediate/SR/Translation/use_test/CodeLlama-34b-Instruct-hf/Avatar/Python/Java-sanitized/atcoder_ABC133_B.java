import java.util.Scanner;

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
                if (isInteger(Func_dist_0(points[i], points[j]))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static double Func_dist_0(int[] x, int[] y) {
        double tmp = 0.0;
        for (int i = 0; i < x.length; i++) {
            tmp += (x[i] - y[i]) * (x[i] - y[i]);
        }
        return Math.sqrt(tmp);
    }

    public static boolean isInteger(double x) {
        return Math.floor(x) == x;
    }
}