import java.util.Scanner;

public class atcoder_AGC038_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
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