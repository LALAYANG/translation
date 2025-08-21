import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String[] piecesStr = scanner.next().split(" ");
        int[] piecesInt = new int[piecesStr.length];
        for (int i = 0; i < piecesStr.length; i++) {
            piecesInt[i] = Integer.parseInt(piecesStr[i]);
        }
        System.out.println(bobMaxStrength(piecesInt));
    }

    static int bobMaxStrength(int[] pieces) {
        int pScore = 0, sScore = 0, maxPrefixStrength = 0, sMaxScore = 0;
        for (int piece : pieces) {
            if (piece > 0) {
                pScore += piece;
                if (pScore > maxPrefixStrength) {
                    maxPrefixStrength = pScore;
                }
            } else {
                pScore -= piece;
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (pieces[i] > 0) {
                sScore += pieces[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i];
            }
        }
        return Math.max(maxPrefixStrength, sMaxScore);
    }
}