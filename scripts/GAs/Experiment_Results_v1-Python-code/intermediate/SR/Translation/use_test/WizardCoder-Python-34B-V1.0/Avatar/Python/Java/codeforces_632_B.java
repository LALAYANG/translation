```java
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] players = scanner.nextLine().split(" ");
        int[][] pieces = new int[n][2];
        for (int i = 0; i < n; i++) {
            pieces[i][0] = numbers.get(i);
            pieces[i][1] = players.charAt(i) == 'A' ? 1 : 2;
        }
        int maxScore = Bob_sMaxStrength(pieces);
        System.out.println(maxScore);
    }

    public static int Bob_sMaxStrength(int[][] pieces) {
        int pScore = sScore = prefixMaxScore = sMaxScore = 0;
        for (int[] piece : pieces) {
            if (piece[1] == 1) {
                pScore += piece[0];
                if (pScore > prefixMaxScore) {
                    prefixMaxScore = pScore;
                }
            } else {
                pScore -= piece[0];
            }
        }
        for (int i = pieces.length - 1; i >= 0; i--) {
            if (pieces[i][1] == 1) {
                sScore += pieces[i][0];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[i][0];
            }
        }
        if (prefixMaxScore > sMaxScore) {
            return prefixMaxScore;
        }
        return sMaxScore;
    }
}
```

Test input:
5
1 2 3 4 5
AAAAA

Expected output:
15 
