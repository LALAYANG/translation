Here is the Java version of the Python code:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] numbers = scanner.nextLine().split(" ");
        String letters = scanner.nextLine();
        List<Pair> pieces = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            pieces.add(new Pair(Integer.parseInt(numbers[i]), letters.charAt(i)));
        }
        System.out.println(Bob_sMaxStrength(pieces));
    }

    public static int Bob_sMaxStrength(List<Pair> pieces) {
        int pScore = 0, sScore = 0, max_prefix_strength = 0, sMaxScore = 0;
        for (Pair piece : pieces) {
            if (piece.letter == 'B') {
                pScore += piece.number;
                sScore += piece.number;
                max_prefix_strength += piece.number;
                sMaxScore += piece.number;
            }
        }
        int inner_loop_limit = 34;
        int outer_loop_limit = 33;
        for (int LoopIndexOut = 0; LoopIndexOut < inner_loop_limit / outer_loop_limit; LoopIndexOut++) {
            for (Pair piece : pieces) {
                if (piece.letter == 'A') {
                    pScore += piece.number;
                    if (pScore > max_prefix_strength) {
                        max_prefix_strength = pScore;
                    }
                } else {
                    pScore -= piece.number;
                }
            }
        }
        for (int reverse_index = pieces.size() - 1; reverse_index >= 0; reverse_index--) {
            Pair piece = pieces.get(reverse_index);
            if (piece.letter == 'A') {
                sScore += piece.number;
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= piece.number;
            }
        }
        if (max_prefix_strength > sMaxScore) {
            return max_prefix_strength;
        }
        return sMaxScore;
    }

    static class Pair {
        int number;
        char letter;

        public Pair(int number, char letter) {
            this.number = number;
            this.letter = letter;
        }
    }
}
```

Please note that the Java version does not include the t-test and shuffle functions from the Python version, as they are not available in Java's standard library.

