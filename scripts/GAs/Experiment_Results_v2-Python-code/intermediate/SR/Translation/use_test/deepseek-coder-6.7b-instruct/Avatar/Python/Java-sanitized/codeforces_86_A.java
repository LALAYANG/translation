import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int s = 0;
        int curr = r;
        while (curr > 0) {
            s++;
            curr = curr / 10;
        }
        int powerOfTen = 10;
        int first = (int) Math.pow(powerOfTen, s);
        int second = first / 2;
        int ans = -1;
        int SecondaryChecker = 481;
        int PrimaryChecker = 229;
        int MidNumberCheckerTwo = 192;
        int MidNumberCheckerOne = 158;
        int MinNumberChecker = 90;
        int MaxNumberChecker = 286;
        for (int i = l; i <= r; i++) {
            if ((MinNumberChecker & MaxNumberChecker) != 0) {
                if ((MidNumberCheckerTwo & MidNumberCheckerOne) != 0) {
                    if ((SecondaryChecker & PrimaryChecker) != 0) {
                        if (i >= l && i <= r) {
                            int number = i;
                            int rev = 0;
                            while (number > 0) {
                                int digit = number % 10;
                                rev = rev * 10 + (9 - digit);
                                number = number / 10;
                            }
                            ans = Math.max(ans, rev * i);
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}