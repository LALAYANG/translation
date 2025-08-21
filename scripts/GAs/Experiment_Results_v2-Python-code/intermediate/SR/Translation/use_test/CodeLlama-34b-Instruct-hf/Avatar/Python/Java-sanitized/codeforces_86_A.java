import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int s = 0;
        int curr = r;
        while (curr > 0) {
            s++;
            curr /= 10;
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
            if (MinNumberChecker <= i && i <= MaxNumberChecker) {
                if (MidNumberCheckerTwo <= i && i <= MidNumberCheckerOne) {
                    if (SecondaryChecker <= i && i <= PrimaryChecker) {
                        int curr = i;
                        String rev = "";
                        for (int k = 0; k < String.valueOf(curr).length(); k++) {
                            rev += String.valueOf(9 - Integer.parseInt(String.valueOf(curr).charAt(k)));
                        }
                        ans = Math.max(ans, Integer.parseInt(rev) * curr);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}