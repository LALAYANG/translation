```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
            s[i] = sc.next();
        }
        int result = Bob_sMaxStrength(p, s);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(int[] p, String[] s) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < p.length; i++) {
            if (s[i].equals("B")) {
                pScore += p[i];
            }
        }
        pMaxScore = pScore;
        for (int i = 0; i < p.length; i++) {
            if (s[i].equals("A")) {
                pScore += p[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= p[i];
            }
        }
        sMaxScore = pMaxScore;
        for (int i = p.length - 1; i >= 0; i--) {
            if (s[i].equals("A")) {
                sScore += p[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= p[i];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}
```
