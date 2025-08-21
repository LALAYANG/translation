```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        char[][] answer = new char[H][W];
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
                                answer[i][horizontalIterator] = '0';
                            } else {
                                answer[i][horizontalIterator] = '1';
                            }
                        } else if (horizontalIterator < A) {
                            answer[i][horizontalIterator] = '1';
                        } else {
                            answer[i][horizontalIterator] = '0';
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            System.out.println(String.valueOf(answer[i]));
        }
    }
}
```

