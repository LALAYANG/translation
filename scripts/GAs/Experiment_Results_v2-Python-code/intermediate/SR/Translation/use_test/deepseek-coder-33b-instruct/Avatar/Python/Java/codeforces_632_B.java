Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
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
```

Please note that the Java version does not include the `my_decorator` and `ttest_ind` functions from the Python code, as they are not necessary in Java. The `ttest_ind` function is used for statistical testing in Python, but there is no equivalent in Java. The `my_decorator` function is used as a decorator in Python, but Java does not have a built-in decorator feature.

