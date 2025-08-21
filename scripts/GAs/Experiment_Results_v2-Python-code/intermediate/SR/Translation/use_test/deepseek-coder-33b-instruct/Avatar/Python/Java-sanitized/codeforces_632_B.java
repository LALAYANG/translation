import java.util.*;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] pieces = scanner.nextLine().split(" ");
        int[] pieceValues = new int[n];
        for (int i = 0; i < n; i++) {
            pieceValues[i] = Integer.parseInt(pieces[i]);
        }
        String pieceTypes = scanner.nextLine();
        System.out.println(BobsMaxStrength(pieceValues, pieceTypes.toCharArray()));
    }

    public static int BobsMaxStrength(int[] pieceValues, char[] pieceTypes) {
        int pScore = Arrays.stream(pieceValues).sum();
        int pMaxScore = pScore;
        int sScore = pScore;
        int sMaxScore = pScore;
        for (int i = 0; i < pieceValues.length; i++) {
            if (pieceTypes[i] == 'A') {
                pScore += pieceValues[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= pieceValues[i];
            }
        }
        for (int i = pieceValues.length - 1; i >= 0; i--) {
            if (pieceTypes[i] == 'A') {
                sScore += pieceValues[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieceValues[i];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}