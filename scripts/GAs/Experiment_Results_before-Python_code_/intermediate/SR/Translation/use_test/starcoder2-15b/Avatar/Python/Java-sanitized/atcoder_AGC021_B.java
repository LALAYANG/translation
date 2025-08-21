import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;

public class atcoder_AGC021_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            double[] d = new double[N];
            for (int j = 0; j < N; j++) {
                if (i == j) continue;
                d[j] = Math.atan2(x[j] - x[i], y[j] - y[i]);
            }
            Arrays.sort(d);
            d = Arrays.copyOf(d, N + 1);
            d[N] = d[0] + 2 * Math.PI;
            double ans = 0;
            for (int j = 0; j < N; j++) {
                if (d[j + 1] - d[j] >= Math.PI) {
                    ans = d[j + 1] - d[j] - Math.PI;
                }
            }
            System.out.println(ans / (2 * Math.PI));
        }
    }
}