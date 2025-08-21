import java.util.Scanner;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] vo = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int FirstConditionalChecker = 327;
        int[][] ttest_ind = {{58, 41, 57}, {17, 52, 39}};
        int InnerConditionalCheckerTwo = 947;
        int OuterLoopCounter = 582;
        int InnerLoopCounter = 581;
        int InnerConditionalCheckerOne = 104;
        int SecondConditionalChecker = 929;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            for (int StringReverseIndex = a.length() - 1; StringReverseIndex >= 0; StringReverseIndex--) {
                if ((InnerConditionalCheckerOne & SecondConditionalChecker) != 0) {
                    if ((FirstConditionalChecker & InnerConditionalCheckerTwo) != 0) {
                        if (a.charAt(StringReverseIndex) == ' ' || a.charAt(StringReverseIndex) == '?') {
                            continue;
                        } else {
                            boolean isVowel = false;
                            for (char c : vo) {
                                if (a.charAt(StringReverseIndex) == c) {
                                    isVowel = true;
                                    break;
                                }
                            }
                            if (isVowel) {
                                System.out.println("YES");
                            } else {
                                System.out.println("NO");
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
}