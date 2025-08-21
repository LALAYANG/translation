import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        String[] b = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.next();
        }
        int pScore = 0;
        int sScore = 0;
        int pMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < n; i++) {
            if (b[i].equals("A")) {
                pScore += a[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= a[i];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (b[i].equals("A")) {
                sScore += a[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= a[i];
            }
        }
        if (pMaxScore > sMaxScore) {
            System.out.println(pMaxScore);
        } else {
            System.out.println(sMaxScore);
        }
    }
}