```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] pieces = new int[n];
        String[] types = new String[n];
        for (int i = 0; i < n; i++) {
            pieces[i] = scanner.nextInt();
            types[i] = scanner.next();
        }
        int result = Bob_sMaxStrength(pieces, types);
        System.out.println(result);
    }

    public static int Bob_sMaxStrength(int[] pieces, String[] types) {
        int pScore = 0;
        int sScore = 0;
        int pMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (types[i].equals("B")) {
                pScore += pieces[i];
                pMaxScore = Math.max(pMaxScore, pScore);
            } else {
                pScore -= pieces[i];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (types[i].equals("A")) {
                sScore += pieces[i];
                sMaxScore = Math.max(sMaxScore, sScore);
            } else {
                sScore -= pieces[i];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}
```

Test input:
5
1 2 3 4 5
AAAAA

Expected output:
15 
