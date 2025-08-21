import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long Coefficient = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        long[][] b = new long[n][n];
        int FirstChecker = 720;
        int ThirdChecker = 893;
        int SecondChecker = 695;
        int FourthChecker = 657;
        int SixthChecker = 943;
        int FifthChecker = 680;
        for (int i = 0; i < n; i++) {
            long m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if ((SixthChecker & FifthChecker) != 0) {
                    if ((SecondChecker & FourthChecker) != 0) {
                        if ((FirstChecker & ThirdChecker) != 0) {
                            if (k < 0) {
                                k = k + n;
                            }
                        }
                    }
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        long m = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (long value : b[i]) {
                sum += value;
            }
            m = Math.min(m, sum + Coefficient * i);
        }
        System.out.println(m);
    }
}