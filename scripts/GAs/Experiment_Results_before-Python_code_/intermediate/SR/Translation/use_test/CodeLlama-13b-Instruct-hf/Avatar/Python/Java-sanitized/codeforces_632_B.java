public class codeforces_632_B {

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5};
        String[] pieces = {"AAAAA"};
        System.out.println(Bob_sMaxStrength(input, pieces));
    }

    public static int Bob_sMaxStrength(int[] input, String[] pieces) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < input.length; i++) {
            if (pieces[i].equals("B")) {
                pScore += input[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= input[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (pieces[i].equals("A")) {
                sScore += input[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= input[i];
            }
        }
        if (pMaxScore > sMaxScore) {
            return pMaxScore;
        }
        return sMaxScore;
    }
}