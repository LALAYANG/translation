import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(Bob_sMaxStrength(a, b));
    }

    public static int Bob_sMaxStrength(int[] a, int[] b) {
        int pScore = 0;
        int sScore = 0;
        int pMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 1) {
                pScore += a[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= a[i];
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (b[i] == 1) {
                sScore += a[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= a[i];
            }
        }
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}