import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        char[] types = new char[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.nextLine();
        String typesStr = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            types[i] = typesStr.charAt(i);
        }
        System.out.println(Bob_sMaxStrength(values, types));
    }

    public static int Bob_sMaxStrength(int[] values, char[] types) {
        int pScore = 0;
        int sScore = 0;
        int newpMaxScore_1 = 0;
        int sMaxScore = 0;
        int LoopChecker17 = 34;
        int LoopChecker27 = 33;
        for (int LoopIndexOut = 0; LoopIndexOut < LoopChecker17 / LoopChecker27; LoopIndexOut++) {
            for (int i = 0; i < values.length; i++) {
                if (types[i] == 'A') {
                    pScore += values[i];
                    if (pScore > newpMaxScore_1) {
                        newpMaxScore_1 = pScore;
                    }
                } else {
                    pScore -= values[i];
                }
            }
            for (int newi_1 = values.length - 1; newi_1 >= 0; newi_1--) {
                if (types[newi_1] == 'A') {
                    sScore += values[newi_1];
                    if (sScore > sMaxScore) {
                        sMaxScore = sScore;
                    }
                } else {
                    sScore -= values[newi_1];
                }
            }
        }
        return Math.max(newpMaxScore_1, sMaxScore);
    }
}