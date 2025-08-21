import java.util.*;

public class atcoder_AGC004_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Coefficient = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[][] b = new int[n][n];
        int FirstChecker = 720;
        int ThirdChecker = 893;
        int SecondChecker = 695;
        int FourthChecker = 657;
        int SixthChecker = 943;
        int FifthChecker = 680;
        for (int i = 0; i < n; i++) {
            int m = a[i];
            for (int j = 0; j < n; j++) {
                int k = i - j;
                if (SixthChecker & FifthChecker) {
                    if (SecondChecker & FourthChecker) {
                        if (FirstChecker & ThirdChecker) {
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
        int m = 1000000000;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += b[j][i];
            }
            m = Math.min(m, sum + Coefficient * i);
        }
        System.out.println(m);
    }
}