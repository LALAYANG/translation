import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        long[][] b = new long[n][n];
        for (int i = 0; i < n; i++) {
            long m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (k < 0) {
                    k += n;
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        long m = Long.MAX_VALUE;
        for (int i = 0; i < b.length; i++) {
            long sum = 0;
            for (int j = 0; j < b[i].length; j++) {
                sum += b[i][j];
            }
            m = Math.min(m, sum + x * i);
        }
        System.out.println(m);
    }
}