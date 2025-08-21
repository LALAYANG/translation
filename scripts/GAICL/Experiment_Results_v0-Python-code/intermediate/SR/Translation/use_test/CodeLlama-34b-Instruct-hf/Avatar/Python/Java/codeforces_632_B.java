
Here's the Java code that is equivalent to the Python code you provided:
```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bob_sMaxStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> pieces = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pieces.add(sc.nextInt());
        }
        int pScore = 0;
        int sScore = 0;
        int max_prefix_strength = 0;
        int sMaxScore = 0;
        for (int i = 0; i < pieces.size(); i++) {
            if (pieces.get(i) == 'A') {
                pScore += pieces.get(i);
                if (pScore > max_prefix_strength) {
                    max_prefix_strength = pScore;
                }
            } else {
                pScore -= pieces.get(i);
            }
        }
        for (int i = pieces.size() - 1; i >= 0; i--) {
            if (pieces.get(i) == 'A') {
                sScore += pieces.get(i);
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces.get(i);
            }
        }
        if (max_prefix_strength > sMaxScore) {
            System.out.println(max_prefix_strength);
        } else {
            System.out.println(sMaxScore);
        }
    }
}
```
Note that the Java code uses a `Scanner` to read input from the user, while the Python code uses the `input()` function. Also, the Java code uses a `List` to store the input pieces, while the Python code uses a `tuple` of `int`s.

The Java code also uses a `for` loop to iterate over the input pieces, while the Python code uses a `for` loop with a `range` function to iterate over the input pieces.

The Java code also uses the `System.out.println()` method to print the output, while the Python code uses the `print()` function.
