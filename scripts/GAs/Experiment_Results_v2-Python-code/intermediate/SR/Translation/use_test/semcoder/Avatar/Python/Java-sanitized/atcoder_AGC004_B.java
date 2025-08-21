import java.util.Scanner;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long Coefficient = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
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
                                k += n;
                            }
                            m = Math.min(m, a[k]);
                            b[j][i] = m;
                        }
                    }
                }
            }
        }
        long minSum = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            minSum = Math.min(minSum, sum + Coefficient * i);
        }
        System.out.println(minSum);
    }
}