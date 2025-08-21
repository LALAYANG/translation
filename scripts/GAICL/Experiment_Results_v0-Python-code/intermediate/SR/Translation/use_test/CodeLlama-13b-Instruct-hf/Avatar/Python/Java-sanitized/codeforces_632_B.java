import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> pieces = Arrays.stream(input.split(" ")).collect(Collectors.toList());
        int result = Bob_sMaxStrength(pieces);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(List<String> pieces) {
        int pScore = 0;
        int sScore = 0;
        int newpMaxScore_1 = 0;
        int sMaxScore = 0;
        int LoopChecker17 = 34;
        int LoopChecker27 = 33;
        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker17 / LoopChecker27; LoopIndexOut++) {
            for (String piece : pieces) {
                if (piece.equals("A")) {
                    pScore += Integer.parseInt(piece);
                    if (pScore > newpMaxScore_1) {
                        newpMaxScore_1 = pScore;
                    }
                } else {
                    pScore -= Integer.parseInt(piece);
                }
            }
        }
        for (int newi_1 = pieces.size() - 1; newi_1 >= 0; newi_1--) {
            if (pieces.get(newi_1).equals("A")) {
                sScore += Integer.parseInt(pieces.get(newi_1));
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= Integer.parseInt(pieces.get(newi_1));
            }
        }
        if (newpMaxScore_1 > sMaxScore) {
            return newpMaxScore_1;
        }
        return sMaxScore;
    }
}