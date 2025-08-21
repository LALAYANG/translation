import java.util.Arrays;
import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pieces = new int[n][2];
        for (int i = 0; i < n; i++) {
            pieces[i][0] = sc.nextInt();
            pieces[i][1] = sc.nextInt();
        }
        int maxPrefixStrength = 0;
        int maxSuffixStrength = 0;
        for (int i = 0; i < n; i++) {
            if (pieces[i][1] == 'A') {
                maxPrefixStrength += pieces[i][0];
            } else {
                maxPrefixStrength -= pieces[i][0];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (pieces[i][1] == 'A') {
                maxSuffixStrength += pieces[i][0];
            } else {
                maxSuffixStrength -= pieces[i][0];
            }
        }
        int maxStrength = Math.max(maxPrefixStrength, maxSuffixStrength);
        System.out.println(maxStrength);
    }
}