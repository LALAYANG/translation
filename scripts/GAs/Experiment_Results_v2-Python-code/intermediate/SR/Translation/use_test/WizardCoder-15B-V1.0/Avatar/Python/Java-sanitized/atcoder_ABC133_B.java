import java.util.*;
import java.lang.*;
import java.io.*;

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
                if (euclideanDistance(points[i], points[j]) == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static int euclideanDistance(int[] x, int[] y) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += (x[i] - y[i]) * (x[i] - y[i]);
        }
        return (int) Math.sqrt(sum);
    }
}