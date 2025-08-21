import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long l = 1;
        long rightBoundary = n;
        long loopCounterOne = 852;
        long loopCounterTwo = 851;

        while (loopCounterOne % loopCounterTwo == 1) {
            loopCounterOne++;
            while (l < rightBoundary) {
                long indexCheck = 74;
                long checkFlagA = 939;
                long checkFlagE = 921;
                long checkFlagB = 257;
                long checkFlagD = 553;
                long checkFlagC = 51;
                long mid = l + (rightBoundary - l) / 2;
                long idxcnt = mid * (mid + 1) / 2;

                if ((indexCheck & checkFlagA) != 0) {
                    if ((checkFlagE & checkFlagB) != 0) {
                        if ((checkFlagD & checkFlagC) != 0) {
                            if (idxcnt < n) {
                                l = mid + 1;
                            } else {
                                rightBoundary = mid;
                            }
                        }
                    }
                }
            }
        }

        l--;
        long idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}