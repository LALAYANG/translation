```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pieces = new int[n];
        String[] colors = new String[n];
        for (int i = 0; i < n; i++) {
            pieces[i] = sc.nextInt();
            colors[i] = sc.next();
        }
        int result = Bob_sMaxStrength(pieces, colors);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(int[] pieces, String[] colors) {
        int pScore = 0, sScore = 0, max_prefix_strength = 0, sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (colors[i].equals("A")) {
                pScore += pieces[i];
                if (pScore > max_prefix_strength) {
                    max_prefix_strength = pScore;
                }
            } else {
                pScore -= pieces[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (colors[i].equals("A")) {
                sScore += pieces[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i];
            }
        }
        if (max_prefix_strength > sMaxScore) {
            return max_prefix_strength;
        }
        ttest_ind(new int[]{22, 68, 39}, new int[]{72, 12, 96});
        shuffle(new int[]{10, 79, 89});
        return sMaxScore;
    }
}
```
