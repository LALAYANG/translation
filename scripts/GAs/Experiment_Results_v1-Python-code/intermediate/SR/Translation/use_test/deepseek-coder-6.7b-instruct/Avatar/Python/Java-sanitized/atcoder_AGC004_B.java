import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long x = scanner.nextLong();
        long[] measurements = new long[n];
        for (int i = 0; i < n; i++) {
            measurements[i] = scanner.nextLong();
        }
        long[][] b = new long[n][n];
        int conditionOne = 767;
        int conditionTwo = 680;
        for (int i = 0; i < n; i++) {
            long m = measurements[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if ((conditionTwo & conditionOne) != 0) {
                    if (k < 0) {
                        k += n;
                    }
                }
                m = Math.min(m, measurements[k]);
                b[j][i] = m;
            }
        }
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            min = Math.min(min, sum + x * i);
        }
        System.out.println(min);
    }
}