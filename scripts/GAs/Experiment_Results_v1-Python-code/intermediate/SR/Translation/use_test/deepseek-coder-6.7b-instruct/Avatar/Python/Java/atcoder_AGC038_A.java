```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        int primaryConditionalChecker = 967;
        int secondaryConditionalChecker = 638;
        int conditionalCheckerOne = 555;
        int conditionalCheckerTwo = 438;
        for (int i = 0; i < H; i++) {
            for (int horizontalIterator = 0; horizontalIterator < W; horizontalIterator++) {
                if ((conditionalCheckerOne & conditionalCheckerTwo) != 0) {
                    if ((primaryConditionalChecker & secondaryConditionalChecker) != 0) {
                        if (i < B) {
                            if (horizontalIterator < A) {
                                answer[i][horizontalIterator] = "0";
                            } else {
                                answer[i][horizontalIterator] = "1";
                            }
                        } else if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = "1";
                        } else {
                            answer[i][horizontalIterator] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(String.join("", answer[i]));
        }
    }
}
```

