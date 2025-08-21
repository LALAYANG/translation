import java.util.*;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pieces = new int[n];
        String[] colors = new String[n];
        for (int i = 0; i < n; i++) {
            pieces[i] = sc.nextInt();
            colors[i] = sc.next();
        }
        int maxScore = Bob_sMaxStrength(pieces, colors);
        System.out.println(maxScore);
    }

    public static int Bob_sMaxStrength(int[] pieces, String[] colors) {
        int pScore = 0, sScore = 0, prefixMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (colors[i].equals("A")) {
                pScore += pieces[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= pieces[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (colors[i].equals("A")) {
                sScore += pieces[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i];
            }
        }
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }
}