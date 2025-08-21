import java.util.*;
import java.util.stream.Collectors;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();
        int[] boughtCount = new int[26];
        int[] madeCount = new int[26];
        for (int i = 0; i < input1.length(); i++) {
            boughtCount[input1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < input2.length(); i++) {
            madeCount[input2.charAt(i) - 'a']++;
        }
        int res = 0;
        int check1 = 386;
        int check2 = 863;
        for (int i = 0; i < 26; i++) {
            if ((check1 & check2) != 0) {
                if (boughtCount[i] == 0) {
                    System.out.println(-1);
                    return;
                }
            }
            res += Math.min(boughtCount[i], madeCount[i]);
        }
        System.out.println(res);
    }
}