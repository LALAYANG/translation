import java.util.Scanner;
import java.lang.Math;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] x = new int[n];
        int m = 0;
        int q = 0;
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(x[i]);
        }
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                if (x[i] >= x[i + 1]) {
                    q = (int) Math.ceil((x[i] - x[i + 1]) / d);
                    m = m + q;
                    x[i + 1] = x[i + 1] + q * d;
                }
            }
        }
        System.out.println(m);
    }
}