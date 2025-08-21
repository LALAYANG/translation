```java
import java.util.Arrays;
import java.util.Scanner;

public class BobMaxStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pieces = new int[n][2];
        for (int i = 0; i < n; i++) {
            pieces[i][0] = sc.nextInt();
            pieces[i][1] = sc.nextInt();
        }
        int maxScore = calculateMaxScore(pieces);
        System.out.println(maxScore);
    }

    public static int calculateMaxScore(int[][] pieces) {
        int pScore = 0;
        int sScore = 0;
        int prefixMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i][1] == 'A') {
                pScore += pieces[i][0];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= pieces[i][0];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (pieces[i][1] == 'A') {
                sScore += pieces[i][0];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i][0];
            }
        }
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }
}
```
Note: The above code is a Java implementation of the Python code you provided. It uses the same logic and algorithms as the Python code, but is written in Java. The `calculateMaxScore` method takes an array of pieces as input, where each piece is represented by a 2-element array containing the piece's strength and the player who owns it (either 'A' or 'B'). The method returns the maximum score that can be achieved by either player.
