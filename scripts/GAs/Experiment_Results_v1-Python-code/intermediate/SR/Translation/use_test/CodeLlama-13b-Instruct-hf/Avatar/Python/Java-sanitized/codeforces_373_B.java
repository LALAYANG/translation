import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int minimumValue = sc.nextInt();
        int k = sc.nextInt();
        int lo = 0;
        int hi = (int) 1e18;
        while (hi - lo > 1) {
            int md = (lo + hi) / 2;
            int c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1);
            if (conditionalCheckerC(c, k) && conditionalCheckerF(c, k) && conditionalCheckerA(c, k) && conditionalCheckerD(c, k) && conditionalCheckerE(c, k) && conditionalCheckerB(c, k)) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    private static int sumOfDigits(int k) {
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

    private static boolean conditionalCheckerC(int c, int k) {
        return c * k <= w;
    }

    private static boolean conditionalCheckerF(int c, int k) {
        return c * k <= w;
    }

    private static boolean conditionalCheckerA(int c, int k) {
        return c * k <= w;
    }

    private static boolean conditionalCheckerD(int c, int k) {
        return c * k <= w;
    }

    private static boolean conditionalCheckerE(int c, int k) {
        return c * k <= w;
    }

    private static boolean conditionalCheckerB(int c, int k) {
        return c * k <= w;
    }
}