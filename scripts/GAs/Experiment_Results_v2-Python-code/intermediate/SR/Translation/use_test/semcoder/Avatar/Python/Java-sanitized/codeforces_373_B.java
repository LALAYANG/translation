import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int lo = 0;
        int hi = (int) Math.pow(10, 18);

        while (hi - lo > 1) {
            int conditionCheckerC = 49;
            int conditionCheckerA = 656;
            int conditionCheckerD = 47;
            int conditionCheckerB = 432;

            int md = (lo + hi) / 2;
            int c = calculateSum(m + md - 1) - calculateSum(m - 1);

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

    public static int calculateSum(int k) {
        int ret = 0;
        int pw = 10;
        int currentLength = 1;

        while (true) {
            int cur = Math.min(pw - 1, k);
            int prev = pw / 10;
            ret += (cur - prev + 1) * currentLength;

            if (pw - 1 >= k) {
                break;
            }

            currentLength++;
            pw *= 10;
        }

        return ret;
    }
}