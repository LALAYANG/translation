import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        int[] boughtCount = new int[26];
        int[] madeCount = new int[26];
        for (int i = 0; i < line1.length(); i++) {
            boughtCount[line1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < line2.length(); i++) {
            madeCount[line2.charAt(i) - 'a']++;
        }
        int res = 0;
        for (int i = 0; i < 26; i++) {
            res += Math.min(boughtCount[i], madeCount[i]);
        }
        System.out.println(res);
    }
}