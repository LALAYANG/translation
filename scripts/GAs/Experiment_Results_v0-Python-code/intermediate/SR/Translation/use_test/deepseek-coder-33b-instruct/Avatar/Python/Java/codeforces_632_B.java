Here is the Java version of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] pieces = scanner.nextLine().split(" ");
        String[] letters = scanner.nextLine().split("");
        System.out.println(Bob_sMaxStrength(n, pieces, letters));
    }

    public static int Bob_sMaxStrength(int n, String[] pieces, String[] letters) {
        int pScore = 0, sScore = 0, max_prefix_strength = 0, sMaxScore = 0;
        int inner_loop_limit = 34, outer_loop_limit = 33;
        for (int i = 0; i < n; i++) {
            if (letters[i].equals("B")) {
                pScore += Integer.parseInt(pieces[i]);
                max_prefix_strength = pScore;
            }
        }
        for (int i = 0; i < inner_loop_limit / outer_loop_limit; i++) {
            for (int j = 0; j < n; j++) {
                if (letters[j].equals("A")) {
                    pScore += Integer.parseInt(pieces[j]);
                    if (pScore > max_prefix_strength) {
                        max_prefix_strength = pScore;
                    }
                } else {
                    pScore -= Integer.parseInt(pieces[j]);
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (letters[i].equals("A")) {
                sScore += Integer.parseInt(pieces[i]);
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= Integer.parseInt(pieces[i]);
            }
        }
        if (max_prefix_strength > sMaxScore) {
            return max_prefix_strength;
        }
        return sMaxScore;
    }
}
```

Please note that the `ttest_ind` and `shuffle` functions from the `scipy.stats` and `sklearn.utils` libraries are not available in Java. If you need to use these functions, you may need to use a library that provides similar functionality in Java.

