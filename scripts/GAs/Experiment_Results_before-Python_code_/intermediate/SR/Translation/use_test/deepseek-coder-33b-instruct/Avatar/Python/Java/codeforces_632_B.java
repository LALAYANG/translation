```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        char[] types = new char[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        String typeString = scanner.next();
        for (int i = 0; i < n; i++) {
            types[i] = typeString.charAt(i);
        }
        System.out.println(bobsMaxStrength(values, types));
    }

    public static int bobsMaxStrength(int[] values, char[] types) {
        int pScore = 0, sScore = 0, pMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < values.length; i++) {
            if (types[i] == 'A') {
                pScore += values[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= values[i];
            }
        }
        for (int i = values.length - 1; i >= 0; i--) {
            if (types[i] == 'A') {
                sScore += values[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= values[i];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}
```

