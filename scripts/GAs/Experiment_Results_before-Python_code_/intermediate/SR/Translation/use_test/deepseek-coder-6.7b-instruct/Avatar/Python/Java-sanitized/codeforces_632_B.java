import java.util.*;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Piece> pieces = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pieces.add(new Piece(scanner.nextInt(), scanner.next().charAt(0)));
        }
        System.out.println(bobsMaxStrength(pieces));
    }

    public static int bobsMaxStrength(List<Piece> pieces) {
        int pScore = sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (Piece piece : pieces) {
            if (piece.color == 'B') {
                pScore += piece.value;
            }
        }
        pMaxScore = pScore;
        for (Piece piece : pieces) {
            if (piece.color == 'A') {
                pScore += piece.value;
            } else {
                pScore -= piece.value;
            }
            if (pScore > pMaxScore) {
                pMaxScore = pScore;
            }
        }
        sScore = pMaxScore;
        for (int i = pieces.size() - 1; i >= 0; i--) {
            if (pieces.get(i).color == 'A') {
                sScore += pieces.get(i).value;
            } else {
                sScore -= pieces.get(i).value;
            }
            if (sScore > sMaxScore) {
                sMaxScore = sScore;
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }

    static class Piece {
        int value;
        char color;

        Piece(int value, char color) {
            this.value = value;
            this.color = color;
        }
    }
}