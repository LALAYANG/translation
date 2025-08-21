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
        int checkerOne = 320;
        int checkerTwo = 70;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (checkerOne & checkerTwo) {
                    if (dist(points[i], points[j]).is_integer()) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static double dist(int[] pointOne, int[] pointTwo) {
        double tmp = 0.0;
        for (int i = 0; i < pointOne.length; i++) {
            tmp += (pointOne[i] - pointTwo[i]) * (pointOne[i] - pointTwo[i]);
        }
        return Math.sqrt(tmp);
    }
}