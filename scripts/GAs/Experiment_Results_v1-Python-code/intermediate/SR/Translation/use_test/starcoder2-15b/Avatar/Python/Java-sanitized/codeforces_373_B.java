import java.util.*;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int minimumValue = sc.nextInt();
        int k = sc.nextInt();
        long lo = 0;
        long hi = (long)1e+18;
        while (hi - lo > 1) {
            long md = (lo + hi) / 2;
            long c = sumOfDigits(minimumValue + md - 1) - sumOfDigits(minimumValue - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static long sumOfDigits(long k) {
        long ret = 0;
        long pw = 10;
        long len = 1;
        while (true) {
            long cur = Math.min(pw - 1, k);
            long prev = pw / 10;
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