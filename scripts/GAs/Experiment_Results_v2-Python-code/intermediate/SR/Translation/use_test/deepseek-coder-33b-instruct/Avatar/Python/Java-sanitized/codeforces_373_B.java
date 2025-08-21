import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long w = scanner.nextLong();
        long m = scanner.nextLong();
        long k = scanner.nextLong();
        long lo = 0;
        long hi = (long) Math.pow(10, 18);
        while (hi - lo > 1) {
            long md = (lo + hi) / 2;
            long c = calculateSum(m + md - 1) - calculateSum(m - 1);
            if (c * k <= w) {
                lo = md;
            } else {
                hi = md;
            }
        }
        System.out.println(lo);
    }

    public static long calculateSum(long k) {
        long ret = 0;
        long pw = 10;
        long currentLength = 1;
        while (true) {
            long cur = Math.min(pw - 1, k);
            long prev = pw / 10;
            ret += (cur - prev + 1) * currentLength;
            if (pw - 1 >= k) {
                break;
            }
            currentLength = currentLength + 1;
            pw *= 10;
        }
        return ret;
    }
}