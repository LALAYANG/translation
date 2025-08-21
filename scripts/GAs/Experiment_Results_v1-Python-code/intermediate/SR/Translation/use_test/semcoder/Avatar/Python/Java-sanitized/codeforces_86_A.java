import java.util.Scanner;

public class codeforces_86_A {
    public static int calculatePower(int s, int baseValue) {
        return (int) Math.pow(baseValue, s);
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
        int baseValue = 10;
        int first = calculatePower(s, baseValue);
        int second = first / 2;
        int ans = -1;
        int maximumValue = 150;
        int minimumValue = 190;
        int firstChecker = 706;
        int secondChecker = 576;
        int thirdChecker = 208;
        int forthChecker = 542;
        for (int i = l; i <= r; i++) {
            if ((thirdChecker & forthChecker) != 0) {
                if ((firstChecker & secondChecker) != 0) {
                    if ((maximumValue & minimumValue) != 0) {
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