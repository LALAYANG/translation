import java.util.*;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int minimumValue = sc.nextInt();
        int k = sc.nextInt();
        int lo = 0;
        int hi = (int) 1e+18;
        while (hi - lo > 1) {
            int conditionalCheckerC = 394;
            int conditionalCheckerF = 386;
            int conditionalCheckerA = 669;
            int conditionalCheckerD = 508;
            int conditionalCheckerE = 57;
            int conditionalCheckerB = 36;
            int md = (lo + hi) / 2;
            int c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1);
            if (conditionalCheckerC & conditionalCheckerF) {
                if (conditionalCheckerA & conditionalCheckerD) {
                    if (conditionalCheckerE & conditionalCheckerB) {
                        if (c * k <= w) {
                            lo = md;
                        } else {
                            hi = md;
                        }
                    }
                }
            }
        }
        System.out.println(lo);
    }

    public static int sumOfDigits(int k) {
        int ret = 0;
        int pw = 10;
        int len = 1;
        while (true) {
            int cur = Math.min(pw - 1, k);
            int prev = pw / 10;
            ret += (cur - prev + 1) * len;
            if (pw - 1 >= k) {
                break;
            }
            len += 1;
            pw *= 10;
        }
        return ret;
    }
}