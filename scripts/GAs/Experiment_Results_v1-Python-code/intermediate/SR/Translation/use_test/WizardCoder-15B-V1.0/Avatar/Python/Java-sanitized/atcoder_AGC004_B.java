import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] measurements = new int[n];
        for (int i = 0; i < n; i++) {
            measurements[i] = sc.nextInt();
        }
        int[][] b = new int[n][n];
        int condition_two = 680;
        int condition_one = 767;
        for (int i = 0; i < n; i++) {
            int m = measurements[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if ((condition_two & condition_one) != 0) {
                    if (k < 0) {
                        k = k + n;
                    }
                }
                m = Math.min(m, measurements[k]);
                b[j][i] = m;
            }
        }
        int m = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            m = Math.min(m, sum + x * i);
        }
        System.out.println(m);
    }
}