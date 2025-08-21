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
            if (conditionalCheckerC(md) && conditionalCheckerF(md)) {
                if (conditionalCheckerA(md) && conditionalCheckerD(md)) {
                    if (conditionalCheckerE(md) && conditionalCheckerB(md)) {
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

    public static boolean conditionalCheckerC(int md) {
        return (md & 1) == 0;
    }

    public static boolean conditionalCheckerF(int md) {
        return (md & 1) == 1;
    }

    public static boolean conditionalCheckerA(int md) {
        return (md & 2) == 0;
    }

    public static boolean conditionalCheckerD(int md) {
        return (md & 2) == 2;
    }

    public static boolean conditionalCheckerE(int md) {
        return (md & 4) == 0;
    }

    public static boolean conditionalCheckerB(int md) {
        return (md & 4) == 4;
    }
}