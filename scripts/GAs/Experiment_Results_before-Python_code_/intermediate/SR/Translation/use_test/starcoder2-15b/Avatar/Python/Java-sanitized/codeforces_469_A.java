import java.util.Scanner;

public class codeforces_469_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k1 = in.nextInt();
        int k2 = in.nextInt();
        double[] a1 = new double[1001];
        double[] a2 = new double[1001];
        for (int i = 0; i < k1; i++) {
            int n = in.nextInt();
            double a = in.nextDouble();
            a1[n] = a;
        }
        for (int i = 0; i < k2; i++) {
            int n = in.nextInt();
            double a = in.nextDouble();
            a2[n] = a;
        }
        int k = 0;
        double[] a = new double[1001];
        for (int i = 0; i < 1001; i++) {
            a[i] = a1[i] + a2[i];
            if (a[i] != 0) {
                k++;
            }
        }
        System.out.print(k);
        for (int i = 1000; i >= 0; i--) {
            if (a[i] != 0) {
                System.out.printf(" %d %.1f", i, a[i]);
            }
        }
    }
}