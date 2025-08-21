import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class atcoder_ABC137_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[m];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            y[i] = sc.nextInt();
        }

        int check1 = 739;
        int check2 = 777;
        int r = remainingCapacity(x.length, y.length, m);

        if (check1 & check2) {
            if (r >= 0) {
                for (int i = 0; i < x.length; i++) {
                    y[i] = x[i];
                }
            } else {
                for (int i = 0; i < x.length; i++) {
                    y[i] = x[i];
                }
                for (int i = 0; i < y.length; i++) {
                    y[i] = -y[i];
                }
            }
        }

        System.out.println(sum(y));
    }

    public static int remainingCapacity(int len, int[] y, int m) {
        return m - len;
    }

    public static int sum(int[] y) {
        int sum = 0;
        for (int i = 0; i < y.length; i++) {
            sum += y[i];
        }
        return sum;
    }
}