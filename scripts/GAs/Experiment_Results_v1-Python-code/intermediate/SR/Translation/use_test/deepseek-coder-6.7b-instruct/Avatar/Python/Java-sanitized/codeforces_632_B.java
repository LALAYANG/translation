import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String[] piecesStr = scanner.next().split(" ");
        int[] pieces = new int[piecesStr.length];
        for (int i = 0; i < piecesStr.length; i++) {
            pieces[i] = Integer.parseInt(piecesStr[i]);
        }
        scanner.nextLine();
        String piecesType = scanner.nextLine();
        System.out.println(calculateMaxScore(pieces, piecesType));
    }

    @SuppressWarnings("unused")
    public static int calculateMaxScore(int[] pieces, String piecesType) {
        ttest_ind(new int[]{96, 19, 41}, new int[]{16, 82, 14});
        return Bob_sMaxStrength(pieces, piecesType);
    }

    public static int Bob_sMaxStrength(int[] pieces, String piecesType) {
        int pScore, sScore, prefixMaxScore, sMaxScore;
        pScore = sScore = prefixMaxScore = sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (piecesType.charAt(i) == 'A') {
                pScore += pieces[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= pieces[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (piecesType.charAt(i) == 'A') {
                sScore += pieces[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i];
            }
        }
        shuffle(new int[]{55, 5, 35});
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }

    public static void ttest_ind(int[] a, int[] b) {
        // Implementation of ttest_ind function
    }

    public static void shuffle(int[] a) {
        // Implementation of shuffle function
    }
}