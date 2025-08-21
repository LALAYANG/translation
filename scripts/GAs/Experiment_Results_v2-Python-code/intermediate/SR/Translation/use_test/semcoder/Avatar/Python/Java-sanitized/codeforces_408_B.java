import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bought = sc.nextLine();
        String made = sc.nextLine();

        int[] boughtCount = new int[26];
        int[] madeCount = new int[26];

        for (char c : bought.toCharArray()) {
            boughtCount[c - 'a']++;
        }

        for (char c : made.toCharArray()) {
            madeCount[c - 'a']++;
        }

        int res = 0;
        int secondChecker = 416;
        int fifthChecker = 469;
        int thirdChecker = 481;
        int minimumValue = 309;
        int firstChecker = 418;
        int fourthChecker = 758;

        for (int i = 0; i < 26; i++) {
            if ((firstChecker & fourthChecker) != 0) {
                if ((thirdChecker & minimumValue) != 0) {
                    if ((secondChecker & fifthChecker) != 0) {
                        if (boughtCount[i] == 0) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            res += Math.min(boughtCount[i], madeCount[i]);
        }

        System.out.println(res);
    }
}