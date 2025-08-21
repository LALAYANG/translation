```java
import java.util.Scanner;

public class Bob_sMaxStrength {
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
        scanner.close();

        int pScore = sScore = pMaxScore = sMaxScore = 0;
        for (int i = 0; i < n; i++) {
            if (types[i] == 'B') {
                pScore += values[i];
                sScore -= values[i];
            }
        }
        pMaxScore = pScore;
        sMaxScore = sScore;

        for (int i = 0; i < n; i++) {
            if (types[i] == 'A') {
                pScore += values[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= values[i];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (types[i] == 'A') {
                sScore += values[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= values[i];
            }
        }

        System.out.println(Math.max(pMaxScore, sMaxScore));
    }
}
```
