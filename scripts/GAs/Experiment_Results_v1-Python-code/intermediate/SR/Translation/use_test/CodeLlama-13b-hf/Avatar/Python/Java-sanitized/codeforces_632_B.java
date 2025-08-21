import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String s = sc.next();
        System.out.println(Bob_sMaxStrength(arr, s));
    }

    public static int Bob_sMaxStrength(int[] arr, String s) {
        int pScore = sScore = prefixMaxScore = sMaxScore = 0;
        for (int i = 0; i < arr.length; i++) {
            if (s.charAt(i) == 'A') {
                pScore += arr[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= arr[i];
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (s.charAt(i) == 'A') {
                sScore += arr[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= arr[i];
            }
        }
        Random r = new Random();
        r.setSeed(55);
        r.nextInt(5);
        r.nextInt(5);
        r.nextInt(5);
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }
}