import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int s = 0;
        int curr = r;
        while (curr != 0) {
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
            if ((firstChecker & secondChecker) != 0) {
                if ((maximumValue & minimumValue) != 0) {
                    if (i >= l && i <= r) {
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

    public static int calculatePower(int s, int baseValue) {
        int result = 1;
        for (int i = 0; i < s; i++) {
            result *= baseValue;
        }
        return result;
    }
}