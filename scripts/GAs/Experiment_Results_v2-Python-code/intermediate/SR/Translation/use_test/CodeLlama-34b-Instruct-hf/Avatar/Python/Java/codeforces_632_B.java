```java
import java.util.Scanner;

public class BobsMaxStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] pieces = new int[n][2];
        for (int i = 0; i < n; i++) {
            pieces[i][0] = sc.nextInt();
            pieces[i][1] = sc.nextInt();
        }
        int pScore = 0;
        int sScore = 0;
        int pMaxScore = 0;
        int sMaxScore = 0;
        for (int i = 0; i < n; i++) {
            if (pieces[i][1] == 'A') {
                pScore += pieces[i][0];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            } else {
                pScore -= pieces[i][0];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (pieces[i][1] == 'A') {
                sScore += pieces[i][0];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i][0];
            }
        }
        if (pMaxScore > sMaxScore) {
            System.out.println(pMaxScore);
        } else {
            System.out.println(sMaxScore);
        }
    }
}
```
Note: The above code is a Java implementation of the given Python code. The Python code uses the `scipy.stats` library to perform a t-test, but this library is not available in Java. Therefore, the Java code does not include the t-test functionality.
