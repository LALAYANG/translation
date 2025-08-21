import java.util.*;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int baseValue = 10;
        int first = (int) Math.pow(baseValue, s);
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
                        int curr = i;
                        String rev = "";
                        for (int k = 0; k < String.valueOf(curr).length(); k++) {
                            rev += String.valueOf(9 - Integer.parseInt(String.valueOf(curr).charAt(k) + ""));
                        }
                        ans = Math.max(ans, Integer.parseInt(rev) * curr);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}