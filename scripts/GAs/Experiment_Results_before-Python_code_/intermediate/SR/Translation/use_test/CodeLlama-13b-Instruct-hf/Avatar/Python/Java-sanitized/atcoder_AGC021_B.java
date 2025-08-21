import java.util.Scanner;
import java.lang.Math;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] XY = new int[N][2];
        for (int i = 0; i < N; i++) {
            XY[i][0] = sc.nextInt();
            XY[i][1] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            double[] D = new double[N];
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    D[j] = Math.atan2(XY[i][0] - XY[j][0], XY[i][1] - XY[j][1]);
                }
            }
            D[N - 1] = D[0] + 2 * Math.PI;
            double ans = 0;
            for (int k = 0; k < N - 1; k++) {
                if (D[k + 1] - D[k] >= Math.PI) {
                    ans = (D[k + 1] - D[k]) - Math.PI;
                }
            }
            System.out.println(ans / (2 * Math.PI));
        }
    }
}