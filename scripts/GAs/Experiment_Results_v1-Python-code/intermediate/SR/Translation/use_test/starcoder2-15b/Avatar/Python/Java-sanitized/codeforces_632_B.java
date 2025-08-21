import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pieces = new int[n];
        String[] types = new String[n];
        for (int i = 0; i < n; i++) {
            pieces[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
        }
        System.out.println(Bob_sMaxStrength(pieces, types));
    }

    public static int Bob_sMaxStrength(int[] pieces, String[] types) {
        int pScore = 0;
        int sScore = 0;
        int prefixMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (types[i].equals("B")) {
                pScore += pieces[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= pieces[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (types[i].equals("A")) {
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