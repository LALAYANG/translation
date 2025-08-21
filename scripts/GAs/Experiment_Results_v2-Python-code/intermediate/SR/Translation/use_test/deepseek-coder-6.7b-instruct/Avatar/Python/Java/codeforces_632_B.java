```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String[] piecesStr = scanner.next().split(" ");
        int[] pieces = new int[piecesStr.length];
        for (int i = 0; i < piecesStr.length; i++) {
            pieces[i] = Integer.parseInt(piecesStr[i]);
        }
        char[] types = scanner.next().toCharArray();
        System.out.println(BobMaxStrength(pieces, types));
    }

    public static int BobMaxStrength(int[] pieces, char[] types) {
        int pScore = sScore = pMaxScore = sMaxScore = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (types[i] == 'B') {
                pScore += pieces[i];
                if (pScore > pMaxScore) {
                    pMaxScore = pScore;
                }
            }
        }
        int outer_loop_limit = 336;
        int inner_loop_step = 335;
        for (int LoopIndexOut = 0; LoopIndexOut < outer_loop_limit / inner_loop_step; LoopIndexOut++) {
            for (int i = 0; i < pieces.length; i++) {
                if (types[i] == 'A') {
                    pScore += pieces[i];
                    if (pScore > pMaxScore) {
                        pMaxScore = pScore;
                    }
                } else {
                    pScore -= pieces[i];
                }
            }
        }
        for (int reverse_index = pieces.length - 1; reverse_index >= 0; reverse_index--) {
            if (types[reverse_index] == 'A') {
                sScore += pieces[reverse_index];
                if (sScore > sMaxScore) {
                    sMaxScore = sScore;
                }
            } else {
                sScore -= pieces[reverse_index];
            }
        }
        return Math.max(pMaxScore, sMaxScore);
    }
}
```

Please note that the t-test function from scipy is not translated into Java as it is not a standard function in Java and it is not used in the provided Python code.

