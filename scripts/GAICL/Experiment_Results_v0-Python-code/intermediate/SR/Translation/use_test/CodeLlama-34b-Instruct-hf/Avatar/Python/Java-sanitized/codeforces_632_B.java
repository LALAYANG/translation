import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_632_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> pieces = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pieces.add(sc.nextInt());
        }
        int pScore = 0;
        int sScore = 0;
        int max_prefix_strength = 0;
        int sMaxScore = 0;
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i) == 'A') {
                pScore += pieces.get(i);
                if (pScore > max_prefix_strength) {
                    max_prefix_strength = pScore;
                }
            } else {
                pScore -= pieces.get(i);
            }
        }
        for (int i = pieces.size() - 1; i >= 0; i--) {
            if (pieces.get(i) == 'A') {
                sScore += pieces.get(i);
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces.get(i);
            }
        }
        if (max_prefix_strength > sMaxScore) {
            System.out.println(max_prefix_strength);
        } else {
            System.out.println(sMaxScore);
        }
    }
}