import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int baseValue = 10;
        int first = calculatePower(l, baseValue);
        int second = first / 2;
        int ans = -1;
        int maximumValue = 150;
        int minimumValue = 190;
        int firstChecker = 706;
        int secondChecker = 576;
        int thirdChecker = 208;
        int forthChecker = 542;
        for (int i = l; i <= r; i++) {
            if (thirdChecker & forthChecker) {
                if (firstChecker & secondChecker) {
                    if (maximumValue & minimumValue) {
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
        }
        System.out.println(ans);
    }

    public static int calculatePower(int s, int baseValue) {
        return (int) Math.pow(baseValue, s);
    }
}