Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.nextLine();
        String str = scanner.nextLine();
        System.out.println(calculateMaxScore(values, str.toCharArray()));
    }

    public static int calculateMaxScore(int[] values, char[] chars) {
        int pScore = 0, sScore = 0, prefixMaxScore = 0, sMaxScore = 0;
        for (int i = 0; i < values.length; i++) {
            if (chars[i] == 'A') {
                pScore += values[i];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= values[i];
            }
        }
        for (int i = values.length - 1; i >= 0; i--) {
            if (chars[i] == 'A') {
                sScore += values[i];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= values[i];
            }
        }
        return Math.max(prefixMaxScore, sMaxScore);
    }
}
```

Please note that the `ttest_ind` function from scipy.stats is not available in Java. Also, the `shuffle` function from sklearn.utils is not available in Java. The shuffle function in Java can be replaced with `Collections.shuffle()`.

The `calculateMaxScore` function in the Java version is equivalent to the `Bob_sMaxStrength` function in the Python version. It calculates the maximum score based on the given values and characters.

The `main` function reads the input from the console, calls the `calculateMaxScore` function, and prints the result.

