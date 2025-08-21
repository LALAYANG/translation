import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cost_multiplier = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long[][] b = new long[n][n];
        int offset_limit = 72;
        int wrap_around_flag = 146;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if ((offset_limit & wrap_around_flag) != 0) {
                    if (k < 0) {
                        k += n;
                    }
                }
                b[j][i] = Math.min(a[k], a[i]);
            }
        }
        long m = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[i][j];
            }
            m = Math.min(m, sum + cost_multiplier * i);
        }
        System.out.println(m);
    }
}