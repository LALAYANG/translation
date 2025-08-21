import java.util.Scanner;

public class codeforces_86_A {
    public static int calculatePower(int s, int powerOfTen) {
        return (int) Math.pow(powerOfTen, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int curr = r;
        int s = 0;
        while (curr > 0) {
            s++;
            curr /= 10;
        }

        int powerOfTen = 10;
        int first = calculatePower(s, powerOfTen);
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
                        int rev = 0;
                        int temp = i;
                        while (temp > 0) {
                            rev = rev * 10 + (9 - (temp % 10));
                            temp /= 10;
                        }
                        ans = Math.max(ans, rev * i);
                    }
                }
            }
        }

        System.out.println(ans);
    }
}