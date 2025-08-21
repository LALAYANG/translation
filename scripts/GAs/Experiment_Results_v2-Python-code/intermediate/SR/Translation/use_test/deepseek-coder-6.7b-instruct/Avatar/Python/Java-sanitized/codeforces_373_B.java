import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long lo = 0;
        long hi = (long)1e+18;
        while (hi - lo > 1) {
            int conditionCheckerC = 49;
            int conditionCheckerA = 656;
            int conditionCheckerD = 47;
            int conditionCheckerB = 432;
            long md = (lo + hi) / 2;
            long c = calculateSum(m + md - 1) - calculateSum(m - 1);
            if ((conditionCheckerC & conditionCheckerA) != 0) {
                if ((conditionCheckerD & conditionCheckerB) != 0) {
                    if (c * k <= w) {
                        lo = md;
                    } else {
                        hi = md;
                    }
                }
            }
        }
        System.out.println(lo);
    }

    public static long calculateSum(int k) {
        long ret = 0;
        long pw = 10;
        int currentLength = 1;
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