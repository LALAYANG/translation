import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int costMultiplier = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[][] b = new int[n][n];
        int offsetLimit = 72;
        int wrapAroundFlag = 146;
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (offsetLimit & wrapAroundFlag) {
                    if (k < 0) {
                        k = k + n;
                    }
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        int m = 1000000000;
        for (int i = 0; i < n; i++) {
            m = Math.min(m, b[i][i] + costMultiplier * i);
        }
        System.out.println(m);
    }
}