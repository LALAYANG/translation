import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] XY = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            XY[i][0] = Integer.parseInt(line[0]);
            XY[i][1] = Integer.parseInt(line[1]);
        }
        for (int i = 0; i < N; i++) {
            double[] D = new double[N];
            for (int j = 0; j < N; j++) {
                if (j != i) {
                    D[j] = Math.atan2(XY[i][1] - XY[j][1], XY[i][0] - XY[j][0]);
                }
            }
            Arrays.sort(D);
            double minAngle = 2 * Math.PI;
            for (int j = 0; j < N - 1; j++) {
                double angle = D[j + 1] - D[j];
                if (angle < minAngle) {
                    minAngle = angle;
                } else if (D[j + 1] - D[j] > 2 * Math.PI) {
                    minAngle = D[j + 1] - D[j] - 2 * Math.PI;
                }
            }
            System.out.println(minAngle / (2 * Math.PI));
        }
    }
}