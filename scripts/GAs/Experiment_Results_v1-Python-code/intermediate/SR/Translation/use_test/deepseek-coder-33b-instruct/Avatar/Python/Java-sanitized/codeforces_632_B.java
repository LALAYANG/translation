import java.util.*;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println(calculateMaxScore(values, str.toCharArray()));
    }

    public static int calculateMaxScore(int[] values, char[] chars) {
        int pScore = 0, sScore = 0, prefixMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < values.length; i++) {
            if (chars[i] == 'A') {
                pScore += values[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= values[i];
            }
        }
        for (int i = values.length - 1; i >= 0; i--) {
            if (chars[i] == 'A') {
                sScore += values[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= values[i];
            }
        }
        return Math.max(prefixMaxScore, sMaxScore);
    }
}