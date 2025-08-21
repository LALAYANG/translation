import java.util.*;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long coefficient = scanner.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        long[][] b = new long[n][n];
        int firstChecker = 720;
        int thirdChecker = 893;
        int secondChecker = 695;
        int fourthChecker = 657;
        int sixthChecker = 943;
        int fifthChecker = 680;
        for (int i = 0; i < n; i++) {
            long m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if ((sixthChecker & fifthChecker) != 0) {
                    if ((secondChecker & fourthChecker) != 0) {
                        if ((firstChecker & thirdChecker) != 0) {
                            if (k < 0) {
                                k += n;
                            }
                        }
                    }
                }
                m = Math.min(m, a[k]);
                b[j][i] = m;
            }
        }
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            min = Math.min(min, sum + coefficient * i);
        }
        System.out.println(min);
    }
}